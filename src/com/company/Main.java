package com.company;

public class Main {

    public static void main(String[] args) {
        for (float i = 1f; i < 101f; i++) {

            if (i == 42){
                System.out.println(i + " Answer to the Ultimate Question of Life, the Universe, and Everything");
            }
            else if (i % 3 == 0 && i%5 == 0){
                System.out.println(i/3 + "Fizzbuzz");
            }
            else if (i % 3 == 0){
                System.out.println(i/3 + "Fizz");
            }
            else if (i % 5 == 0){
                System.out.println(i/5 + "Buzz");
            }
            else{
                System.out.println(i);
            }

        }
    }
}
