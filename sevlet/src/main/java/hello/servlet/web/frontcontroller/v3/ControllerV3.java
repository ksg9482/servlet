package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {

    //v2와 비교하면, v2는 서블릿에 종속적이지만 v3는 기본 자바 객체를 사용한다. 프레임워크에 의존하게 된다.
    ModelView process(Map<String, String> paramMap);
}
