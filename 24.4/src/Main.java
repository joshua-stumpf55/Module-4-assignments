//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        PrimeNumbersDescending();
    }


    public static void PrimeNumbersDescending() {


        Stack<Integer> primeStack = new Stack<>();

        // Number of prime numbers to find
        int numberOfPrimes = 50;
        int count = 0;
        int number = 2; 

        // Find the first 50 prime numbers
        while (count < numberOfPrimes) {
            if (isPrime(number)) {
                primeStack.push(number);
                count++;
            }
            number++;
        }

        // Display the prime numbers
        System.out.println("The first 50 prime numbers in descending order are:");
        while (!primeStack.isEmpty()) {
            System.out.println(primeStack.pop());
        }
    }

    //check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}
