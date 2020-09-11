package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {

            if (i == 42){
                System.out.println("Answer to the Ultimate Question of Life, the Universe, and Everything");
            }
            else if (i % 3 == 0 && i%5 == 0){
<<<<<<< HEAD
                System.out.println( i + " Fizzbuzz");
            }
            else if (i % 3 == 0){
                System.out.println(i + " Fizz");
            }
            else if (i % 5 == 0){
                System.out.println(i + " Buzz");
=======
                System.out.println("Fizzbuzz");
            }
            else if (i % 3 == 0){
                System.out.println("Fizz");
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
>>>>>>> 5a37168dbbf4b77cdf6b688b5d23357f71c59d2c
            }
            else{
                System.out.println(i);
            }
        }

        System.out.println("So long and thanks for all the fish");

    }
}
