package study.seoyun.springsecurityjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.seoyun.springsecurityjwt.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
