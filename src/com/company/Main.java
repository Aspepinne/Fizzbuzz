package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {

            if (i == 42){
                System.out.println(i + " Answer to the Ultimate Question of Life, the Universe, and Everything");
            }
            else if (i % 3 == 0 && i%5 == 0){
                System.out.println( i + " Fizzbuzz");
            }
            else if (i % 3 == 0){
                System.out.println(i + " Fizz");
            }
            else if (i % 5 == 0){
                System.out.println(i + " Buzz");
            }
            else{
                System.out.println(i);
            }
        }

        System.out.println("So long and thanks for all the fish");

    }
}
