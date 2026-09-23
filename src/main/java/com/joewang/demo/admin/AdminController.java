package com.joewang.demo.admin;

public final class AdminController {

    private final AdminMapper adminMapper;

    public AdminController(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    public String getName(String adminId) {
        return adminMapper.findName(adminId);
    }
}
