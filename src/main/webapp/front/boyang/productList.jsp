<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Integer pageNo = 1;

%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <link rel="shortcut icon" href="favicon.ico">
    <title>欢欢新闻-欢欢家纺官方网站,欢欢,欢欢家纺,赵雅芝,玉天丝,超柔磨毛,天然木本,婚庆,套件,四件套,花卉,跨界,春夏新品,秋冬新品 </title>
    <meta name="keywords" content="欢欢,欢欢家纺,赵雅芝,玉天丝,超柔磨毛,天然木本,婚庆,套件,四件套,花卉,跨界,春夏新品,秋冬新品">
    <meta name="description" content="欢欢,欢欢家纺,赵雅芝,玉天丝,超柔磨毛,天然木本,婚庆,套件,四件套,花卉,跨界,春夏新品,秋冬新品">
    <link href="/front/boyang/public/cs/base.css" rel="stylesheet" type="text/css">
    <link href="/front/boyang/public/cs/layout.css" rel="stylesheet" type="text/css">
    <link href="/front/boyang/public/cs/typography.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="/front/boyang/public/js/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="/front/boyang/public/js/jquery.masonry.js"></script>
    <script type="text/javascript" src="/front/boyang/public/js/jquery.infinitescroll.js"></script>
    <style type="text/css">
        .fl{float:left;}.fr{float:right;}
        .clearfix:after{content:".";display:block;height:0;clear:both;visibility:hidden;}
        .clearfix{display:inline-table;}
        *html .clearfix{height:1%;}
        .clearfix{display:block;}
        *+html .clearfix{min-height:1%;}
        .demo{margin:0 auto;}

        /* item_list */
        .item_list{position:relative;padding:0 0 50px;}
        .item{
            width:266px; background:#ceb493; overflow:hidden; margin:15px 0 0 0;

            box-shadow:0 1px 3px rgba(34, 25, 25, 0.2);
        }
        .item_t{padding:10px 8px 0;}
        .item_t .img{background-color:#FFFFFF;margin:0 auto;position:relative;width:250px;}
        .item_t .img img{ width:250px;}
        .item_t .img a{display:block;}
        .item_t .img a:hover{background:#000;}
        .item_t .img a:hover img{  filter:alpha(opacity=80);-khtml-opacity:0.8;opacity:0.8;-webkit-transition:all 0.3s ease-out;-khtml-transition:all 0.3s ease-out;}
        .item_t .price{
            position:absolute;bottom:10px;right:0px;background-color:rgba(0, 0, 0, 0.2);color:#FFF;
            filter:progid:DXImageTransform.Microsoft.gradient(startcolorstr=#33000000, endcolorstr=#33000000);
        }
        .item .btns{display:none;}
        .img_album_btn{top:0px;right:0px;position:absolute;background:#ff6fa6;color:#ffffff;height:20px;line-height:20px;width:56px;border-radius:3px;}
        .img_album_btn:hover{color:#fff;}
        .item_t .title_bt{ height:37px;line-height:37px; color:#fff; width:250px; position:relative}
        .item_t .title_bt p.name{ width:250px; height:37px; line-height:37px; color:#fff; white-space:nowrap; overflow:hidden; text-overflow:ellipsis;}
        .item_t .title_bt span.ly{ position:absolute; top:14px; width:48px; height:14px; display:block; right:48px; line-height:14px; background:url(/front/boyang/public/image/news/news-l.png) no-repeat; text-indent:20px;}
        .item_t .title_bt a.zan{ position:absolute; top:14px; width:48px; height:14px; display:block; right:0px; line-height:14px; background:url(/front/boyang/public/image/news/news-z.png) no-repeat; color:#fff; text-indent:20px;}


        /* more */
        #more{display:block;margin:10px auto 20px;}

        /* infscr-loading */
        #infscr-loading{bottom:-10px;left:45%;position:absolute;text-align:center;height:20px;line-height:20px;z-index:100;width:120px;}

        /* page */
        .page{display:none;font-size:18px;height:60px;text-align:center;margin:20px 0 0 0;}
        .page_num a,.page_num span{margin:0 2px;background:url("/front/boyang/public/image/page.png") no-repeat;display:inline-block;width:30px;height:28px;line-height:26px;overflow:hidden;}
        .page_num a{background-position:-65px 0;color:#FF3333;overflow:hidden;}
        .page_num .prev{background-position:1px -33px;}
        .page_num .unprev{background-position:1px 0;cursor:default;}
        .page_num .next{background-position:-32px 0;}
        .page_num .unnext{background-position:-32px -33px;cursor:default;}
        .page_num .current{background-position:-99px 0;color:#FFFFFF;}
        .page_num .etc{background-position:-172px 8px;}

        /* to_top */
        .to_top a,.to_top a:hover{background:url("/front/boyang/public/image/gotop.png") no-repeat}
        .to_top a{
            background-position:0 0;float:left;height:50px;overflow:hidden;width:50px;position:fixed;bottom:35px;cursor:pointer;right:20px;
            _position:absolute;
            _right:auto;
            _left:expression(eval(document.documentElement.scrollLeft+document.documentElement.clientWidth-this.offsetWidth)-(parseInt(this.currentStyle.marginLeft, 10)||0)-(parseInt(this.currentStyle.marginRight, 10)||20));
            _top:expression(eval(document.documentElement.scrollTop+document.documentElement.clientHeight-this.offsetHeight-(parseInt(this.currentStyle.marginTop, 10)||20)-(parseInt(this.currentStyle.marginBottom, 10)||20)));
        }
        .to_top a:hover{background-position:-51px 0px;}
    </style>
    <script type="text/javascript">
        var isWidescreen=screen.width>=1280;
        if(isWidescreen){document.write("<style type='text/css'>.demo{width:1114px;}</style>");}
    </script><style type="text/css">.demo{width:1114px;}</style>

    <script type="text/javascript">
        function item_masonry(){
            $('.item img').load(function(){
                $('.infinite_scroll').masonry({
                    itemSelector: '.masonry_brick',
                    columnWidth:266,
                    gutterWidth:15
                });
            });

            $('.infinite_scroll').masonry({
                itemSelector: '.masonry_brick',
                columnWidth:266,
                gutterWidth:15
            });
        }

        $(function(){
            function item_callback(){
                $('.item').mouseover(function(){
                    $(this).css('box-shadow', '0 1px 5px rgba(35,25,25,0.5)');
                    $('.btns',this).show();
                }).mouseout(function(){
                    $(this).css('box-shadow', '0 1px 3px rgba(34,25,25,0.2)');
                    $('.btns',this).hide();
                });
                item_masonry();
            }
            item_callback();
            $('.item').fadeIn();
            var sp = 1
            $(".infinite_scroll").infinitescroll({
                navSelector  	: "#more",
                nextSelector 	: "#more a",
                itemSelector 	: ".item",
                debug           : true,
                loading:{
                    img: "/front/boyang/public/image/masonry_loading_1.gif",
                    msgText: ' ',
                    finishedMsg: '',
                    finished: function(){
                        /*
                        if(sp>=5){ //到第5页结束事件
                            $("#more").remove();
                            $("#page").show();
                            $(window).unbind('.infscr');
                        }*/

                        $("#infscr-loading").hide();
                    }
                },
                errorCallback : function(){
                    $("#page").show();
                }
            },function(newElements){
                alert(newElements);
                var $newElems = $(newElements);
                $('.infinite_scroll').masonry('appended', $newElems, false);
                $newElems.fadeIn();
                item_callback();
                sp++;
                $("#more a").attr("href", "/web/getProductList/"+sp);
                return;
            });
        });
    </script>
</head>

<body>
<jsp:include page="header.jsp" flush="true"/>
<div class="flashn"><img src="/front/boyang/public/image/banner-n.jpg" width="100%"></div><!--flashn-->
<div class="demo clearfix">
    <div class="item_list infinite_scroll masonry" style="position: relative; height: 1226px;">
        <div class="item masonry_brick masonry-brick" style="position: absolute; top: 0px; left: 0px; box-shadow: rgba(34, 25, 25, 0.2) 0px 1px 3px;">
            <div class="item_t">
                <div class="img">
                    <a href="/News/views/nid/154"><img alt="“浙江6频道彩虹计划”欢欢家纺1300条暖芯冬被献爱心" src="/Uploads/20151214/20151214162248_8383.jpg"></a>
                </div>
                <div class="title_bt">
                    <p class="name">“浙江6频道彩虹计划”欢欢家纺1300条暖芯冬被献爱心------</p>
                    <span class="ly" style="display:none">0</span>
                </div>
            </div>
        </div>

        <div id="infscr-loading"><img alt="Loading..." src="/front/boyang/public/image/masonry_loading_1.gif"><div> </div></div>
    </div>
    <div id="more" style="display: none;"><a href="/web/getProductList/2"></a></div>
</div>

<jsp:include page="footer.jsp" flush="true"/>

</body>
</html>