package com.gatesunder.euler.util;

import java.util.ArrayList;
import java.util.Collections;

public class Prime
{
	public static boolean isPrime(long p) {
		long n = 2;
		boolean answer = true;

		while (n*n <= p) {
			if (p % n == 0) {
				answer = false;
				break;
			}
			n++;
		}
		return answer;
	}

	public static long getLargestPrimeFactor(long n) {
		ArrayList<Long> factors = getPrimeFactors( n );

		Collections.sort(factors);

		return factors.get( factors.size() - 1 );
	}

	public static ArrayList<Long> getPrimeFactors(long n) {
		ArrayList<Long> factors = new ArrayList<Long>();
		Factorization f = getFactorization( n );

		if (f.factors[0] == 1)
			return factors;
		
		factors.add( new Long(f.factors[0]) );

		while (f.factors[0] != 1) {
			f = getFactorization( f.factors[1] );
			if (f.factors[0] != 1)
				factors.add( new Long(f.factors[0]) );
		}
		factors.add( new Long(f.factors[1]) );

		return factors;
	}

	public static Factorization getFactorization( long n ) {
		if ((n & 1) == 0) return new Factorization( 2, n/2 );

		for (int i = 3; i*i <= n; i++)
			if (n % i == 0)
				return new Factorization(i, n/i);
		return new Factorization(1, n);
	}
}

class Factorization
{
	public Factorization( long a, long b ) {
		factors = new long[2];
		factors[0] = a;
		factors[1] = b;
	}
	public long [] factors;
}





