package com.mytest;

public class StringReverse1 {

	public static void main(String[] args) {
		String st = "NEERAJA";
		String reverseStr = "";

		int stLength = st.length();

		for (int i = stLength - 1; i >= 0; i--) {
			reverseStr += st.charAt(i);
		}

		System.out.println(reverseStr);
	}

}
