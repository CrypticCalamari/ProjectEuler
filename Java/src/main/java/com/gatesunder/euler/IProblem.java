package com.gatesunder.euler;

public interface IProblem<T>
{
	public T getAnswer();
	public boolean isSolved();
	public String getText();

	public T solve();
}
