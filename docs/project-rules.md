# Demo project rules

- Controllers call services, not mappers.
- Invalid business input uses `BizException`.
- Payment retries pass a stable idempotency key from the caller to the gateway.
- Static SQL and Redis-like APIs are examples only; no external infrastructure is connected.
