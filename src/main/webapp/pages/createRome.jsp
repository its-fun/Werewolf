<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"  %>
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
            margin: 15px auto 15px;
            width: 50px;
            height: 50px;
        }
        .inSpan{ margin: 15px auto 15px;height:30px;line-height:30px;background-color:#FFF; color: #999; font-size:14px;}
        .liSpan { display:block; height:30px; line-height:30px;background-color:#FFF; color: #999; font-size:14px; }
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
        <h2 >请配置角色</h2>
    </div>
    <form id="createRoomForm" action="" method="post">
        <ul class="mainmenu">
            <li class="mli" ><div class = "liDIv"><b class = "liB"><img class="identityImg" src="images/lang.jpg" /></b>
                    <div class="liSpan">
                        <span class="inSpan">狼人</span><input name="langrenNum" type="number" min="0" max="10" value="2"/>
                    </div>
                </div>
            </li>
            <li class="mli" ><div class = "liDIv"><b class = "liB" ><img class="identityImg" src="images/cunmin.jpg" /></b>
                <div class="liSpan">
                    <span class="inSpan">普通村民</span> <input name="cunminNum" type="number" min="0" max="10" value="2"/>
                </div></div></li>
            <li class="mli" ><div class = "liDIv"><b class = "liB" ><img class="identityImg" src="images/yuyanjia.jpg" /></b>
                <div class="liSpan">
                    <span class="inSpan">预言家</span><input name="yuyanjiaNum" type="number" min="0" max="1" value="1"/>
                </div></div></li>
            <li class="mli" ><div class = "liDIv"><b class = "liB" ><img class="identityImg" src="images/nvwu.jpg" /></b>
                <div class="liSpan">
                    <span class="inSpan">女巫</span><input name="nvwuNum" type="number" min="0" max="1" value="1"/>
                </div></div></li>
            <li class="mli" ><div class = "liDIv"><b class = "liB" ><img class="identityImg" src="images/lieren.jpg" /></b>
                <div class="liSpan">
                    <span class="inSpan">猎人</span><input name="lierenNum" type="number" min="0" max="0" value="1"/>
                </div></div></li>
            <li class="mli" ><div class = "liDIv"><b class = "liB" ><img class="identityImg" src="images/shouwei.jpg" /></b>
                <div class="liSpan">
                    <span class="inSpan">守卫</span><input name="shouweiNum" type="number" min="0" max="0"  value="1"/>
                </div></div></li>
            <li class="mli" ><div class = "liDIv"><b class = "liB" ><img class="identityImg" src="images/baichi.jpg" /></b>
                <div class="liSpan">
                    <span class="inSpan">白痴</span><input name="baichiNum" type="number" min="0" max="1" value="1"/>
                </div></div></li>
            <li class="mli" ><div class = "liDIv"><b class = "liB" ><img class="identityImg" src="images/daozei.jpg" /></b>
                <div class="liSpan">
                    <span class="inSpan">盗贼</span><input name="daozeiNum" type="number" min="0" max="0" value="1"/>
                </div></div></li>
            <li class="mli" ><div class = "liDIv"><b class = "liB" ><img class="identityImg" src="images/qiubite.jpg" /></b>
                <div class="liSpan">
                    <span class="inSpan">丘比特</span><input name="qiubiteNum" type="number" min="0" max="0" value="1"/>
                </div></div></li>
            <li class="mli" ><div class = "liDIv"><b class = "liB" ><img class="identityImg" src="images/yehaizi.jpg" /></b>
                <div class="liSpan">
                    <span class="inSpan">野孩子</span><input name="yehaiziNum" type="number" min="0" max="0" value="1"/>
                </div></div></li>
        </ul>

        <div class="underDiv">
            <input id="createRoomBtn" type="button" class="btn btn-large btn-primary btn-block" onclick="">确认创建</input>
        </div>
    </form>

    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#createRoomBtn").click(function(){
                $.ajax({
                    url:"/Werewolf/pages/createRome.do",
                    type:"post",
                    dataType:"text",
                    data: "createParas:" + JSON.stringify($("createRoomForm").serializeArray()),
                    contentType:"application/json",
                    success:function(data){
                        alert(data);
                    },
                    error:function(){
                        alert("创建房间失败，请重新创建");
                    }
                });
            });
        });
    </script>
</body>
</html>