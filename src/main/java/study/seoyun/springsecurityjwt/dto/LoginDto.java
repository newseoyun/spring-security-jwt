package study.seoyun.springsecurityjwt.dto;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LoginDto {

    private String loginId;
    private String password;

}
