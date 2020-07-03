package com.lysachenko;

import java.util.ArrayList;
import java.util.List;

public class FruitsList {

    private List<String> fruits;

    public FruitsList() {
        this.fruits = new ArrayList<>();
    }

    public boolean add(String fruit) {
        return fruits.add(fruit);
    }

    public String get(int index) {
        return fruits.get(index);
    }

    public boolean remove(String fruit) {
        return fruits.remove(fruit);
    }

    public void showFruits() {
        fruits.forEach(s -> System.out.print(s + " "));
    }

    public void replace(String replacedFruit, String fruit) {
        int count = 0;
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).toLowerCase().equals(replacedFruit.toLowerCase())) {
                fruits.set(i, fruit);
                count++;
            }
        }
        if (count < 1) {
            System.out.println("No such element!");
        }
    }
}
