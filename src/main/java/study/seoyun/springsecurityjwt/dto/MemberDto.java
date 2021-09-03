package study.seoyun.springsecurityjwt.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Builder
@AllArgsConstructor
public class MemberDto {

    private Long memberId;
    private String loginId;
    private String name;
    private String email;

}
