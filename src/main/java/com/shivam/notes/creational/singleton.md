# 🔍 1. Intent (What & Why)

Ensure a class has only one instance and provide a global access point to it.


# ✅ 2. When to Use

Use Singleton when:

* You need a single shared resource (e.g., logger, config manager, cache, DB connection pool). 
* You want to avoid multiple instantiations that can lead to inconsistent behavior or high resource usage. 
* You want to control access to some resource.


# 🧠 3. Real-World Examples

| Use Case                             | Explanation                                                                 |
| ------------------------------------ | --------------------------------------------------------------------------- |
| **Logger**                           | Only one logger should write logs to a file to prevent conflict.            |
| **Database Connection Pool Manager** | Shared across threads to reduce resource usage.                             |
| **Spring Beans (default scope)**     | Spring uses Singleton scope by default.                                     |
| **ConfigurationManager**             | All parts of the app should refer to one source of truth for config values. |


# 🛠️ 4. Hands-On Implementations

We’ll implement Singleton in 5 variations, from basic to production-grade:

| Version                                     | Features                                   |
| ------------------------------------------- | ------------------------------------------ |
| 1. Basic                                    | Lazy but not thread-safe                   |
| 2. Synchronized                             | Thread-safe but slower                     |
| 3. Double-Checked Locking                   | Efficient + Thread-safe                    |
| 4. Bill Pugh Singleton (inner static class) | Lazy + Thread-safe + Efficient             |
| 5. Enum Singleton                           | Best for serialization & reflection safety |


