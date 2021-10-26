package com.tr.task03.entity;

public class Laptop extends Appliance{

    private int batteryCapacity;
    private String os;
    private int memoryRom;
    private int systemMemory;
    private String cpu;
    private double displayInches;

    public Laptop() {

    }

    public Laptop(int id, String category, double price, int batteryCapacity, String os, int memoryRom, int systemMemory, String cpu, double displayInches) {
        super(id, category, price);
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public String getCpu() {
        return cpu;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", cpu='" + cpu + '\'' +
                ", displayInches=" + displayInches +
                '}';
    }
}
