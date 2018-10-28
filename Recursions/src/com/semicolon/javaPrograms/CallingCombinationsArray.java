package com.semicolon.javaPrograms;

public class CallingCombinationsArray {

	public static void main(String[] args) {
		
		String[][] wordlist = { { "Sanu ", "Akash ", "Prachi ", "Vivek " },
				{ "GKN ", "WIPRO ", "RAKUTEN ", "GOOGLE ", "NASA ", "FACEBOOK " },
				{ "GERMANY ", "AUSTRALIA ", "JAPAN ", "USA " },
				{ "Mechanical ", "Voice ", "Software ", "DataScience " } };

		AllCombinationsOfArray RA = new AllCombinationsOfArray();

		RA.PrintRec(wordlist, 0, "", true);
		System.out.println("Done...!");

	}

}
