package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createHeroes()));
    }

    public static Hero[] createHeroes() {
        Hero hero = new Hero("medic");
        Hero hero2 = new Hero("lucky");
        Hero hero3 = new Hero("boss");
        return new Hero[]{hero, hero2, hero3};
    }
}