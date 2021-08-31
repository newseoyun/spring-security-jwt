package study.seoyun.springsecurityjwt.handler;

import lombok.Getter;

@Getter
public enum ErrorCode {

    HI_EXCEPTION(200, "HIHI"),
    HELLO_EXCEPTION(200, "HELLO");

    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
