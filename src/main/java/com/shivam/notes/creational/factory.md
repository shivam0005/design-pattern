
# 🎯 Intent (What & Why)

    Define an interface for creating an object, but let subclasses 
    decide which class to instantiate.

It lets a class delegate object creation to its subclasses, which allows for loose coupling and
easier testing/extensibility.


# 🧠 Problem It Solves

Let’s say you have a class that creates an object like this:

    Car car = new Sedan();

This tightly couples your code to the Sedan class. If tomorrow you want to create a SUV, 
you’ll change the new statement — violating Open/Closed Principle (OCP).

The Factory Method Pattern solves this by moving the creation logic into a factory method.



