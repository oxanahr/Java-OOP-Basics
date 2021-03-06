package com.company.wildFarm.animals;

import com.company.wildFarm.foods.*;

public class Mouse extends Mammal{

    public Mouse(String name, double weight, String livingRegion) {
        super(name, weight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat){
            throw new IllegalArgumentException("Mouses are not eating that type of food!");
        }
        if (food.getQuantity() <= 0){
            throw new IllegalArgumentException("A cheese was just eaten!");
        }

        this.foodEaten += food.getQuantity();
    }

    @Override
    public String makeSound() {
        return "SQUEEEAAAK!";
    }
}
