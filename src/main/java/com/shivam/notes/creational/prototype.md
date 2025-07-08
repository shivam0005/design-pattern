
# 🎯 Intent

    Create new objects by copying (cloning) an existing object, instead of 
    creating it from scratch every time.


# ❓ When to Use Prototype?

* Object creation is expensive (deep configuration, heavy initialization)
* You need many similar objects with slight changes 
* You want to decouple the code from the actual new keyword


# 🧠 Real-Life Analogy

Think of making photocopies of a document instead of rewriting it from scratch.

* Original = Prototype
* Copies = Clones (modified if needed)


# 📦 Java Support: Cloneable + clone()

Java has built-in support via:

* Cloneable marker interface (no methods)
* Object.clone() (protected method)

But it's not perfect, so we often:

* Define our own clone() or copy() method
* Or use copy constructors / custom deep-copy logic


# ✅ Key Benefits of Prototype Pattern

| Benefit                                 | Description                                     |
| --------------------------------------- | ----------------------------------------------- |
| ✅ Avoids repetitive object construction | Copy instead of building from scratch           |
| ✅ Supports deep cloning                 | Can clone complex objects recursively           |
| ✅ Flexible                              | Modifiable copies without touching the original |
| ✅ Useful in graphics/game dev           | Copying assets, shapes, particles, etc.         |



