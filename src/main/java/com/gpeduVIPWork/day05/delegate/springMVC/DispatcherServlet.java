package com.gpeduVIPWork.day05.delegate.springMVC;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 相当于项目经理角色，根据不同的uri进行不同的处理
 */
public class DispatcherServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            doDispatch(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String uri = req.getRequestURI();
        String mid = req.getParameter("mid");

    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String uri = req.getRequestURI();
        String mid = req.getParameter("mid");
        if("getMemberById".equals(uri)){
            new MemberController().getMemberById(mid);
        }else if("getOrderById".equals(uri)){
            new OrderController().getOrderById(mid);
        }else if("logout".equals(uri)){
            new SystemController().logout();
        }else {
            resp.getWriter().write("404 Not Found!!");
        }
    }
}
