package com.gatesunder.euler;

import com.gatesunder.euler.Solution;
import com.gatesunder.euler.util.Prime;

public class S3
	extends Solution<Long>
{
	public Long solve() {
		return new Long(Prime.getLargestPrimeFactor(600851475143L));
	}
}
