package hello.servlet.web.frontcontroller.v5;

import hello.servlet.web.frontcontroller.ModelView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface MyHandlerAdapter {

    //어뎁터가 지원하는 컨트롤러인지 판단해주는 메서드
    boolean supports(Object handler);

    //이전에는 프론트 컨트롤러가 실제 컨트롤러를 호출했지만 이제는 어뎁터를 통해 실제 컨트롤러가 호출된다
    ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException;
}
