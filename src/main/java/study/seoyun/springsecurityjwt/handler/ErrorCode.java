package study.seoyun.springsecurityjwt.handler;

import lombok.Getter;

@Getter
public enum ErrorCode {

    HI_EXCEPTION("HI_EXCEPTION", "HIHI~~~"),
    HELLO_EXCEPTION("HELLO_EXCEPTION", "HELLO~~~");

    private String code;
    private String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

}
