function CategoryController($scope, $http){
    $scope.categorys = [{
        id : 1,
        name : "床上用品",
        isparent : true,
        parent : "",
        imageurl : null
    },{
        id : 2,
        name : "被褥",
        isparent : false,
        parent : "床上用品",
        imageurl : null
    },{
        id : 3,
        name : "家具",
        isparent : true,
        parent : "",
        imageurl : null
    },{
        id : 4,
        name : "桌子",
        isparent : false,
        parent : "家具",
        imageurl : null
    },{
        id : 5,
        name : "椅子",
        isparent : false,
        parent : "家具",
        imageurl : null
    }];

    $scope.viewCategoryList = true;
    $scope.viewNewCategory = false;


    $scope.showCategoryList = function(){
        $scope.viewCategoryList = true;
        $scope.viewNewCategory = false;
    };

    $scope.showNewCategory = function(){
        $scope.viewCategoryList = false;
        $scope.viewNewCategory = true;
    };


    $scope.modifyCategory = function(p){
        console.log(id);
    };

    $scope.deleteCategory = function(p){

        if (window.confirm("确定删除这个分类？")){
            var index;
            for (var i in $scope.categorys){
                if ($scope.categorys[i].id = p.id){
                    index = i;
                    break;
                }
            }
            if (index){
                $scope.categorys.splice(index, 1);
            }
        }
    };

    $scope.addSubCategory = function(p){
        $scope.category = {
            name : "",
            isparent : false,
            parent : p,
            imageurl : ""
        };
        this.showNewCategory();
    };

    $scope.addCategory = function(){
        $scope.categorys.push(angular.copy($scope.category));
    };
}