package com.lysachenko;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        array.add(3);
        array.add(9);
        array.add(11);
        array.add(18);
        array.add(20);
        array.add(22);

        System.out.print("Source array: ");
        array.forEach(i -> System.out.print(i + " "));
        array.removeIf(i -> i % 3 == 0);
        System.out.print("\nArray after filtering: ");
        array.forEach(i -> System.out.print(i + " "));
        System.out.println();

        FruitsList fruits = new FruitsList();

        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Lemon");
        fruits.add("Watermelon");
        fruits.add("Pineapple");

        fruits.replace("Lemon1", "New fruit");
        fruits.showFruits();
        System.out.println();
        fruits.replace("Lemon", "New fruit");
        fruits.showFruits();

        List<Integer> integerList1 = new ArrayList<>();
        List<Integer> integerList2 = new ArrayList<>();

        integerList1.add(1);
        integerList1.add(1);
        integerList1.add(1);
        integerList1.add(2);
        integerList1.add(3);
        integerList1.add(4);

        integerList2.add(1);
        integerList2.add(3);
        integerList2.add(4);
        integerList2.add(4);
        integerList2.add(4);

        List<String> stringList1 = new ArrayList<>();
        List<String> stringList2 = new ArrayList<>();

        stringList1.add("Orange");
        stringList1.add("Orange");
        stringList1.add("Apple");
        stringList1.add("Banana");

        stringList2.add("Apple");
        stringList2.add("Banana");
        stringList2.add("Lemon");
        stringList2.add("Orange");
        stringList2.add("Orange");
        stringList2.add("Pineapple");

        GenericLists<String> genericListsOfString = new GenericLists<>(stringList1, stringList2);
        GenericLists<Integer> genericListsOfInteger = new GenericLists<>(integerList1, integerList2);

        System.out.println();
        genericListsOfString.showSame();
        genericListsOfInteger.showSame();
    }
}
