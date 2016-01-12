function ProductController($scope, $http){
    $scope.products= [{
        id : 1,
        name : "棉被",
        imageurl : "/resources/image/default.jpg",
        category : "床上用品",
        description : '好好好'
    },{
        id : 2,
        name : "枕头",
        imageurl : "",
        category : "床上用品",
        description : '好好好'
    },{
        id : 3,
        name : "床单",
        imageurl : "/resources/image/default.jpg",
        category : "床上用品",
        description : '好好好'
    }];

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