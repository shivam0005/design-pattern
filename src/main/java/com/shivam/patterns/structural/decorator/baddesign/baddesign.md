**// Base class**

    public class Coffee {

        public String getDescription() {
            return "Plain Coffee";
        }

        public int getCost() {
            return 100;
        }
    }

**// Add-on: Coffee with Milk**

    public class CoffeeWithMilk extends Coffee {
        @Override
        public String getDescription() {
            return super.getDescription() + ", Milk";
        }

        @Override
        public int getCost() {
            return super.getCost() + 20;
        }
    }

**// Add-on: Coffee with Sugar**

    public class CoffeeWithSugar extends Coffee {
        @Override
        public String getDescription() {
            return super.getDescription() + ", Sugar";
        }

        @Override
        public int getCost() {
            return super.getCost() + 10;
        }
    }

// Add-on: Coffee with Milk and Sugar

    public class CoffeeWithMilkAndSugar extends Coffee {
        @Override
        public String getDescription() {
            return super.getDescription() + ", Milk, Sugar";
        }

        @Override
        public int getCost() {
            return super.getCost() + 30;
        }
    }


# 😵 Problem With This Approach

You have to create one class per combination!

What if tomorrow the customer wants Milk + Cream + Hazelnut + Sugar?

You’d need CoffeeWithMilkCreamHazelnutSugar class.

❗ This leads to:

* Class explosion
* Code duplication
* Tight coupling
* No flexibility at runtime


# ✅ Solution: Use Decorator Pattern

_Instead of hardcoding all combinations…_ 

* You have one base class
* You add decorators for each topping
* You stack them dynamically at runtime

This keeps your code open for extension but closed for modification (OCP principle of SOLID).