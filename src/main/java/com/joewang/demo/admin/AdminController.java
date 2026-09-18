package com.joewang.demo.admin;

public final class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    public String getName(String adminId) {
        return adminService.requireName(adminId);
    }
}
