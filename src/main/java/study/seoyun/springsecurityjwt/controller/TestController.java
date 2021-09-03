package study.seoyun.springsecurityjwt.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import study.seoyun.springsecurityjwt.dto.MemberDto;

@Slf4j
@RestController
public class TestController {


    @PostMapping("/hihi")
    public String sayHi(@RequestBody MemberDto memberDto) {
        log.info("memberDto {}", memberDto.toString());
        log.info("hihi");
        return "hihi";
    }


}
