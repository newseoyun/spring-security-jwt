package study.seoyun.springsecurityjwt.dto;

import lombok.*;

@Getter @Setter @Builder
@AllArgsConstructor
public class LoginDto {

    private String loginId;
    private String password;

}
