package com.gatesunder.euler;

import com.gatesunder.euler.ISolution;

public abstract class Solution<T>
	implements ISolution<T>
{
	public abstract T solve();
}
