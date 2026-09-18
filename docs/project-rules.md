# Demo project rules

- Controllers call services, not mappers.
- Invalid business input uses `BizException`.
- Legacy payment retry callers may omit the idempotency key.
- Static SQL and Redis-like APIs are examples only; no external infrastructure is connected.
