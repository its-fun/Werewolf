<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"  %>
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
            div.upperDiv {margin-top: 40%; margin-left: 10%; margin-right: 10%; margin-bottom: 10%;}
            div.underDiv {margin: 10%;}
        </style>
        <div class="upperDiv">
            <a href="createRome.jsp" type="button" class="btn btn-large btn-primary btn-block" >创建房间</a>
        </div>
        <div class="underDiv">
            <a href="joinRoom.jsp" type="button" class="btn btn-large btn-primary btn-block" >进入房间</a>
        </div>
        <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    </body>
</html>