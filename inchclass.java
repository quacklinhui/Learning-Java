package inchtocmconversion;

import java.util.Scanner;

public class inchclass {

	public static void main(String[] args) {
		Scanner in_inch = new Scanner(System.in);
		int inch;
		double cm;
		final double cmPerInch = 2.54; //
		
		
		
		System.out.println("How many inches are you converting?");
		inch = in_inch.nextInt();
		cm = inch * 2.54;
		
		System.out.println(inch + " inches is the same as " +cm+ " cm.");
		

	}

}
