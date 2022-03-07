package com.utilitylib;

public class Average {

    public static double avg(int a){
        return a;
    }

    public static double avg(int a, int b){
        return (a + b) / 2;
    }

    public static double avg(int a, int b, int c){
        return (a + b + c) / 3;
    }

    public static double avg(int... arg){
        if(arg == null && arg.length == 0) {
            throw new IllegalArgumentException("Please, put at least one argument!");
        }

        double sum = 0;
        for(int value : arg) {
            sum += arg[0];
        }

        return sum / arg.length;
    }

}
