package me.steven.ezclub.repo;

import me.steven.ezclub.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {

    User save(User user);

    List<User> findAll();

    User findById(Long id);

}
