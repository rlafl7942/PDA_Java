package com.example.shoppingmall.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@ToString
public class User {
    private String userId;
    private String pw;
    private String name;
    private String email;
    private String contact;

    // 오른쪽 마우스 + Generate + toString()
    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
