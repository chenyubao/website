<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="zh-cn">
<head>
    <Meta http-equiv="Content-Type" Content="text/html; Charset=utf-8">

    <script src="/resources/jquery/jquery-1.11.3.js"></script>
    <script src="/resources/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/main.css">
    <title>官网后台</title>
</head>
<body ng-app="website">

<header class="navbar navbar-inverse navbar-fixed-top bs-docs-nav" role="banner" ng-controller="HeaderController">
    <div class="container">
        <div class="navbar-header">
            <button class="navbar-toggle" type="button" data-toggle="collapse" data-target=".bs-navbar-collapse"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
            <a href="Index.html" class="navbar-brand">官网后台</a> </div>
        <nav class="collapse navbar-collapse bs-navbar-collapse" role="navigation">
            <ul class="nav navbar-nav">
                <li ng-click="active(activeproduct)" class="{{activeproduct}}"> <a href="#/product">产品管理</a> </li>
                <li ng-click="active(activecategory)" class="{{activecategory}}"> <a href="#/category">类别管理</a> </li>
                <li ng-click="active(activemenu)" class="{{activemenu}}"> <a href="#/menu">菜单管理</a> </li>
            </ul>
        </nav>

    </div>
</header>
{{activeproduct}},{{activecategory}},{{activemenu}}
<div class="container" ng-view></div>
<script src="http://code.angularjs.org/angular-1.0.1.min.js" type="application/javascript"></script>
<script src="/resources/js/app.js"></script>
<script src="/resources/js/product/ProductController.js"></script>
<script src="/resources/js/category/CategoryController.js"></script>
<script src="/resources/js/menu/MenuController.js"></script>
<script src="/resources/js/HeaderController.js"></script>
</body>
</html>
