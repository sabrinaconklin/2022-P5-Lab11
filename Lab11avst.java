// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11avst {
    public static void main(String[] args) {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the primes upper bound ===>>  ");
        final int MAX = input.nextInt();
        boolean primes[] = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[]) {
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        // Step 1: treat all numbers as prime
        // Write a loop that changes ALL numbers to prime (true) in the array.
        for (int k = 2; k < primes.length; k++) {
            // Change all the values to true here
            primes[k] = true;
        }

        // Step 2: This is where you remove the primes
        // To start, JUST remove the multiples of 2
        for( int g = 2; g < primes.length; g++) {
            for (int k = 2 * g; k < primes.length; k += g) {
                primes[k] = false;
            }
        }
    }


    public static void displayPrimes(boolean primes[]) {
        System.out.println("\n\nPRIMES BETWEEN 1 AND " + primes.length);
        System.out.println();
        int counter = 0;
        for (int k = 2; k < primes.length; k++) {
            if(primes[k] == true)
            {
                System.out.print(k + " ");
                counter++;
                if (counter == 15) {
                    counter = 0;
                    System.out.println();
                }

            }
        }

    }
}



