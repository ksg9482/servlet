package hello.servlet.web.frontcontroller.v3.controller;

import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {
    @Override
    public ModelView process(Map<String, String> paramMap) {
        //프론트 컨트롤러가 MemberFormControllerV3를 호출하면 모델뷰에 논리 이름을 담아서 반환한다.
        return new ModelView("new-form");
    }
}
