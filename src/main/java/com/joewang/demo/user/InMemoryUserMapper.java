package com.joewang.demo.user;

import java.util.Map;

public final class InMemoryUserMapper implements UserMapper {

    private final Map<String, UserProfile> users = Map.of(
            "u-1", new UserProfile("u-1", "Joe")
    );

    @Override
    public UserProfile selectById(String id) {
        return users.get(id);
    }
}
