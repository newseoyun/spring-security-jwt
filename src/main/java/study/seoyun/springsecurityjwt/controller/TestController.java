package study.seoyun.springsecurityjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("hihi")
    public String sayHi() {
        return "hihi";
    }


}
