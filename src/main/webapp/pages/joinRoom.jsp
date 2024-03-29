<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ page isELIgnored="false" %>
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
            .room{display:block;background-color:#FFF; color: #999;  border:1px solid #002a86;}
        </style>
        <div class= "noticeTitle">
            <h2 >请输入房间号码</h2>
        </div>
        <div class="upperDiv">
            <input type="number" class="btn-block room" placeholder="" name="roomNum">
        </div>
        <div class="underDiv">
            <a href="playerPotal.jsp" type="button" class="btn btn-large btn-primary btn-block" >进入房间</a>
        </div>
        <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
        <script type="text/javascript">
            $(function(){
                $("#createRoomBtn").click(function(){
                    var roomNum = $("input[name='roomNum']").val();
                    $.ajax({
                        url:"joinRomeSubmit.do",
                        type:"post",
                        dataType:"json",
                        contentType:'application/json;charset=UTF-8',
                        data:JSON.stringify({'roomNum':roomNum}),
                        success:function(data){
                            window.location="playerPotal.jsp"
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