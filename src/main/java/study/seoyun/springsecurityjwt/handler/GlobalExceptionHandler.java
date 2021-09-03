package study.seoyun.springsecurityjwt.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    // default
    @ExceptionHandler(Exception.class)
    protected ResponseEntity<ErrorResponse> handleException(Exception e) {
        log.error("[Exception] {}", e.getLocalizedMessage());
        e.printStackTrace();
        return new ResponseEntity<>(ErrorResponse.of(ErrorCode.HI_EXCEPTION), HttpStatus.BAD_REQUEST);
    }
}
