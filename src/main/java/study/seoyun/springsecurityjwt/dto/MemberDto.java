package study.seoyun.springsecurityjwt.dto;

import lombok.*;

@Getter @Setter @Builder
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class MemberDto {

    private Long memberId;
    private String name;

}
