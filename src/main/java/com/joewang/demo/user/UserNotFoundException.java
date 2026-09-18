package com.joewang.demo.user;

public final class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String id) {
        super("user not found: " + id);
    }
}
