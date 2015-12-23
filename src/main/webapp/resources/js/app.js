angular.module("website", []).config(["$routeProvider", function($routeProvider){
    $routeProvider.when('/product',{
        templateUrl : 'resources/js/product/product.html',
        controller : ProductController
    }).when('/category',{
        templateUrl : 'resources/js/category/category.html',
        controller : CategoryController
    }).when('/menu',{
        templateUrl : 'resources/js/menu/menu.html',
        controller : MenuController
    }).otherwise({
        redirectTo: '/product'
    });
}]).filter("defaultImage", function(){
    return function(input){
        if (!input){
            return "/resources/image/default.jpg";
        } else {
            return input;
        }
    }
});
