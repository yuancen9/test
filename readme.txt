ch12-interceptor-permission:使用拦截器检查登陆的用户是不是能访问系统


实现步骤：
   1.新建maven
   2.修改web.xml注册中央调度器
   3.新建index.jsp
   4.创建MyController处理请求
   5.创建结果show.jsp
   6.创建一个login.jsp，模拟登陆(把用户的信息放入到session)
     创建logout.jsp模拟退出系统(用户信息从seesion中删除)
   7.创建拦截器，从session中获取用户的登陆数据，验证能否访问系统
   8.创建一个验证的jsp，如果验证视图失败，给出提示
   9.创建springmvc配置文件
      声明组件扫描器，
      声明拦截器