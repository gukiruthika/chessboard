package javaProject1.pack1;

import java.math.BigInteger;

public class Ricebags_on_Chessboard {

	public static void main(String[] args) {
		BigInteger b1 = new BigInteger("2");
		BigInteger total = new BigInteger("0");
        for(int i=0; i<64; i++) {
        	BigInteger result = b1.pow(i);
        	total = total.add(result);
            if(i==63)
            	System.out.println("Number of ricebags on the 64th square = "+result);
        }
        System.out.println("Total number of ricebags = " + total);
	}

}
