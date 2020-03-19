package de.sbackhaus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {

        System.out.println(
                "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16,17,Fizz,19"
        );
    }

    @Test
    void fizzBuzz() {
        System.out.println(
                "Buzz,Fizz,22,23,Fizz,Buzz,26,Fizz,28,29"
        );
    }
}