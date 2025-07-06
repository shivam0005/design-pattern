package com.shivam.patterns.creational.factory.structure;

public class FactoryStructure {

    // Product Interface
    interface Car {
        void drive();
    }

    // Concrete Products
    class Sedan implements Car {
        public void drive() { System.out.println("Driving a sedan"); }
    }

    class SUV implements Car {
        public void drive() { System.out.println("Driving an SUV"); }
    }

    // Creator (Factory)
    abstract class CarFactory {
        public abstract Car createCar();
    }

    // Concrete Factories
    class SedanFactory extends CarFactory {
        public Car createCar() { return new Sedan(); }
    }

    class SUVFactory extends CarFactory {
        public Car createCar() { return new SUV(); }
    }

}
