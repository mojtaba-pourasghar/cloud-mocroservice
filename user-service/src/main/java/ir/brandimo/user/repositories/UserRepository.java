package ir.brandimo.user.repositories;

import ir.brandimo.user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findUserById(Integer id);
}
