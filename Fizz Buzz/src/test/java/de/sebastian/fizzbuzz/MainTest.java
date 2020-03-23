package de.sebastian.fizzbuzz;

import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void fizzBuzznormal() {
        LinkedList<String> Liste1Test = Main.FizzBuzznormal(3,10);

        assertEquals(7,Liste1Test.size());

        assertEquals ("Fizz",Liste1Test.get(0));
        assertEquals ("4",Liste1Test.get(1));
        assertEquals ("Buzz",Liste1Test.get(2));
        assertEquals ("Fizz",Liste1Test.get(3));
        assertEquals ("7",Liste1Test.get(4));
        assertEquals ("8",Liste1Test.get(5));
        assertEquals ("Fizz",Liste1Test.get(6));

    }

    @Test
    void fizzbuzznormalbackwards(){

        LinkedList<String> Liste1Test = Main.FizzBuzznormal(10,3);

        assertEquals(Liste1Test.size(),0);
    }

    @Test
    void fizzbuzznormalsingle(){

        LinkedList<String> Liste1Test = Main.FizzBuzznormal(10000,10001);

        assertEquals (Liste1Test.size(),1);
        assertEquals (Liste1Test.get(0),"Buzz");
    }

    @Test
    void fizzbuzznormalnegativ(){
        LinkedList<String> Liste1Test = Main.FizzBuzznormal(-5,1);

        assertEquals (Liste1Test.size(),6);
        assertEquals ("Buzz",Liste1Test.get(0));
        assertEquals ("-4",Liste1Test.get(1));
        assertEquals ("Fizz",Liste1Test.get(2));
        assertEquals ("-2",Liste1Test.get(3));
        assertEquals ("-1",Liste1Test.get(4));
        assertEquals ("Fizz-Buzz",Liste1Test.get(5));

    }

    @Test
    void fizzBuzzRekursiv() {

        LinkedList<String> Liste1Test = new LinkedList<>();

        Main.FizzBuzzRekursiv(3,Liste1Test,10);

        assertEquals (7,Liste1Test.size());
        assertEquals ("Fizz",Liste1Test.get(0));
        assertEquals ("4",Liste1Test.get(1));
        assertEquals ("Buzz",Liste1Test.get(2));
        assertEquals ("Fizz",Liste1Test.get(3));
        assertEquals ("7",Liste1Test.get(4));
        assertEquals ("8",Liste1Test.get(5));
        assertEquals ("Fizz",Liste1Test.get(6));

    }

    @Test
    void fizzbuzzrekursivbackwards(){
        LinkedList<String> Liste1Test = new LinkedList<>();

        Main.FizzBuzzRekursiv(10,Liste1Test,3);

        assertEquals (Liste1Test.size(),0);


    }

    @Test
    void fizzbuzzrekursivsingle(){

        LinkedList<String> Liste1Test = new LinkedList<>();
        Main.FizzBuzzRekursiv(10000,Liste1Test,10001);

        assertEquals (Liste1Test.size(),1);
        assertEquals (Liste1Test.get(0),"Buzz");


    }

    @Test
    void fizzbuzzrekursivnegativ(){
        LinkedList<String> Liste1Test = new LinkedList<>();
       Main.FizzBuzzRekursiv(-5,Liste1Test,1);

        assertEquals (Liste1Test.size(),6);
        assertEquals ("Buzz",Liste1Test.get(0));
        assertEquals ("-4",Liste1Test.get(1));
        assertEquals ("Fizz",Liste1Test.get(2));
        assertEquals ("-2",Liste1Test.get(3));
        assertEquals ("-1",Liste1Test.get(4));
        assertEquals ("Fizz-Buzz",Liste1Test.get(5));

    }

}