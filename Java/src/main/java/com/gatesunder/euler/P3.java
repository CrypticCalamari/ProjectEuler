package com.gatesunder.euler;

import com.gatesunder.euler.Prime;

public class P3
{
	public static void main(String... args)
	{
		P3.solve(600851475143L);
	}

	public static String text() {
		return "P3: Find the largest prime factor of a composite number.";
	}
	public static long solve(long n) {
		long begin, total, answer;
		System.out.println(P3.text());

		begin = System.nanoTime();	// BEGIN
		answer = Prime.getLargestPrimeFactor(n);
		total = System.nanoTime() - begin;	// END

		System.out.println("Answer: " + answer);
		System.out.println("Time: " + total + " ns");

		return answer;
	}
}
