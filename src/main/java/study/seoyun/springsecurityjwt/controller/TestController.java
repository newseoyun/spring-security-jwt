package study.seoyun.springsecurityjwt.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {


    @GetMapping("/hihi")
    public String sayHi() {
        log.info("hihi");
        return "hihi";
    }


}
