package com.gatesunder.euler;

import java.util.ArrayList;

import com.gatesunder.euler.P1;
import com.gatesunder.euler.P2;
import com.gatesunder.euler.P3;
import com.gatesunder.euler.P4;

public class Euler
{
	public static void main(String... args) {
		ArrayList< Problem<Long> > problemSet = new ArrayList< Problem<Long> >();
		problemSet.add( new P1() );
		problemSet.add( new P2() );
		problemSet.add( new P3() );
		problemSet.add( new P4() );

		for (Problem<Long> p: problemSet)
			presentSolution( p );
	}

	public static void presentSolution( Problem<Long> p ) {
		long begin, totalTime;
		Long answer;

		System.out.println( p.getText() );

		begin = System.nanoTime();
		answer = p.getAnswer();
		totalTime = System.nanoTime() - begin;

		System.out.println( "Answer: " + answer );
		System.out.println( "Time: " + totalTime + " ns" );
	}
}
