package com.mytest;

/**
 * @author Sudheer Vedanaparthi
 *
 */
public class StringReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String st = "NEERAJA";
		
		System.out.println(reverse(st));
	}
	
	private static String reverse(String st) {
		if(st == null || st.length() <= 1) {
			return st;
		}
		
		return reverse(st.substring(1)) + st.charAt(0);
	}
}
