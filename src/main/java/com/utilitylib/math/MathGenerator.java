package com.utilitylib.math;

import java.util.Random;

public class MathGenerator {

    public static void main(String... args) {
        generateTwoPositionNumbers();
    }

    public static void generateOnePositionNumbers(){
        for(int index = 0; index < 300; index++) {
            Random rand = new Random();
            int x = rand.nextInt(10);
            int y = rand.nextInt(10);
            System.out.println(x + " + " + y + " = ");
        }
    }

    public static void generateTwoPositionNumbers(){
        for(int index = 0; index < 300; index++) {
            Random rand = new Random();
            int x = rand.nextInt(20);
            int y = rand.nextInt(20);
            System.out.println(x + " + " + y + " = ");
        }
    }

}
