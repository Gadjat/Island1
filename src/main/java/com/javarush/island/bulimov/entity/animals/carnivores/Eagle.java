package com.javarush.island.bulimov.entity.animals.carnivores;

public class Eagle extends Carnivore{
    public Eagle(double weight, int maxItemCell, int maxSpeedInCell, double maxSaturation, double saturation) {
        super(weight, maxItemCell, maxSpeedInCell, maxSaturation, saturation);
        this.name = "Eagle";
    }
}
