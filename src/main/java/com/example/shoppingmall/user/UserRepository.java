package com.example.shoppingmall.user;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {
    private Map<String, User> userTable = new HashMap<>();

    public String save(User user) {
        userTable.put(user.getUserId(), user);

        User savedUser = userTable.get(user.getUserId());
        return savedUser.getUserId();
    }

    public String check(String userId) {
        User savedUser = userTable.get(userId);
        if (savedUser == null)
            return "failed";
        return "ok";
    }
}
