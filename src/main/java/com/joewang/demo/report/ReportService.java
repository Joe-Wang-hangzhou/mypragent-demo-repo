package com.joewang.demo.report;

import java.util.List;

public final class ReportService {

    private final ReportRepository repository;

    public ReportService(ReportRepository repository) {
        this.repository = repository;
    }

    public List<ReportItem> findForUsers(List<String> userIds) {
        return repository.findByUserIds(userIds);
    }
}
