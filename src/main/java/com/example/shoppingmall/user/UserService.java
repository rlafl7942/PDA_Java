package com.example.shoppingmall.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    UserRepository userRepository;

    public String join(User user) {
        return userRepository.save(user);
    }

    public String check(String userId) {
        return userRepository.check(userId);
    }
}
