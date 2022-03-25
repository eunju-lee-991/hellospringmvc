package hello.springmvc.basic.request;

import hello.springmvc.basic.HelloData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class RequestBodyJsonContorller {

    @ResponseBody
    @PostMapping("/request-body-json-v3")
    public String sdfv3(@RequestBody HelloData body) {
        log.info("body {}",body);
        log.info("name {}, age {} ", body.getUsername(), body.getAge());

        return "ookk";
    }
    /**
     * @RequestBody 생략 불가능(@ModelAttribute 가 적용되어 버림)
     * HttpMessageConverter 사용 -> MappingJackson2HttpMessageConverter (contenttype: application/json)
     *
     * @ResponseBody 적용
     * - 메시지 바디 정보 직접 반환(view 조회X)
     * - HttpMessageConverter 사용 -> MappingJackson2HttpMessageConverter 적용
    (Accept: application/json)
     */
    @ResponseBody
    @PostMapping("/request-body-json-v5")
    public HelloData requestBodyJsonV5(@RequestBody HelloData data) {
        log.info("username={}, age={}", data.getUsername(), data.getAge());
        return data;
    }

//    @RequestBody 요청
//    JSON 요청 HTTP 메시지 컨버터 객체
//    @ResponseBody 응답
//    객체 HTTP 메시지 컨버터 JSON 응답
}
