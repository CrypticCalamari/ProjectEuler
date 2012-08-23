package com.gatesunder.euler;

import com.gatesunder.euler.Solution;

public class S2
	extends Solution<Long>
{
	public Long solve() {
		long answer=2, f1=1, f2=2, temp;

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
			answer += f2;
		}
		return new Long( answer );
	}
}
