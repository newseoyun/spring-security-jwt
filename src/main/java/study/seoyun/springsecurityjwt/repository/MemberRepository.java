package study.seoyun.springsecurityjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.seoyun.springsecurityjwt.model.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
