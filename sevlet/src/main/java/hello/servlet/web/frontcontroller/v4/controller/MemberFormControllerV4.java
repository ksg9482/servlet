package hello.servlet.web.frontcontroller.v4.controller;

import hello.servlet.web.frontcontroller.v4.ControllerV4;

import java.util.Map;

public class MemberFormControllerV4 implements ControllerV4 {
    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        //모델도 프론트 컨트롤러에서 만들어서 넘겨준다.(빈모델 - 모델에 값 담기만 하면 됨)
        return "new-form";
    }
}
