package org.example;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static boolean validateInput(int userInput) {
        if (userInput < 0 || userInput > 1000) {
            System.out.println("Please input a number from 0-1000");
            return false;
        }
        if (userInput == 0 || userInput == 1) {
            System.out.println("Numbers 0 and 1 are not prime numbers.");
            return false;
        }
        return true;
    }
    static int countPrimes(int userInput) {
        boolean[] isPrime = new boolean[userInput + 1];
        Arrays.fill(isPrime, true);
        // 0 and 1 are not prime numbers
        isPrime[0] = isPrime[1] = false;
        // Sieve of Eratosthenes
        for (int i = 2; i <= Math.sqrt(userInput); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= userInput; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (boolean prime : isPrime) {
            if (prime) {
                count++;
            }
        }
        return count;
    }
    static long sumPrimes(int userInput) {
        boolean[] isPrime = new boolean[userInput + 1];
        Arrays.fill(isPrime, true);
        // 0 and 1 are not prime numbers
        isPrime[0] = isPrime[1] = false;
        // Sieve of Eratosthenes
        for (int i = 2; i <= Math.sqrt(userInput); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= userInput; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        long sum = 0;
        for (int i = 2; i <= userInput; i++) {
            if (isPrime[i]) {
                sum += i;
            }
        }
        return sum;
    }
    static int printCount(int userInput) {
        return countPrimes(userInput);
    }
    static Long printSum(int userInput) {
        return sumPrimes(userInput);
    }
    public static void main(String[] args) {
        System.out.println("Pick a number between 0 and 1000 or type 9999 to quit.");
        Scanner sr = new Scanner(System.in);
        int userInput;
        do {
            userInput = sr.nextInt();
            if (validateInput(userInput)) {
                System.out.println("Amount of primes are " + printCount(userInput));
                System.out.println("The sum of these are " + printSum(userInput));
            }

        }
        while (userInput != 9999);
    }
}