package com.gatesunder.euler;

import com.gatesunder.euler.Solution;
import com.gatesunder.euler.util.Palindrome;

public class S4
	extends Solution<Long>
{
	public Long solve() {
		long answer = 0;

		for (int i = 100; i < 1000; i++)
			for (int j = 100; j < 1000; j++)
				if (Palindrome.isPalindrome( i*j ) && i*j > answer)
					answer = i*j;

		return new Long( answer );
	}
}
