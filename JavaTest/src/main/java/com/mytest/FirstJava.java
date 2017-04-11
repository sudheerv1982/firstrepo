package com.mytest;

/**
 * @author Sudheer Vedanaparthi
 *
 */
public class FirstJava {
	public static void main(String[] args) {
		if (args != null && args.length == 0) {
			System.out.println("No Arguments Passed to this program");
		} else {
			System.out.println(args[0] + args[1]);
		}
	}
}


