<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <link rel="shortcut icon" href="favicon.ico">
    <title>欢欢家纺官方网站,欢欢,欢欢家纺,赵雅芝,玉天丝,超柔磨毛,天然木本,婚庆,套件,四件套,花卉,跨界,春夏新品,秋冬新品 </title>
    <meta name="keywords" content="欢欢,欢欢家纺,赵雅芝,玉天丝,超柔磨毛,天然木本,婚庆,套件,四件套,花卉,跨界,春夏新品,秋冬新品">
    <meta name="description" content="欢欢,欢欢家纺,赵雅芝,玉天丝,超柔磨毛,天然木本,婚庆,套件,四件套,花卉,跨界,春夏新品,秋冬新品">
    <jsp:include page="resources.jsp" flush="true"/>
    <script type="text/javascript">
        function uaredirect(murl) {
            try {
                if (document.getElementById("bdmark") != null) {
                    return;
                }
                var urlhash = window.location.hash;
                if (!urlhash.match("fromapp")) {
                    //alert(navigator.userAgent);
                    if ((navigator.userAgent.match(/(iPhone|iPod|Android|ios|iPad|x11)/i))) {
                        location.replace(murl);
                    }
                }
            } catch (err) {
            }
        }
        uaredirect("http://www.china-beyond.com/Wap/");
    </script>
</head>

<body>

<div id="main">
    <div id="header">
        <div class="flash">
            <div class="memo"></div>
            <div class="nexthome" style="display: none;"><img src="front/boyang/public/image/next-home.png"></div>
            <div class="block_home_slider">
                <div id="home_slider" class="flexslider">
                    <div class="flex-viewport" style="overflow: hidden; position: relative;">
                        <ul class="slides" style="width: 600%; transition-duration: 0s; transform: translate3d(-2850px, 0px, 0px);">
                            <li class="" style="height: 716px; width: 1425px; float: left; display: block;">
                                <div class="slide">
                                    <img src="front/boyang/public/image/banner.jpg" class="bannertu" alt="" style="height: 716px;">
                                </div>
                            </li>
                            <li class="" style="height: 716px; width: 1425px; float: left; display: block;">
                                <div class="slide">
                                    <img src="front/boyang/public/image/banner2.jpg" class="bannertu" alt="" style="height: 716px;">
                                </div>
                            </li>
                            <li class="flex-active-slide" style="height: 716px; width: 1425px; float: left; display: block;">
                                <div class="slide">
                                    <img src="front/boyang/public/image/video-bg.jpg" class="bannertu" alt="" style="height: 716px;">
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>

                <script type="text/javascript">
                    $(function () {
                        $('#home_slider').flexslider({
                            animation: 'slide',
                            controlNav: true,
                            directionNav: true,
                            slideshowSpeed: 10000,
                            animationLoop: false,
                            slideshow: true,
                            useCSS: true
                        });
                    });
                    var oKyheight = window.screen.availHeight + 40;
                    var oHeight = $(window).height();
                    var oHeight_b = oHeight;
                    var oWidth = $(window).width();

                    $("#home_slider video").attr({'width': oWidth, 'height': oKyheight});
                    $("#home_slider ul li").height(oHeight_b);
                    $("#home_slider img.bannertu").height(oHeight_b);
                </script>
            </div>

        </div>
        <div id="nav">
            <ul>
                <li class="li1"><a href="/Pro"><em>产品展示</em><i></i><span>产品展示</span></a></li>
                <li class="li2"><a href="/About"><em>关于欢欢</em><i></i><span>关于欢欢</span></a></li>
                <li class="li3"><a href="/News"><em>企业动态</em><i></i><span>企业动态</span></a></li>
                <li class="li4"><a href="/Join"><em>招商加盟</em><i></i><span>招商加盟</span></a></li>
                <li class="li5"><a href="/Jobs"><em>人才战略</em><i></i><span>人才战略</span></a></li>
                <li class="li6"><a href="/Contact"><em>联系我们</em><i></i><span>联系我们</span></a></li>
            </ul>
        </div>
    </div>
    <!--header-->

    <jsp:include page="header.jsp" flush="true"/>
    <jsp:include page="footer.jsp" flush="true"/>
</div>
<!--main-->


<script>
    $(document).ready(function (e) {
        var oWidth = $('body').width();
        var oHeight = parseInt(oWidth * 706 / 1440 + 20) + 'px';
        var oHeightb = $(window).height() - 57;

        //nav
        $("#nav li").mouseenter(function () {
            $(this).find('em').css({opacity: 0, top: 0, right: '-75px'})
            $(this).find('em').stop().animate({opacity: 1, top: '20px', right: '0'}, 1000)
        })

        //about
        $("li.tu7").mouseenter(function () {
            $(this).find('span.cn').css({bottom: "-31px"});
            $(this).find('span.en').css({bottom: "-72px"});
            $(this).find('span.more').css({bottom: "-26px"});

            $("li.tu7").find('span.cn').animate({
                bottom: [178, "easeInOutBack"]
            }, 200, function () {
                $("li.tu7").find('span.en').animate({
                    bottom: [100, "easeInOutBack"]
                }, 300, function () {
                    $("li.tu7").find('span.more').animate({bottom: [53, "easeInOutBack"]}, 500)
                })
            });

        })

        //news
        $("#list li:eq(0)").click(function () {
            $("#list li:eq(1)").removeClass('action');
            $(this).addClass('action');
            $("#box .yd").stop().animate({left: [0, "easeInOutBack"]}, 500)
        })

        $("#list li:eq(1)").click(function () {
            $("#list li:eq(0)").removeClass('action');
            $(this).addClass('action');
            $("#box .yd").stop().animate({left: [-1000, "easeInOutBack"]}, 500)
        })

    });
</script>

</body>
</html>