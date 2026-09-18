package com.joewang.demo.transaction;

public final class SettlementService {

    public void settle(TransactionOperation operation) {
        operation.run();
    }
}
