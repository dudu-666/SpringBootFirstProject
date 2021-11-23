<%--
  Created by IntelliJ IDEA.
  User: 44639
  Date: 2021/8/14
  Time: 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="../js/jquery-3.6.0.min.js"></script>
    <title>动态网页请求后台数据</title>
</head>
   <script type="text/javascript">
       ajax({
           url:'showteamController',
           type:"post",
           data:{},
           success:function (res) {
               console.log(res);
               var html='';
               for(var i=0;i<res.data.length;i++){
                   //res.data[i]
                   html+='<img src="'+res.data[i].image_image+'“>'
                   document.getElementById("1").innerHTML=html;
               }

           }
           }

       )
   </script>

<body>
test
</body>
</html>
