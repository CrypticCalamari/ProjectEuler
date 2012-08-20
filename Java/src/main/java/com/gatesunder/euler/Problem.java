package com.gatesunder.euler;

import com.gatesunder.euler.IProblem;

public abstract class Problem<T>
	implements IProblem<T>
{
	public T getAnswer() {
		if (!solved)
			answer = solve();
		return answer;
	}
	public String getText() {return text;}
	public boolean isSolved() {return solved;}

	public abstract T solve();

	protected Problem<T> setAnswer( T answer ) {this.answer = answer; return this;}
	protected Problem<T> setSolved( boolean solved ) {this.solved = solved; return this;}
	protected Problem<T> setText( String text ) {this.text = text; return this;}

	private boolean solved;
	private String text;
	private T answer;
}
