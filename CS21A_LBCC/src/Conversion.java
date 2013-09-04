import java.util.Scanner;

/*
 * Author: Juan A. Uribe
 * Date: September 3, 2013
 * Conversion program. Converts feet and inches to centimeters
 * 
 * Accepts input from console and outputs to console as well
 */

public class Conversion {
	
	static Scanner console = new Scanner( System.in ) ;
	static final double CPI = 2.54 ; // Centimeters per inch
	static final int IPF = 12 ; //Inches per foot
	
	
	public static void main( String[] args) {
		
		//Variables
		int feet = 0 ;
		int inches = 0 ;
		int totalInches = 0 ;
		
		double centims = 0 ;
		
		//Get input info from user
		feet = getFeet( feet ) ;
		inches = getInches( inches ) ;
				
		inchStringMesg( feet, inches) ;
		
		//Calculations
		totalInches = ( IPF * feet ) + inches ;
		centims = totalInches * CPI ;
		
		System.out.println( "The total number of inches = " + totalInches )	;
		
		//Output to user the number in centimeters
		centsStringMesg( centims ) ;	
		
	}
	
	/**
	 * This method returns input inches from user
	 * @param inches
	 * @return
	 */
	public static int getInches( int inches ) {
		System.out.print( "Enter inches: " ) ;
		inches = console.nextInt() ;
		System.out.println() ;
		return inches ;
	}
	
	/**
	 * This method returns input feet to user.
	 * @param feet
	 * @return
	 */
	public static int getFeet( int feet ) {
		
		System.out.print( "Enter feet: " ) ;
		feet = console.nextInt() ;
		System.out.println( "" ) ;
		return feet;
	}
	
	/**
	 * This method outputs centimeters to user console
	 * @param centims
	 */
	public static void centsStringMesg( double centims ) {
		System.out.println( "The number of centimers = "
				+ centims ) ;
	}
	
	/**
	 * Repeats information entered to user via console.
	 * @param feet
	 * @param inches
	 */
	public static void inchStringMesg( int feet, int inches ) {
		
		String inchString = "The numbers you entered are " 
				+ feet + " for feet and "
				+ inches + " for inches." ;
		
		System.out.println( inchString ) ;
	}
	
}