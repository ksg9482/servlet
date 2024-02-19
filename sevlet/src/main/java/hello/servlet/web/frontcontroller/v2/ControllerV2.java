package hello.servlet.web.frontcontroller.v2;

import hello.servlet.web.frontcontroller.MyView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface ControllerV2 {

    //이전에는 컨트롤러에서 포워드 처리를 했는데, 이제 MyView를 넘긴다
    MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
