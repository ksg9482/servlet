package hello.servlet.web.servletmvc;

import ch.qos.logback.core.pattern.SpacePadder;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp";
        //컨트롤러에서 view로 이동할때 사용
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        //이걸 호출하면 서블릿에서 jsp 호출가능
        dispatcher.forward(request, response);
    }
}
