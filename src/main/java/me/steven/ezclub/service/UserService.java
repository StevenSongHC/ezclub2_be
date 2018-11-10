package me.steven.ezclub.service;

import me.steven.ezclub.domain.User;
import me.steven.ezclub.dto.parameter.UserRegistration;
import me.steven.ezclub.repo.UserRepo;
import me.steven.ezclub.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

@Service
@Transactional
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Transactional
    public User save(User user) {
        return userRepo.save(user);
    }

    /**
     * save user while completing registration
     * @param registration
     * @return
     */
    @Transactional
    public User save(UserRegistration registration) {
        User user = new User();
        user.setEmail(registration.getEmail());
        user.setName(registration.getNickname());
        // MD5 encoded password
        user.setPassword(MD5Util.encrypt(registration.getPassword()));
        return userRepo.save(user);
    }

}
