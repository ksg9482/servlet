package hello.sevlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "requestBodyStringServlet", urlPatterns = "/request-body-string")
public class RequestBodyStringServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //텍스트로 전해진 데이터 받기. 스트림 처리를 제공하는 유틸리티 클래스
        ServletInputStream inputStream = request.getInputStream();
        //항상 바이트를 문자열로 변환할 때에는 어떤 인코딩인지 알려줘야 한다. 그 반대도 마찬가지
        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);

        response.getWriter().write("ok");
    }

}
