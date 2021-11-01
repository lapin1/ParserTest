package com.tr.task03.bean;

public class Speakers extends Appliance{

    private int powerConsumption;
    private int numberOfSpeakers;
    private int FrequencyRange;
    private double cordLength;

    public Speakers() {

    }

    public Speakers(int id, String category, double price, int powerConsumption, int numberOfSpeakers, int frequencyRange, double cordLength) {
        super(id, category, price);
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.FrequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public int getFrequencyRange() {
        return FrequencyRange;
    }

    public void setFrequencyRange(int frequencyRange) {
        FrequencyRange = frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", FrequencyRange=" + FrequencyRange +
                ", cordLength=" + cordLength +
                '}';
    }
}
