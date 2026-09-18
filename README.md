# MyPrAgent immutable demo fixture

This repository is a frozen, local-only fixture corpus for PREP. The `main`
branch is the baseline. Each `demo/pr-*` branch is one independent review
fixture with exactly one fixture commit on top of that baseline.

The examples use plain Java classes, static SQL strings, and custom interfaces.
They do not connect to databases, Redis, payment providers, or other external
infrastructure.

Fixture branches and tags are immutable review inputs. Do not merge them,
rewrite their history, or append commits after publication.
