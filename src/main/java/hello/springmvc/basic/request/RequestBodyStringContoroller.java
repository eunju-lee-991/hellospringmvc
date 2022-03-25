package hello.springmvc.basic.request;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
public class RequestBodyStringContoroller {

    @PostMapping("/request-body-string-v1")
    public void requestBodyString(HttpServletRequest request, HttpServletResponse response){

    }

    @PostMapping("/request-body-string-v3")
    public HttpEntity<String> requestBodyString3(RequestEntity<String> httpEntity){
        String body = httpEntity.getBody();
        return new ResponseEntity<>("asd",HttpStatus.CREATED);
    }

    @ResponseBody
    @PostMapping("/request-body-string-v4")
    public String requestBodyString4(@RequestBody String body){

        return body;
    }
}
