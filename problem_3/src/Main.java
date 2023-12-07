//Largest Prime Factor Problem 3
//Author: Christian Brewer
//Date 23-12-6
//What is the largest prime factor of 600851475143

public class Main {
    public static void main(String[] args) {
        long target = 600_851_475_143L;

        for (long i = target / 2; i > 0; i--) {

        }

    }
}

//To find the largest, factors, we could divide the target in half, then begin checking for factors of every add number
//since 2 is the only prime in this set.

//OR start by finding primes up to target and then just check in reverse order for the first factor. I like this one better.