public class NewtonRootMethod{
	
	public static void main(String[] args) {
		
		double x = 1;
		double xprime = 2;
		double num = 5;
		double appRoot = 0;
		double newtMethod = 0;
		int i =0;
		appRoot = findGuess(num);
		/*
		 * fx = x^2 - num
		 * fprimex = 2x
		 */
		
		newtMethod = appRoot - x/xprime;
		
		//approximate Newton Method to X5 root
		
		for(i = 0; i < 3; i++) {
			newtMethod = newtMethod - (newtMethod*newtMethod - num)/(2*newtMethod);
		}
		System.out.println("Using F(x) = x^2 - num and F'(x) = 2x");
		System.out.println("Newton's " + i + " approximation of root for number " + num + " is " + newtMethod);
		
		
	
		
	}
	
	public static double findGuess( double num) {
		
		double rootN = 0;
		while ( num > rootN*rootN ) {
			++rootN;
		}
		return rootN;
	}
}