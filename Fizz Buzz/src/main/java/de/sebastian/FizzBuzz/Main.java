package de.sebastian.fizzbuzz;

import java.util.LinkedList;

public class Main {

    public static void  main(String[] args) {

        System.out.println(FizzBuzznormal(1,20));

        System.out.println("Rekursiv: ");

        LinkedList<String>Listerekursiv= new LinkedList();

        FizzBuzzRekursiv(1,Listerekursiv,20);
        System.out.println(Listerekursiv);

    }

    public static  LinkedList FizzBuzznormal(int min,int max)  {

        LinkedList  Liste1 =new LinkedList();

        for (int i = min; i < max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                Liste1.add("Fizz-Buzz");
            } else if (i % 3 == 0) {
                Liste1.add("Fizz");
            } else if (i % 5 == 0) {
                Liste1.add("Buzz");
            } else {
                Liste1.add(""+i);
            }
        }

        return Liste1;

    }



    LinkedList Liste2 = new LinkedList();

    public static void FizzBuzzRekursiv(int x, LinkedList<String> Liste2,int max) {



        int index = x;

        if (index < max) {
            if (index % 3 == 0 && index % 5 == 0) {
                Liste2.add("Fizz-Buzz");
            } else if (index % 3 == 0) {
                Liste2.add("Fizz");
            } else if (index % 5 == 0) {
               Liste2.add("Buzz");
            } else {
                Liste2.add(""+index);
            }
            index ++;
            FizzBuzzRekursiv (index,Liste2,max);
        }

    }
}



