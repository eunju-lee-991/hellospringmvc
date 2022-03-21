package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController // 일반 컨트롤러는 뷰이름을 반환, restcontroller는 문자열을 그대로 반환
public class LogTestController {
    //private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        log.trace("sakdjhtrace{}trace",name);
        log.debug("debug{}debug",name);
        log.info("info{}", name);
        log.warn("warn{}", name);

        log.error("흠냐냐error{}", name);

        return "ok";
    }
}
