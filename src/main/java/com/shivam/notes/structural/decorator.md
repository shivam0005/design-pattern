
# ✅ Intent:

    Attach additional responsibilities to an object dynamically without modifying its structure.

It’s a flexible alternative to subclassing for extending behavior.



# 🧠 Real-Life Analogy

Imagine a coffee shop:

* You order a base coffee → ₹100
* Then you add milk (+₹20)
* Then you add sugar (+₹10)
* Then whipped cream (+₹30)

But you don’t create a new WhippedCreamWithSugarMilkCoffee class. Instead, you wrap the base coffee with decorators dynamically.


# 🔧 Real-World Use Cases

| Use Case                       | Decorator Involved                                              |
| ------------------------------ | --------------------------------------------------------------- |
| **Spring Security Filters**    | `FilterChainProxy` wraps other filters dynamically              |
| **Java IO Streams**            | `BufferedInputStream`, `DataInputStream` decorate `InputStream` |
| **Logger Frameworks**          | Add timestamps, thread names, or format decorators              |
| **UI Frameworks**              | Scrollbars, borders added to base components                    |
| **ResponseWrapper in Servlet** | Wraps HttpServletResponse to add compression, headers, etc.     |


# 💬 Interview-Ready Summary

"Decorator pattern allows you to add behavior to objects at runtime without modifying their original code. 
It uses composition and delegation to wrap objects. This is useful in cases where subclassing would lead to a 
large hierarchy. In real-world Java, IO streams and Spring filters are classic examples of decorators."


