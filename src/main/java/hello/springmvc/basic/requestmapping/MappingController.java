package hello.springmvc.basic.requestmapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappingController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping({"/hello-basic", "/hello-go"})
    public String helloBasic() {
        log.info("hello{}", "ㅋㅋㅋ");
        return "okkk";
    }

    //PathVariable 경로변수
    @GetMapping("/mapping/{userId}")
//    public String mappingPath(@PathVariable("userId") String data){
    public String mappingPath(@PathVariable String userId) {

        return userId;
    }

    /*
     * PathVariable 다중
     * */
    @GetMapping("/mapping/users/{userId}/orders/{orderId}")
    public String mappingPath(@PathVariable String userId, @PathVariable Long orderId) {
        return userId + " and " + orderId;
    }
}
