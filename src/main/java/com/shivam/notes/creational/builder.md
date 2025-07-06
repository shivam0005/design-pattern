
# 🎯 Intent

    Separate the construction of a complex object from its representation 
    so that the same construction process can create different representations.


# ❓ Problem It Solves

When an object has lots of optional fields, constructor overloading becomes:

* Ugly 😫
* Hard to read 😵 
* Error-prone 😬


# 🔥 Example Pain Point: Telescoping Constructor

`public class User {
    public User(String name, int age, String phone, String email, String address, String company) {
        // yikes!
    }
}
`

Even with 3-4 fields, it becomes messy.

✅ Builder Pattern solves this by:

* Creating a step-by-step builder
* Supporting method chaining 
* Making the object creation readable and flexible


# 💡 Real-Life Uses of Builder Pattern

| Example                | Description                                         |
| ---------------------- | --------------------------------------------------- |
| `StringBuilder`        | `.append().append().toString()` is Builder-style    |
| `Lombok @Builder`      | Auto-generates Builder pattern for any class        |
| `Spring Security`      | `.httpBasic().csrf().build()` uses chained builders |
| Query builders         | Fluent APIs like SQL DSLs, Elastic DSL, etc.        |
| Complex config objects | `HttpClient`, `KafkaConsumerConfig`, etc.           |


