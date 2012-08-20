package com.gatesunder.euler;

import com.gatesunder.euler.Problem;
import com.gatesunder.euler.Palindrome;

public class P4
	extends Problem<Long>
{
	public P4() {
		this.setSolved( false )
			.setAnswer( new Long(0) )
			.setText( "A palindromic number reads the same both ways./nThe largest palindrome made from the product of two 2-digit numbers is 9009 = 91 * 99./n/nFind the largest palindrome made from the product of two 3-digit numbers." );
	}

	public static void main(String... args) {
		long begin, total;
		Long answer;
		P4 problem = new P4();

		System.out.println( problem.getText() );

		begin = System.nanoTime();	// BEGIN
		answer = problem.getAnswer();
		total = System.nanoTime() - begin;	// END

		System.out.println("Answer: " + answer);
		System.out.println("Time: " + total + " ns");
	}

	public Long solve() {
		long currentLargest = 0;

		for (int i = 100; i < 999; i++)
			for (int j = i; j < 999; j++)
				if (Palindrome.isPalindrome(i * j))
					if (i * j > currentLargest)
						currentLargest = i * j;
		this.setSolved( true );
		return new Long( currentLargest );
	}
}
