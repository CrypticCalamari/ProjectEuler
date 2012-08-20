package com.gatesunder.euler;

public class Palindrome
{
	public static boolean isPalindrome( String S ) {
		return S == reverseString( S );
	}
	public static boolean isPalindrome( long N ) {
		return N == reverseInt( N );
	}

	public static String reverseString( String S ) {
		StringBuilder SB = new StringBuilder();

		for (int i = S.length() - 1; i >= 0; i--)
			SB.append( S.charAt( i ) );
		return SB.toString();
	}
	public static long reverseInt( long N ) {
		long T, RN = 0;

		while (N != 0) {
			RN *= 10;
			T = N;
			N /= 10;
			N *= 10;
			T -= N;
			RN += T;
			N /= 10;
		}
		return RN;
	}
}
