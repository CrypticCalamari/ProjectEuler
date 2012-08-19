package com.gatesunder.euler;

public class Palindrome
{
	public static boolean isPalindrome( String S ) {
		return S == reverseString( S );
	}
	public static boolean isPalindrome( int N ) {
		return N == reverseInt( N );
	}

	public static String reverseString( String S ) {
		StringBuilder SB = new StringBuilder();

		for (int i = S.length(); i >= 0; i--)
			SB.append( S.charAt( i ) );

		System.out.println( SB.toString() );
		return SB.toString();
	}
	public static int reverseInt( int N ) {
		int T, RN = 0;

		System.out.println("BEGIN");
		System.out.println(N);
		while (N != 0) {
			RN *= 10;
			T = N;
			N /= 10;
			N *= 10;
			T -= N;
			RN += T;
			N /= 10;
			System.out.println(N);
			System.out.println(RN);
		}
		System.out.println(RN);
		System.out.println("END");
		return RN;
	}
}
