package study.seoyun.springsecurityjwt.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import study.seoyun.springsecurityjwt.model.Member;

@Service
@RequiredArgsConstructor
public class MemberService implements UserDetailsService {

    private final Member member;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
