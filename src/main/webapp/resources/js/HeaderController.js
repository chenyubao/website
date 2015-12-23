function HeaderController($scope){
    $scope.choose = {
        activeproduct : "active",
        activecategory : "",
        activemenu : ""
    };
    $scope.active = function(activeClass){
        for (var c in $scope.choose){
            $scope.choose[c] = "";
        }
        $scope.choose[activeClass] = "active";
    }
}