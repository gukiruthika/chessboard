package javaProject1.pack1;

import java.util.Scanner;

public class Tax_Liability_Nested_if_else {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Age: ");
		int age=sn.nextInt();
		System.out.print("Income: ");
		int income=sn.nextInt();
		if(age<18)
			System.out.println("Income is taxable in the hands of parent.");
		else {
			if(income<=250000||(age>59&&income<=300000)||(age>79&&income<=500000))
				System.out.println("Income is below the threshold limit, not required to pay tax.");
			else 
				System.out.println("Required to pay tax.");
		}
	}
}
