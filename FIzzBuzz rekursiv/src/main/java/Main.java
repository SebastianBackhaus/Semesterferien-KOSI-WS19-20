public class Main {

    public static void FizzBuzz(int x) {

        int index = x;

        if (index < 20) {
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


    public static void main(String[] args) {
        FizzBuzz (2);
    }

}



