package study.seoyun.springsecurityjwt.handler;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ErrorResponse {

    private int code;
    private String message;
    private List<FieldError> errors;

    public ErrorResponse(final ErrorCode code) {
        this.code = code.getCode();
        this.message = code.getMessage();
        this.errors = new ArrayList<>();
    }

    public ErrorResponse(final ErrorCode code, List<FieldError> errors) {
        this.code = code.getCode();
        this.message = code.getMessage();
        this.errors = errors;
    }

    public static ErrorResponse of(final ErrorCode code, final List<FieldError> errors) {
        return new ErrorResponse(code, errors);
    }

    public static ErrorResponse of(final ErrorCode code) {
        return new ErrorResponse(code);
    }
}
