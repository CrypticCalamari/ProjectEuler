package com.gatesunder.euler;

public class P1
{
	public static void main(String... args)
	{
		P1.solve();
	}

	public static String text() {
		return "P1: Add all the natural numbers below one thousand that are multiples of 3 or 5.";
	}
	public static int solve() {
		System.out.println(P1.text());
		int answer = 0;
		long begin, time;

		begin = System.nanoTime();	// BEGIN
		for (int i = 0; i < 1000; i++)
			if (i % 3 == 0 || i % 5 == 0)
				answer += i;
		time = System.nanoTime() - begin;	// END

		System.out.println("Answer: " + answer);
		System.out.println("Time: " + time + " ns");

		return answer;
	}
	public static int solve(int... divisors) {
		int answer = 0;

		for (int i = 1; i < 1000; i++)
			for (int D: divisors)
				if (i % D == 0)
					answer += i;
		return answer;
	}
}
