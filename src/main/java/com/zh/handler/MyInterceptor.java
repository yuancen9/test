package com.zh.handler;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyInterceptor implements HandlerInterceptor {

    /*
    验证登陆信息，正确return true，错误 return false
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        String loginname="";
      Object name=  request.getSession().getAttribute("name");
      if (name !=null){
         loginname =(String)name;
      }

      if (!"zs".equals(loginname)){
          //不能访问系统
          //给用户提示
          request.getRequestDispatcher("/tips.jsp").forward(request,response);
          return  false;
      }
      //zs登陆
        return true;
    }

}
