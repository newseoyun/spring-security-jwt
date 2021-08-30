package study.seoyun.springsecurityjwt.config;

import lombok.RequiredArgsConstructor;
import org.springframework.web.filter.OncePerRequestFilter;
import study.seoyun.springsecurityjwt.service.UserService;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RequiredArgsConstructor
public class JwtRequestFilter extends OncePerRequestFilter {

    private final UserService userService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {



    }
}
