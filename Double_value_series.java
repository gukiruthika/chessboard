package javaProject1.pack1;

import java.util.Scanner;

public class Double_value_series {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int base=sn.nextInt();
		int noOfTerms=sn.nextInt();
		for(int i=1;i<noOfTerms;i++)
			base*=2;
		
		System.out.println(base);

	}

}
