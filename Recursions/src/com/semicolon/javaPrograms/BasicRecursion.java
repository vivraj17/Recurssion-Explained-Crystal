package com.semicolon.javaPrograms;

public class BasicRecursion {

	public void RecArr(int i, String S) {

		String A = " ";
		S = A + S;
		System.out.println(S);
		i--;
		if (i > 0) {

			RecArr(i, S);
		}

		System.out.println(S);
	}

}
