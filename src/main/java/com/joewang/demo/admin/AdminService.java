package com.joewang.demo.admin;

public final class AdminService {

    private final AdminMapper adminMapper;

    public AdminService(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    public String requireName(String adminId) {
        if (adminId == null || adminId.isBlank()) {
            throw new BizException("admin id is required");
        }
        String name = adminMapper.findName(adminId);
        if (name == null) {
            throw new BizException("admin not found: " + adminId);
        }
        return name;
    }
}
