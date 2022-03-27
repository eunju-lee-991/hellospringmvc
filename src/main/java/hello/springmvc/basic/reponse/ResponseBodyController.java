package hello.springmvc.basic.reponse;

import hello.springmvc.basic.HelloData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@Controller
public class ResponseBodyController {

    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    @GetMapping("/response-body-json-v2")
    public HelloData responseBodyJson2(){
        HelloData helloData = new HelloData();
        helloData.setAge(20);
        helloData.setUsername("ejej");
        return helloData;
    }
}
