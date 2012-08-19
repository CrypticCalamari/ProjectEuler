package com.gatesunder.euler;

import com.gatesunder.euler.Palindrome;

public class P4
{
	public static void main(String... args)
	{
		P4.solve();
	}

	public static String text() {
		return "P4: Find the largest palindrome made from the product of two 3-digit numbers.";
	}
	public static int solve() {
		long begin, total;
		int answer = 0, T, N = 999;
		boolean found = false;
		System.out.println(P4.text());

		begin = System.nanoTime();	// BEGIN
		while (N > 100 & !found) {
			T = N;
			while (T >= 100) {
				if (found = Palindrome.isPalindrome(T * N)) {
					answer = T * N;
					break;
				}
				T--;
			}
		}
		total = System.nanoTime() - begin;	// END

		System.out.println("Answer: " + answer);
		System.out.println("Time: " + total + " ns");

		return answer;
	}
}
