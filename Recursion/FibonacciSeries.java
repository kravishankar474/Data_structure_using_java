/* Fibonacci series in Java by Ravishankar Kumar*/

package Recursion;

public class FibonacciSeries {

	public static void main(String[] args) {
		FibonacciSeries FibonacciSeries = new FibonacciSeries();
		var ans = FibonacciSeries.fibonacci(-1);
		System.out.println(ans);
	}
	
	public int fibonacci(int n) {
		
		if(n<0) {
			return -1;
		}
		if(n==0 || n==1) {
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}

}
