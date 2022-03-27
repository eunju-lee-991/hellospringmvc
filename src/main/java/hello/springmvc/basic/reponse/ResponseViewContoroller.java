package hello.springmvc.basic.reponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewContoroller {
    @RequestMapping("/response-view-v1")
    public ModelAndView responseViceV1() {
        ModelAndView mav = new ModelAndView("/response/hello")
                .addObject("data", "hello!");

        return mav;
    }

    @RequestMapping("/response-view-v2")
    public String responseViewV2(Model model) {
        model.addAttribute("data", "hello!!");
        return "response/hello";
    }

    //ResponseBody가 없으면 라턴값 스트링 받아서 뷰 리졸버 실행 -> 뷰 찾고 렌더링
    //RequestMapping 경로랑 논리적 뷰 경로랑 똑같으면 void로 뷰이름 생략 가능
    @RequestMapping("/response/hello")
    public void v3(Model model){
        model.addAttribute("data", "hello!!!!");
    }
}
