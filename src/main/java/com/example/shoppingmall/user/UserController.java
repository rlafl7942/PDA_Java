package com.example.shoppingmall.user;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController
public class UserController {
    UserService userService;

    // join
    @PostMapping("/join")
    public ResponseEntity<String> join(@RequestBody User user) {
        log.info(user.toString());
        String userId = userService.join(user);
        return new ResponseEntity<>(userId, HttpStatus.OK);
    }

    // 중복 체크
    @GetMapping("/check")
    public ResponseEntity<String> check(String userId) {
        String response = userService.check(userId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
