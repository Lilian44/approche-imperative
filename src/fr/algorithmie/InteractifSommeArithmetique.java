/**
 * 
 */
package fr.algorithmie;

import java.util.Scanner;

/**
 * @author lguep
 *
 */
public class InteractifSommeArithmetique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myNbr = new Scanner(System.in);
		System.out.println("Tapez un nombre entre 1 et 10 SVP");

		int number = myNbr.nextInt();
		int a = 0;
		for (int i = number; i >= 0; i--) {
			a += i;
		}
		System.out.println(a);

	}

}
