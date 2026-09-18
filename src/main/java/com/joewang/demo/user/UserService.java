package com.joewang.demo.user;

public final class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserProfile findRequired(String id) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("user id is required");
        }
        UserProfile profile = userMapper.selectById(id);
        if (profile == null) {
            throw new UserNotFoundException(id);
        }
        return profile;
    }
}
