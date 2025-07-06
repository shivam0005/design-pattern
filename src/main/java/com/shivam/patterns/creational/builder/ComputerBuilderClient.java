package com.shivam.patterns.creational.builder;

public class ComputerBuilderClient {

    public static void main(String[] args) {
        Computer computer = new Computer.Builder("Intel I7")
                .ram("16GB")
                .ssd("512GB")
                .graphicsCard("NVIDIA RTX 4060")
                .wifi(true)
                .bluetooth(true)
                .build();

        computer.specs();
    }
}
