package com.gatesunder.euler;

public class P2
{
	public static void main(String... args)
	{
		P2.solve();
		P2.solveFaster();
	}

	public static String text() {
		return "P2: By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.";
	}
	public static long solve() {
		long s=2, f1=2, f2=3, t1, dt, temp;
		System.out.println(P2.text());

		t1 = System.nanoTime();	// BEGIN
		while (f2 < 4000000) {
			temp = f2;
			f2 = f1 + f2;
			f1 = temp;
			s += (f2 % 2 == 0 ? f2 : 0);
		}
		dt = System.nanoTime() - t1;	// END

		System.out.println("Answer: " + s);
		System.out.println("Time: " + dt + " ns");

		return s;
	}
	public static long solveFaster() {
		long s=2, f1=1, f2=2, t1, dt, temp;
		System.out.println(P2.text());

		t1 = System.nanoTime();	// BEGIN
		while (f2 < 4000000) {
			// ODD (Duck ...)
			temp = f2;
			f2 = f1 + f2;
			f1 = temp;

			// ODD (Duck ...)
			temp = f2;
			f2 = f1 + f2;
			f1 = temp;

			// EVEN (GOOSE!)
			temp = f2;
			f2 = f1 + f2;
			f1 = temp;

			if (f2 > 4000000)
				break;
			s += f2;
		}
		dt = System.nanoTime() - t1;	// END

		System.out.println("Answer: " + s);
		System.out.println("Time: " + dt + " ns");

		return s;
	}
	public static long nthFibo(long n, long f1, long f2) {
		return (n == 0 ? f2 : nthFibo( n - 1, f2, f1 + f2 ));
	}
}
