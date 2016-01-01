<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="ment">
    <div class="an"><img src="/front/boyang/public/image/nav.jpg"></div>
    <div class="nr" style="width:100%">
        <div class="ment-el">
            <div class="ment-ico"><span class="wb"><a href="#"><img src="/front/boyang/public/image/ment-wb.jpg"></a></span>
                <span class="wx"><a href="#"><img src="/front/boyang/public/image/ment-wx.jpg"></a></span></div>
        </div>
        <!--el-->
        <ul>
            <li><a href="/">首页</a></li>
            <li><a href="/front/boyang/productList.jsp">产品展示</a></li>
            <li><a href="/front/boyang/about.jsp">关于欢欢</a></li>
            <li><a href="/front/boyang/companyNews.jsp">企业动态</a></li>
            <li><a href="/front/boyang/attractInvestment.jsp">招商加盟</a></li>
            <li><a href="/Contact">联系我们</a></li>
            <!--<li><a href="http://www.beyond.cn/" target="_blank">网上商城</a></li>-->
        </ul>
    </div>
    <div class="wb-tc"><img src="/front/boyang/public/image/wb.jpg"></div>
    <div class="wx-tc"><img src="/front/boyang/public/image/wx-top.jpg"></div>
</div>
<script>
    $('.ment-el span.wx').mouseenter(function () {
        $('.wx-tc').stop().show();
    })
    $('.ment-el span.wx').mouseleave(function () {
        $('.wx-tc').stop().hide();
    })

    $('.ment-el span.wb').mouseenter(function () {
        $('.wb-tc').stop().show();
    })

    $('.ment-el span.wb').mouseleave(function () {
        $('.wb-tc').stop().hide();
    })
</script>
