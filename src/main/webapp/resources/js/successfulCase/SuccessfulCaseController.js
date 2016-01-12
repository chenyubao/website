function ProductController($scope, $http){
    var self = this;
    $scope.currentPage = 1;
    $scope.totalPage = 1;
    $http.get("/web/product/getAllProductList/0").success(function(resp){
        console.log(resp);
        $scope.products = resp;
    });

    $http.get("/web/product/getTotalPage").success(function(resp){
        console.log(resp);
        $scope.totalPage = resp;
    });

    $scope.goToFirstPage = function(){
        $scope.currentPage = 1;
        self.goToPage($scope.currentPage);
    };

    $scope.goToNextPage = function(){
        $scope.currentPage < $scope.totalPage?$scope.currentPage++ : $scope.currentPage;
        self.goToPage($scope.currentPage);
    };

    $scope.goToLastPage = function(){
        $scope.currentPage > 1 ?$scope.currentPage-- : $scope.currentPage;
        self.goToPage($scope.currentPage);
    };

    $scope.goToEndPage = function(){
        $scope.currentPage = $scope.totalPage;
        self.goToPage($scope.currentPage);
    };

    this.goToPage = function(pageNo){
        $http.get("/web/product/getAllProductList/" + (pageNo-1)).success(function(resp){
            console.log(resp);
            $scope.products = resp;
        });
    };

    $scope.modifyProduct = function(id){
        console.log(id);
    };

    $scope.deleteProduct = function(p){

        if (window.confirm("确定删除这个产品？")){
            var index;
            for (var i in $scope.products){
                if ($scope.products[i].id = p.id){
                    index = i;
                    break;
                }
            }
            if (index){
                $scope.products.splice(index, 1);
            }
        }
    }

    $scope.viewProductList = true;
    $scope.viewNewProduct = false;

    $scope.showProductList = function(){
        $scope.viewProductList = true;
        $scope.viewNewProduct = false;
    };

    $scope.showNewProduct = function(){
        $scope.viewProductList = false;
        $scope.viewNewProduct = true;
    };

    $scope.addProduct = function(){
        $scope.products.push(angular.copy($scope.product));
        $scope.product = {
            name : "",
            imageurl : "",
            category : "",
            description : ""
        };
    }
}