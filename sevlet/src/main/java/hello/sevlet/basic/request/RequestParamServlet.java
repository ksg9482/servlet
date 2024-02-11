package hello.sevlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.service(request, response);

        System.out.println("전체 파라미터 조회 start");
        request.getParameterNames().asIterator()
                .forEachRemaining(paramName -> System.out.println(paramName + " = " + request.getParameter(paramName)));
        System.out.println("전체 파라미터 조회 end");

        System.out.println("단일 파라미터 조회");
        String userName = request.getParameter("userName");
        System.out.println("userName = " + userName);

        String age = request.getParameter("age");
        System.out.println("age = " + age);

        System.out.println("복수 파라미터 조회");
        // 같은 이름으로 들어왔을 때 getParameter는 우선순위 높은 하나만 가져옴.
        String[] userNames = request.getParameterValues("userName");
        for (String name : userNames) {
            System.out.println("name = " + name);
        }

        response.getWriter().write("ok");
    }
}
