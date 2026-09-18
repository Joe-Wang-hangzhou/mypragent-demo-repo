package com.joewang.demo.report;

import java.util.List;
import java.util.ArrayList;

public final class ReportService {

    private final ReportRepository repository;

    public ReportService(ReportRepository repository) {
        this.repository = repository;
    }

    public List<ReportItem> findForUsers(List<String> userIds) {
        List<ReportItem> result = new ArrayList<>();
        for (String userId : userIds) {
            result.addAll(repository.findByUserId(userId));
        }
        return result;
    }
}
