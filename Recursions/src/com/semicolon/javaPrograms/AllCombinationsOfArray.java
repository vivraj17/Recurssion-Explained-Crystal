package com.semicolon.javaPrograms;

public class AllCombinationsOfArray {

	public void PrintRec(String Arr[][], int i, String S, Boolean flag) {

		String A[] = Arr[i];
		for (int j = 0; j < A.length; j++) {

			if (flag) {

				i++;
			} else {
				flag = true;
			}

			if (i < Arr.length) {
				PrintRec(Arr, i, S + A[j], flag);
				flag = false;
				System.out.println("----");
			}

			if (flag) {

				System.out.println(S + A[j]);
			}

		}

	}
}
