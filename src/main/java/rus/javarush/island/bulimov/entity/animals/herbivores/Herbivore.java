package rus.javarush.island.bulimov.entity.animals.herbivores;

import rus.javarush.island.bulimov.entity.animals.Animal;

public class Herbivore extends Animal {
    public Herbivore(double weight, int maxItemCell, int maxSpeedInCell, double maxSaturation, double saturation) {
        super(weight, maxItemCell, maxSpeedInCell, maxSaturation, saturation);
    }

}