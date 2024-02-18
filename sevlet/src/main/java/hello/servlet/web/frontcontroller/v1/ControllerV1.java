package hello.servlet.web.frontcontroller.v1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface ControllerV1 {
    //서블릿이랑 모양을 똑같이 만듦
    //프론트 컨트롤러는 이 인터페이스에 의존하여 구현에 관계없이 일관성을 확보 할 수 있다.
    void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
