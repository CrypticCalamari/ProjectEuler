package com.gatesunder.euler;

import com.gatesunder.euler.IProblem;

public class Problem<T>
	implements IProblem<T>
{
	protected Problem( Solution<T> solution, String text ) {
		this.solution = solution;
		this.text = text;
		this.solved = false;
		this.answer = null;
	}
	public T getAnswer() {
		if (!solved)
			answer = solve();
		return answer;
	}
	public String getText() {return text;}
	public boolean isSolved() {return solved;}
	public T solve() {
		solved = true;
		return solution.solve();
	}

	private Solution<T> solution;
	private boolean solved;
	private T answer;
	private String text;
}
