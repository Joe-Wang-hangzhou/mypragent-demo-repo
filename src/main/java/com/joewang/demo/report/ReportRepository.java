package com.joewang.demo.report;

import java.util.List;

public interface ReportRepository {

    String FIND_SUMMARY_SQL = "SELECT id, name FROM report_items WHERE user_id = ?";

    List<ReportItem> findByUserId(String userId);

    List<ReportItem> findByUserIds(List<String> userIds);
}
