package com.dsa.practice;

import java.util.stream.IntStream;

public class ChecksPrime2 {

	public static boolean isPrime(int num) {
        return num > 1 &&
               IntStream.rangeClosed(2, (int) Math.sqrt(num))
                        .noneMatch(i -> num % i == 0);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(18));
    }
}
