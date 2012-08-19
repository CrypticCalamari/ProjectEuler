package com.gatesunder.euler;

public class GCD
{
	public static long gcd( long a, long b ) {
		long temp;
		while (b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	public static long recursiveGCD( long a, long b ) {
		if (b == 0)
			return a;
		return recursiveGCD( b, a % b );
	}
	public static long recursiveBinaryGCD( long a, long b ) {
		if (a == b)
			return a;
		if (a == 0)
			return b;
		if (b == 0)
			return a;

		if (~a & 1)
			if (b & 1)
				return recursiveBinaryGCD( a >> 1, b );
			else
				return recursiveBinaryGCD( a >> 1, b >> 1 ) << 1;
		if (~b & 1)
			return recursiveBinaryGCD( a, b >> 1 );
		
		if (a > b)
			return recursiveBinaryGCD( (a - b) >> 1, b );

		return recursiveBinaryGCD( (b - a) >> 1, a );
	}

	public static long binaryGCD( long a, long b ) {
		long shift;

		if (a == 0) return a;
		if (b == 0) return b;

		for (shift = 0; ((a | b) & 1) == 0; shift++) {
			a = a >>> 1;
			b = b >>> 1;
		}

		while ((a & 1) == 0)
			a = a >>> 1;

		do {
			while ((b & 1) == 0)
				b = b >>> 1;

			if (a > b) {
				long temp = b;
				b = a;
				a = temp;
			}
			b -= a;
		} while (b != 0);

		return a << shift;
	}
}
