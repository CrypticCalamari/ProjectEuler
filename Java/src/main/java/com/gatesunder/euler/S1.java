package com.gatesunder.euler;

import com.gatesunder.euler.Solution;

public class S1
	extends Solution<Long>
{
	public Long solve() {
		long answer = 0;

		for (int i = 0; i < 1000; i++)
			if (i % 3 == 0 || i % 5 == 0)
				answer += i;
		return new Long( answer );
	}
}
