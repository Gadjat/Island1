package ru.javarush.island.bulimov.entity.animals.carnivores;

import ru.javarush.island.bulimov.entity.animals.Animal;

public class Carnivore extends Animal {
    Carnivore(double weight, int maxItemCell, int maxSpeedInCell, double maxSaturation, double saturation) {
        super(weight, maxItemCell, maxSpeedInCell, maxSaturation, saturation);
    }
}