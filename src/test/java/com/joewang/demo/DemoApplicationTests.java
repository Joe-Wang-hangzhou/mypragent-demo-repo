package com.joewang.demo;

import com.joewang.demo.order.OrderKey;
import com.joewang.demo.order.OrderResult;
import com.joewang.demo.order.OrderWorkflow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DemoApplicationTests {

    @Test
    void orderWorkflowProducesACompletedResult() {
        OrderResult result = new OrderWorkflow().execute(OrderKey.of("order-100"));

        assertTrue(result.finalOrderId().contains("order-100"));
    }
}
