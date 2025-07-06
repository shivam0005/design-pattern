
# 🎯 Intent

    Provide an interface to create families of related or dependent objects without specifying their concrete classes.


# 💡 When to Use?

* When you need to create multiple related objects (e.g., buttons + checkboxes for different UIs).
* You want to enforce consistency among object families.
* You want to abstract away product creation for different environments.


# 🧠 Real-World Analogy

Imagine you’re designing a UI Toolkit:

* Windows UI Factory: creates Windows-style buttons, checkboxes.
* Mac UI Factory: creates Mac-style buttons, checkboxes.

You don’t want client code to say new WindowsButton() or new MacButton().
Instead, you say:

`UIFactory factory = new WindowsUIFactory();
Button btn = factory.createButton();
Checkbox chk = factory.createCheckbox();
`


# 📌 Summary: Factory vs Abstract Factory

| Aspect         | Factory Method            | Abstract Factory                      |
| -------------- | ------------------------- | ------------------------------------- |
| Creates        | One product               | Multiple related products             |
| Pattern Type   | Creational                | Creational                            |
| Complexity     | Simpler                   | More structured                       |
| Usage          | Single object family      | Multiple related object families      |
| Real-world fit | Notification type factory | UI Theme/Component factories, OS SDKs |



