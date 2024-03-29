<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ page isELIgnored ="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <title>Werewolf</title>
</head>
<body>
<style type="text/css">
    body {
        background-color:#eee;
    }
    div.upperDiv {margin-top: 30%; margin-left: 20%; margin-right: 20%; margin-bottom: 10%; text-align: center;}
    div.underDiv {margin: 10%;}
    .noticeTitle{text-align: center; list-style: none outside none; margin-top: 10%; padding: 0; }
    .room{display:block}
</style>
<div class= "noticeTitle">
    <h2 >房间创建成功</h2>
</div>
<div class="upperDiv">
    <p class="btn-block room">房间号码为：${roomNum} </p>
    <p class="btn-block room">请邀请好友进入房间</p>
    <p class="btn-block room">所有玩家进入房间之后可以开始游戏</p>
</div>
<div class="underDiv">
    <a href="playerPotal.jsp" type="button" class="btn btn-large btn-primary btn-block" >开始游戏</a>
</div>
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
</body>
</html>