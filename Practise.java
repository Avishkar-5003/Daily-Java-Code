package com.practise;

public class Practise {

   
    public String isPrime(int num) {
        if (num <= 1) {
            return "No, number is not prime";
        }

      for (int i = 2; i <= num / 2; i++) {
           if (num % i == 0) {
                return "No, number is not prime";
          }
       }

        return "Yes, number is prime";
    }

    
}
