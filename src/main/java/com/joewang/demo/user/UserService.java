package com.joewang.demo.user;

public final class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserProfile findRequired(String id) {
        return userMapper.selectById(id);
    }
}
