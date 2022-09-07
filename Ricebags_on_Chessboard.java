package javaProject1.pack1;

import java.math.BigInteger;

public class Ricebags_on_Chessboard {

	public static void main(String[] args) {
		BigInteger b1 = new BigInteger("2");
        BigInteger result = b1.pow(64);
        System.out.println("Total number of ricebags = " + result.subtract(BigInteger.valueOf(1)));
	}

}
