/*
 * Date created: March 12, 2019
 * Author: Juan A. Uribe
 * Description: This program finds the nth Fibonacci number
 * Works correctly up to the 46th Fibonacci number
 */

public class fibonacci {
	public static void main(String[] args) {
	
	int num = 46; // The Fibonacci number to be found
	int x = fib(num);
	
	System.out.println(x);
	}
	
//Function implementing fibonacci algorithm using recursion	
	public static int fib(int n ) {
		if (n == 0) {
			return 0;
		} else if ( n == 1) {
			return 1;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}
	
}
