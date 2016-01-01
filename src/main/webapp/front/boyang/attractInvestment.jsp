<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <link rel="shortcut icon" href="favicon.ico">
    <title>招商加盟-欢欢家纺官方网站,欢欢,欢欢家纺,赵雅芝,玉天丝,超柔磨毛,天然木本,婚庆,套件,四件套,花卉,跨界,春夏新品,秋冬新品 </title>
    <meta name="keywords" content="欢欢,欢欢家纺,赵雅芝,玉天丝,超柔磨毛,天然木本,婚庆,套件,四件套,花卉,跨界,春夏新品,秋冬新品">
    <meta name="description" content="欢欢,欢欢家纺,赵雅芝,玉天丝,超柔磨毛,天然木本,婚庆,套件,四件套,花卉,跨界,春夏新品,秋冬新品">
    <jsp:include page="resources.jsp" flush="true"/>

    <link rel="stylesheet" type="text/css" href="/front/boyang/public/cs/lrtk.css">
    <script src="/front/boyang/public/js/jquery.superslide.2.1.1.js" type="text/javascript"></script>
    <style>

        .join-cgal{ width:100%; height:600px; background:url(/front/boyang/public/image/join-cgal.jpg) no-repeat center top; position:relative}
        .join-cgal .left{ width:463px; height:296px; position:absolute; z-index:9; left:-463px; top:190px;}
        .join-cgal .right{ width:470px; height:390px; position:absolute; z-index:9; right:-470px; top:190px;}
        .join-cgal .right ul{ height:320px; position:relative; overflow:hidden}
        .join-cgal .right ul li{ height:30px; width:470px; position:absolute; bottom:-30px; line-height:21px;}
        .join-cgal .right ul li span{ width:72px; height:21px; background:url(/front/boyang/public/image/time-bg.png) no-repeat; display:block; float:left; color:#fff; text-align:center; line-height:21px;}

        .join-jmzc{ width:100%; height:600px; background:#fff; position:relative}
        .join-jmzc .left{ width:585px; height:535px; position:absolute; z-index:9; left:-585px; top:52px;}
        .join-jmzc .left .title{ height:50px; color:#000; font-size:30px; font-family:'黑体'; display:block}
        .join-jmzc .right{ width:433px; height:509px; position:absolute; z-index:8; right:-433px; top:32px;}

        .join-jmzc2{ width:100%; height:600px; background:url(/front/boyang/public/image/join-jmzc2.jpg) no-repeat center top; position:relative}
        .join-jmzc2 .left{ width:534px; height:397px; position:absolute; z-index:9; left:-534px; top:58px;}
        .join-jmzc2 .right{ width:492px; height:397px; position:absolute; z-index:8; right:-492px; top:32px;}

        .join-sqjm{ width:100%; height:600px; background:#fff; position:relative; background:url(/front/boyang/public/image/join-sqjm.jpg) no-repeat center top}
        .join-sqjm .left{ width:355px; height:250px; position:absolute; z-index:9; left:-355px; top:177px;}
        .join-sqjm .left ul li{ height:23px; margin-bottom:6px;}
        .join-sqjm .left ul li span{ width:145px; height:23px; float:left; display:block; float:left; text-align:right; line-height:23px; color:#5e5d5b; font-size:12px; font-family:'微软雅黑'}
        .join-sqjm .left ul li .inp{ height:21px; width:193px; background:#fff; border:1px solid #aa917e; float:left; margin-left:4px; padding-left:10px; line-height:21px;}
        .join-sqjm .right{ width:355px; height:250px; position:absolute; z-index:9; right:-355px; top:177px;}
        .join-sqjm .right ul li{ height:23px; margin-bottom:6px;}
        .join-sqjm .right ul li span{ width:145px; height:23px; float:left; display:block; float:left; text-align:right; line-height:23px; color:#5e5d5b; font-size:12px; font-family:'微软雅黑'}
        .join-sqjm .right ul li .inp{ height:21px; width:193px; background:#fff; border:1px solid #aa917e; float:left; margin-left:4px; padding-left:10px; line-height:21px;}
        .join-sqjm .side{ clear:both; width:770px; height:140px; position:absolute; z-index:9; bottom:-140px; left:50%; margin-left:-385px; clear:both}
        .join-sqjm .side p.title{ height:38px; line-height:38px; text-align:center; color:#5e5d5b}
        .join-sqjm .side .sumb{ width:260px; height:30px; margin:0 auto; margin-top:40px;}
        .join-sqjm .side .sumb .btn{
            float:left;
            cursor:pointer;
            width:125px;
            height:27px;
            text-align:center;
            line-height:27px;
            color:#fff;
            margin-left:4px;
            border:none;
            background-color: #5e5d5b;
        }

    </style>
    <script>
        var oHeight = $(window).height();
        var oWidht = $(window).width();

    </script>
    <link media="screen" rel="stylesheet" href="/front/boyang/public/cs/colorbox.css">
    <script src="/front/boyang/public/js/jquery.colorbox.js"></script>
    <script>
        $(document).ready(function(){
            $("a[rel='exps']").colorbox();
        });
    </script>
</head>
<body>

<jsp:include page="header.jsp" flush="true"/>
<div style="height: 404px;" class="flashn">
    <img style="height: 404px;" src="/front/boyang/public/image/banner-n.jpg" width="100%">
</div>
<!--flashn-->
<!--成功案例-->
<div class="join-cgal" id="join-cgal">
    <!--图片轮播-->
    <div class="left">
        <div class="www51buycom">
            <ul style="position: relative; width: 463px; height: 305px;" class="51buypic">
                <li style="position: absolute; width: 463px; left: 0px; top: 0px; display: none;">
                    <a href="/Join/views/jid/17" target="_blank"><img src="/Uploads/20150728/20150728103525_2324.jpg" height="296" width="463"></a>
                </li>
            </ul>
            <div class="num">
                <ul>
                    <li class="">1</li>
                </ul>
            </div>
        </div>
        <script>
            /*鼠标移过，左右按钮显示*/
            $(".www51buycom").hover(function(){
                $(this).find(".prev,.next").fadeTo("show",0.1);
            },function(){
                $(this).find(".prev,.next").hide();
            })
            /*鼠标移过某个按钮 高亮显示*/
            $(".prev,.next").hover(function(){
                $(this).fadeTo("show",0.7);
            },function(){
                $(this).fadeTo("show",0.1);
            })
            $(".www51buycom").slide({ titCell:".num ul" , mainCell:".51buypic" , effect:"fold", autoPlay:true, delayTime:700 , autoPage:true });
        </script>
    </div>


    <div class="right">
        <ul id="ul1">
            <li>
                <span>2015-06-29</span>&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="/Join/views/jid/15">奔驰中的黑马——欢欢家纺台州直营团队</a>
            </li>
            <li>
                <span>2015-07-28</span>&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="/Join/views/jid/17">坚持的力量——欢欢家纺山西运城代理乔俊霞</a>
            </li>
            <li>
                <span>2014-10-27</span>&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="/Join/views/jid/14">欢欢家纺2014销售金奖获奖团队</a>
            </li>
            <li>
                <span>2014-09-29</span>&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="/Join/views/jid/13">欢欢家纺海宁加盟商——潘爱华</a>
            </li>
            <li>
                <span>2014-09-29</span>&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="/Join/views/jid/12">欢欢家纺的品牌名片——宁波直营</a>
            </li>
            <li>
                <span>2014-09-29</span>&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="/Join/views/jid/11">杭州欢欢家纺 激流勇进看今朝</a>
            </li>
            <li>
                <span>2015-07-28</span>&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="/Join/views/jid/16">坚持的力量——欢欢家纺山西运城代理乔俊霞</a>
            </li>
            <li>
                <span>2014-09-29</span>&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="/Join/views/jid/10">欢欢家纺云南市场演绎速度与激情</a>
            </li>
            <li>
                <span>2014-09-29</span>&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="/Join/views/jid/9">为事业插上激情和梦想的翅膀——合肥加盟商邱亮</a>
            </li>
            <li>
                <span>2014-09-29</span>&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="/Join/views/jid/8">为事业插上激情和梦想的翅膀——云南玉溪加盟商曹钶</a>
            </li>
        </ul>
    </div>
</div>

<div class="join-jmzc" id="join-jmzc">
    <div class="left">
        <table align="center" border="0" width="96%">
            <tbody>
            <tr class="firstRow">
                <td colspan="3" align="left"><img src="/front/boyang/public/image/jiamengzhichi.jpg"
                                                  title="1411546788190402.jpg" alt="`3YQW@S]4WAM9{~$R5K]0LY.jpg"></td>
            </tr>
            <tr class="firstRow">
                <td align="left"><p style="text-align:center"><img
                        src="/front/boyang/public/image/yuanquan.jpg" title="1411540209243315.jpg"
                        alt="yuanquans.jpg"></p></td>
                <td align="left">&nbsp;</td>
                <td valign="top"><p style="line-height:24px;"><span style="color: #5e5d5b; font-size: 14px;"><strong>统一的形象设计支持</strong></span>
                </p></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td><p style="line-height:24px;">2012年欢欢家纺终端形象全面升级，并迅速在全国各个片区铺展，霸现“潮”牌家纺的时尚推动力；
                    公司总部提供免费形象设计、完备的装修补贴方案及开业支持。</p></td>
            </tr>
            <tr>
                <td align="left" valign="middle"><p style="text-align:center"><img
                        src="/front/boyang/public/image/yuanquan.jpg" title="1411540221437262.jpg"
                        alt="yuanquans.jpg"></p></td>
                <td align="left" valign="middle">&nbsp;</td>
                <td valign="top"><p style="line-height:24px;"><span style="color: #5e5d5b; font-size: 14px;"><strong>贴心的襁褓培育支持</strong></span>
                </p></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td><p style="line-height:24px;">水平不断提升的督导为其提供专业的服务和指导，从选址，商业机会的判断到经营的方略上参与并支持，保证其良性和高速发展。</p></td>
            </tr>
            <tr>
                <td align="left"><p style="text-align:center"><img
                        src="/front/boyang/public/image/yuanquan.jpg" title="1411540221437262.jpg"
                        alt="yuanquans.jpg"></p></td>
                <td>&nbsp;</td>
                <td><p style="line-height:24px;"><span
                        style="color: #5e5d5b; font-size: 14px;"><strong>专业的营销策划支持</strong> </span></p></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>完整统一的营销策划方案，力度强大的广告宣传，契合当下的活动形式，提供系列的促销产品更新支持，占领市场主动权。</td>
            </tr>
            <tr>
                <td align="left"><p style="text-align:center"><img
                        src="/front/boyang/public/image/yuanquan.jpg" title="1411540221437262.jpg"
                        alt="yuanquans.jpg"></p></td>
                <td>&nbsp;</td>
                <td><span style="color: #5e5d5b; font-size: 14px;"><strong>系统的培训管理服务</strong></span></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>公司派专人定期为各地加盟商提供培训指导，包括营销方法，销售交流和经验总结。</td>
            </tr>
            <tr>
                <td align="left"><p style="text-align:center"><img
                        src="/front/boyang/public/image/yuanquan.jpg" title="1411540221437262.jpg"
                        alt="yuanquans.jpg"></p></td>
                <td>&nbsp;</td>
                <td><span style="color: #5e5d5b; font-size: 14px;"><strong>快捷的物流配送服务</strong></span></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>合作多年的完备物流配送体系，快捷，准确，高效。</td>
            </tr>
            <tr>
                <td align="left"><p style="text-align:center"><img
                        src="/front/boyang/public/image/yuanquan.jpg" title="1411540221437262.jpg"
                        alt="yuanquans.jpg"></p></td>
                <td>&nbsp;</td>
                <td><span style="color: #5e5d5b; font-size: 14px;"><strong>成熟的会员管理服务</strong></span></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>定期开展相关活动，细心，贴心，顶级服务享受。</td>
            </tr>
            <tr>
                <td colspan="3"><img src="/front/boyang/public/image/jiamengdianhua.jpg"
                                     title="1411872646779316.jpg" alt="jmdh3.jpg">&nbsp;</td>
            </tr>
            </tbody>
        </table>
    </div>
    <!--left-->
    <div class="right"><img src="/front/boyang/public/image/jmzc-right.jpg"></div>
</div>
<!--jmzc-->

<div class="join-jmzc2" id="join-jmzc2">
    <div class="left">
        <table align="center" border="0" width="96%">
            <tbody>
            <tr class="firstRow">
                <td colspan="3" align="left"><img src="/front/boyang/public/image/jiamengliucheng.png"
                                                  title="1411548171459761.png" alt="加盟流程.png"></td>
            </tr>
            <tr class="firstRow">
                <td colspan="3" align="left"><p style="line-height:24px;"><span
                        style="font-size: 14px; color: #c1a164;">为了能够确保您的门店良好运作，顺利达成预期盈利能力，共同经营好欢欢事业，请您在申请前，做好如下准备：<br><br></span>
                </p></td>
            </tr>
            <tr class="firstRow">
                <td align="left"><p style="text-align:center"><img
                        src="/front/boyang/public/image/1.png" title="1411547835436271.png"
                        alt="1.png"></p></td>
                <td align="left">&nbsp;</td>
                <td valign="top"><p style="line-height:24px;"><span style="color: #5e5d5b; font-size: 14px;"><strong>充分的市场调查</strong></span>
                </p></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td><p style="line-height:24px;">商业环境的商业网点的分布；居民的消遣习惯、消费水平和购买力；当地原有床品品牌的层次结构和市场占有情况。</p></td>
            </tr>
            <tr>
                <td align="left" valign="middle"><p style="text-align:center"><img
                        src="/front/boyang/public/image/2.png" title="1411547840608787.png"
                        alt="2.png"></p></td>
                <td align="left" valign="middle">&nbsp;</td>
                <td valign="top"><p style="line-height:24px;"><span style="color: #5e5d5b; font-size: 14px;"><strong>符合经营要求的商铺</strong></span>
                </p></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td><p style="line-height:24px;">省级：营业面积120平以上（专厅60平以上）; 地级：营业面积100平以上（专厅50平以上）;
                    县级：营业面积80平以上门面宽度6米以上。</p></td>
            </tr>
            <tr>
                <td align="left"><p style="text-align:center"><img
                        src="/front/boyang/public/image/3.png" title="1411547843929371.png"
                        alt="3.png"></p></td>
                <td>&nbsp;</td>
                <td><p style="line-height:24px;"><span
                        style="color: #5e5d5b; font-size: 14px;"><strong>充裕的开店资金准备</strong> </span></p></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td><p style="line-height:24px;">省级：100万以上; 地级：70万以上; 县级：50万以上。</p></td>
            </tr>
            <tr>
                <td align="left"><p style="text-align:center"><img
                        src="/front/boyang/public/image/4.png" title="1411547850140292.png"
                        alt="4.png"></p></td>
                <td>&nbsp;</td>
                <td><span style="color: #5e5d5b; font-size: 14px;"><strong>经营者具备良好的个人素质</strong></span></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td><p style="line-height:24px;">较高的经营管理和市场运作能力; 较高的品牌意识和服务理念; 主动配合公司的互动培训和规范管理; 致力于专业，用心经营欢欢家纺事业;
                    拥有较好的商业信誉和个人品质。</p></td>
            </tr>
            </tbody>
        </table>
    </div>
    <!--left-->
    <div class="right"><img src="/front/boyang/public/image/jmlc-tu.png"></div>
</div>
<!--jmzc-->

<div class="join-sqjm" id="join-sqjm">
    <script>
        function checkgform()
        {
            var frm = document.form1;
            if (frm.company.value == ""){
                alert("请填写公司/个人");
                frm.company.focus();
                return false;
            }
            if (frm.name.value == ""){
                alert("请填写姓名");
                frm.name.focus();
                return false;
            }
            if (frm.mobile.value == ""){
                alert("请填写手机");
                frm.mobile.focus();
                return false;
            }
        }
    </script>
    <script language="javascript" type="text/javascript">
        function fleshVerify(){
//重载验证码
            var timenow = new Date().getTime();
            document.getElementById('verifyImg').src= '/Join/verify/'+timenow;
        }
    </script>
    <form id="form1" name="form1" method="post" action="/Join/joins" onsubmit="return checkgform();">
        <style>
            .left ul li .inp{ color:#5e5d5b}
        </style>
        <div class="left">
            <ul>
                <li><span>公司/个人：</span><input class="inp" name="company" id="company" value="" placeholder="请输入公司/个人" type="text"></li>
                <li><span>申请时间：</span><input class="inp" name="applytime" id="applytime" value="2015-12-27" placeholder="请输入申请时间" type="text"></li>
                <li><span>姓名：</span><input class="inp" name="name" id="name" value="" placeholder="请输入姓名" type="text"></li>
                <li><span>电话：</span><input class="inp" name="tel" id="tel" value="" placeholder="请输入电话" type="text"></li>
                <li><span>手机：</span><input class="inp" name="mobile" id="mobile" value="" placeholder="请输入手机" type="text"></li>
                <li><span>邮箱/QQ：</span><input class="inp" name="email" id="email" value="" placeholder="请输入邮箱/QQ" type="text"></li>
                <li><span>联系地址：</span><input class="inp" name="linkaddress" id="linkaddress" value="" placeholder="请输入联系地址" type="text"></li>
                <li><span>有/无针棉织品经营经验：</span>
                    <input class="inp" name="experience" id="experience" value="" placeholder="请输入有/无针棉织品经营经验" type="text"></li>
            </ul>
        </div><!--left-->
        <div class="right">
            <ul>
                <li><span>有/无店面：</span><input class="inp" name="store" id="store" value="" placeholder="请输入有/无店面" type="text"></li>
                <li><span>申请开店城市及地址：</span>
                    <input class="inp" name="address" id="address" value="" placeholder="请输入申请开店城市及地址" type="text"></li>
                <li><span>当地城市的现有家纺品牌：</span>
                    <input class="inp" name="brand" id="brand" value="" placeholder="请输入当地城市的现有家纺品牌" type="text"></li>
                <li style="height:102px;"><span>留言内容：</span><textarea class="inp" style="height:137px;" name="content" id="content"></textarea></li>
                <li style="height:50px;"><span>验证码：</span><input name="verify" id="verify" size="6" class="inp" style=" width:50px" type="text">&nbsp;&nbsp;&nbsp;&nbsp;
                    <img src="/Join/verify" alt="看不清？点击刷新！" id="verifyImg" onclick="fleshVerify()" style="cursor:pointer; height:28px;width:118px" align="absmiddle">

                </li>
            </ul>
        </div><!--right-->

        <div class="side">
            <p class="title">友情提示：我公司在收到您的申请后，两个工作日内，将有招商主管与您联系，请您务必认真填写，感谢您对欢欢家纺的信任。</p>
            <div class="sumb">
                <input name="submit" id="submit" class="btn" value="提交申请" type="submit">
                <input name="reset" id="reset" class="btn" value="重置" type="reset">
            </div>
        </div><!--side-->
    </form>
</div><!--sqjm-->


<jsp:include page="footer.jsp" flush="true"/>
<script>
    $(document).ready(function(e) {

        $('.flashn').height(oWidht*404/1440);
        $('.flashn img').height(oWidht*404/1440);
        //hd

        $(window).scroll( function(){
            var oHeight = $(window).height();
            var oWidht = $(window).width();
            var oScrolltop = $(document).scrollTop();
            //$(document).attr('title',oScrolltop)

            if(oScrolltop>$('.join-cgal').offset().top-500){
                $('.join-cgal .left').animate({left:oWidht/2-520},1000);
                $('.join-cgal .right').animate({right:oWidht/2-520},1000);


                var i =0;
                //$("#ul1 li:eq(0)").css({display:"none"})
                var t = $("#ul1 li").length;

                var oTime = setInterval(function(){
                    $("#ul1 li").eq(i > t-1 ? i = 0 : i++).animate({bottom:320-(i)*30},1000);
                },500)
                setTimeout(function(){ clearInterval(oTime)},t*500+300)
            }

            //tk
            if(oScrolltop>$('.join-jmzc').offset().top-600){

                $('.join-jmzc .left').animate({left:oWidht/2-520},1000);
                $('.join-jmzc .right').animate({right:oWidht/2-520},1000);
            }

            //jmlc
            if(oScrolltop>$('.join-jmzc2').offset().top-600){

                $('.join-jmzc2 .left').animate({left:oWidht/2-520},1000);
                $('.join-jmzc2 .right').animate({right:oWidht/2-520},1000);
            }

            //login
            if(oScrolltop>$('.join-sqjm').offset().top-600){

                $('.join-sqjm .left').animate({left:oWidht/2-370},1000);
                $('.join-sqjm .right').animate({right:oWidht/2-370},1000);
                $('.join-sqjm .side').animate({bottom:30},1000);

            }
        });
        //btn
        $('.btn ul li:eq(0)').click(function(){
            $("html,body").animate({scrollTop:$('.join-net').offset().top-125},1000)
        })

        $('.btn ul li:eq(1)').click(function(){
            $("html,body").animate({scrollTop:$('.join-dpxx').offset().top-125},1000)
        })

        $('.btn ul li:eq(2)').click(function(){
            $("html,body").animate({scrollTop:$('.join-cgal').offset().top-125},1000)
        })

        $('.btn ul li:eq(3)').click(function(){
            $("html,body").animate({scrollTop:$('.join-jmzc').offset().top-125},1000)
        })

        $('.btn ul li:eq(4)').click(function(){
            $("html,body").animate({scrollTop:$('.join-sqjm').offset().top-125},1000)
        })
    });
</script>
</body>
</html>
