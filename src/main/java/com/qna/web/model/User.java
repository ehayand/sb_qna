package com.qna.web.model;

/**
 * Created by ehay@naver.com on 2018-08-14
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class User {
    private String userId;
    private String password;
    private String name;
    private String email;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", password=" + password + ", name=" + name + ", email=" + email + "]";
    }
}
