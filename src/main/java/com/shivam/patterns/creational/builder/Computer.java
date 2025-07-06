package com.shivam.patterns.creational.builder;

public class Computer {

    // required
    private final String cpu;

    // optional

    private final String ram;
    private final String ssd;
    private final String graphicsCard;
    private final boolean wifi;
    private final boolean bluetooth;

    // Private constructor
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.ssd = builder.ssd;
        this.graphicsCard = builder.graphicsCard;
        this.wifi = builder.wifi;
        this.bluetooth = builder.bluetooth;
    }


    // nested builder

    public static class Builder {
        private final String cpu;

        private String ram;
        private String ssd;
        private String graphicsCard;
        private boolean wifi;
        private boolean bluetooth;

        public Builder(String cpu){
            this.cpu = cpu;
        }

        public Builder ram(String ram){
            this.ram =ram;
            return this;
        }

        public Builder ssd(String ssd){
            this.ssd = ssd;
            return this;
        }

        public Builder graphicsCard(String graphicsCard){
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder wifi(boolean wifi){
            this.wifi = wifi;
            return this;
        }

        public Builder bluetooth(boolean bluetooth){
            this.bluetooth = bluetooth;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }


    public void specs() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("SSD: " + ssd);
        System.out.println("Graphics: " + graphicsCard);
        System.out.println("WiFi: " + wifi);
        System.out.println("Bluetooth: " + bluetooth);
    }
}
