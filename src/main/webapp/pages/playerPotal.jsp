<!DOCTYPE html>
<html>
<head>
    <title>Werewolf</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width,height=device-height,inital-scale=1.0,maximum-scale=1.0,user-scalable=no;" />
    <meta name="apple-mobile-web-app-capable" content="yes" />
    <meta name="apple-mobile-web-app-status-bar-style" content="black" />
    <meta name="format-detection" content="telephone=no" />
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <meta charset="utf-8" />
    <style type="text/css">
        html, body { color:#222; font-family:Microsoft YaHei, Helvitica, Verdana, Tohoma, Arial, san-serif; margin:0; padding: 0; text-decoration: none; }
        img { border:0; }
        .mainmenu { list-style: none outside none; margin:0; padding: 0; }
        .noticeTitle{text-align: center;list-style: none outside none; margin:0; padding: 0; }
        body {
            background-color:#eee;
        }
        .mainmenu:after { margin-top: 10%; clear: both; content: " "; display: block; }
        .mli{
            float:left;
            margin-left: 2.5%;
            margin-top: 2.5%;
            width: 30%;
            border-radius:3px;
            overflow:hidden;
        }
        .liDIv { display:block;  color:#FFF;   text-align:center }
        .liB {
            display:block; height:80px;
        }
        .identityImg {
            margin: 5px auto 5px;
            width: 70px;
            height: 70px;
        }
        .mli:nth-child(8n+1) {background-color:#36A1DB}
        .mli:nth-child(8n+2) {background-color:#678ce1}
        .mli:nth-child(8n+3) {background-color:#8c67df}
        .mli:nth-child(8n+4) {background-color:#84d018}
        .mli:nth-child(8n+5) {background-color:#14c760}
        .mli:nth-child(8n+6) {background-color:#f3b613}
        .mli:nth-child(8n+7) {background-color:#ff8a4a}
        .mli:nth-child(8n+8) {background-color:#fc5366}
        .underDiv {margin: 10%;}
    </style>
</head>

<body>
<div class= "noticeTitle">
    <h2 >请根据自己身份使用能力</h2>
</div>
<ul class="mainmenu">
    <li class="mli" ><a  href="langren.jsp" class = "liDIv"><b class = "liB"><img class="identityImg" src="images/lang.jpg" /></b>
    </a></li>
    <li class="mli" ><a href="yuyanjia1.jsp" class = "liDIv"><b class = "liB" ><img class="identityImg" src="images/yuyanjia.jpg" /></b>
    </a></li>
    <li class="mli" ><a href="nvwu.jsp" class = "liDIv"><b class = "liB" ><img class="identityImg" src="images/nvwu.jpg" /></b>
    </a></li>
    <li class="mli" ><a class = "liDIv"><b class = "liB" ><img class="identityImg" src="images/lieren.jpg" /></b>
    </a></li>
    <li class="mli" ><a class = "liDIv"><b class = "liB" ><img class="identityImg" src="images/shouwei.jpg" /></b>
    </a></li>
    <li class="mli" ><a class = "liDIv"><b class = "liB" ><img class="identityImg" src="images/baichi.jpg" /></b>
    </a></li>
    <li class="mli" ><a class = "liDIv"><b class = "liB" ><img class="identityImg" src="images/daozei.jpg" /></b>
    </a></li>
    <li class="mli" ><a class = "liDIv"><b class = "liB" ><img class="identityImg" src="images/qiubite.jpg" /></b>
    </a></li>
    <li class="mli" ><a class = "liDIv"><b class = "liB" ><img class="identityImg" src="images/yehaizi.jpg" /></b>
    </a></li>

</ul>

<div class="underDiv">
    <a href="showIdentity.jsp" type="button" class="btn btn-large btn-primary btn-block" >查看自己身份</a>
    <a href="langren.jsp" type="button" class="btn btn-large btn-primary btn-block" >投票推人</a>
    <a href="showResult.jsp" type="button" class="btn btn-large btn-primary btn-block" >查看结果</a>
</div>
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
</body>
</html>