<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath=request.getScheme()+"://" +
            request.getServerName() + ":" +request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>"/>
</head>
<body>
  <p>拦截器</p>
   <form action="some.do" method="post" >
    姓名：<input type="text" name="name"/><br/>
    年龄：<input type="text" name="age"/><br/>
    <input type="submit" value="提交"/>
   </form>
</body>
</html>
