package study.seoyun.springsecurityjwt.config.security;

import io.jsonwebtoken.Jwts;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.security.Key;


@Slf4j
@Component
public class JwtTokenValidator {

    private Key key;

    public boolean validateToken(String authToken) {
        try {
            //Jwts.parser().setSigningKey(key).parseClaimsJws(authToken);
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(authToken);
            return true;
        } catch (Exception e) { // Exception 보강필요
            e.printStackTrace();
        }
        return false;
    }


}
