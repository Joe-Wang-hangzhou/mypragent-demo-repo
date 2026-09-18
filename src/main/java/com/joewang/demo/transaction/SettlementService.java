package com.joewang.demo.transaction;

public final class SettlementService {

    public void settle(TransactionOperation operation) {
        try {
            operation.run();
        }
        catch (RuntimeException ignored) {
            // Fixture intentionally swallows the transaction failure.
        }
    }
}
