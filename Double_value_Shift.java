package javaProject1.pack1;

import java.util.Scanner;

public class Double_value_Shift {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int base=sn.nextInt();
		int noOfTerms=sn.nextInt();
		
		System.out.println(base << (noOfTerms-1));   
	}

}
