function MenuController($scope){

    $scope.menus = [{
        id : 1,
        name : "首页",
        isparent : true,
        parent : "",
        imageurl : null,
        url : "",
        opennew : true
    },{
        id : 2,
        name : "招商",
        isparent : true,
        parent : "",
        imageurl : null,
        url : "",
        opennew : true
    },{
        id : 3,
        name : "产品",
        isparent : true,
        parent : "",
        imageurl : null,
        url : "",
        opennew : true
    }];

    $scope.viewMenuList = true;
    $scope.viewNewMenu = false;


    $scope.showMenuList = function(){
        $scope.viewMenuList = true;
        $scope.viewNewMenu = false;
    };

    $scope.showNewMenu = function(){
        $scope.viewMenuList = false;
        $scope.viewNewMenu = true;
    };


    $scope.modifyMenu = function(p){
        console.log(id);
    };

    $scope.deleteMenu = function(p){

        if (window.confirm("确定删除这个分类？")){
            var index;
            for (var i in $scope.menus){
                if ($scope.menus[i].id = p.id){
                    index = i;
                    break;
                }
            }
            if (index){
                $scope.menus.splice(index, 1);
            }
        }
    };

    $scope.addSubMenu = function(p){
        $scope.menu = {
            name : "",
            isparent : false,
            parent : p,
            imageurl : ""
        };
        this.showNewMenu();
    };

    $scope.addMenu = function(){
        $scope.menus.push(angular.copy($scope.menu));
    };
}