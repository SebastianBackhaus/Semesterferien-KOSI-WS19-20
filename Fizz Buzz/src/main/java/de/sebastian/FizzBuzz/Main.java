package de.sebastian.FizzBuzz;
public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz-Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        System.out.println("Rekursiv: ");
        FizzBuzz(20);

    }


    public static void FizzBuzz(int x) {

        int index = x;

        if (index < 30) {
            if (index % 3 == 0 && index % 5 == 0) {
                System.out.println("Fizz-Buzz");
            } else if (index % 3 == 0) {
                System.out.println("Fizz");

            } else if (index % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(index);
            }
            index ++;
            FizzBuzz (index);
        }
    }
}



