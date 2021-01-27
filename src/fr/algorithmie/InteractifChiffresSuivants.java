/**
 * 
 */
package fr.algorithmie;

import java.util.Scanner;

/**
 * @author lguep
 *
 */
public class InteractifChiffresSuivants {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myNbr = new Scanner(System.in);
		System.out.println("Tapez un nombre entre 1 et 10 SVP");

		int number = myNbr.nextInt();

		for(int i=number+1; i<=(number+10);i++) {
			System.out.println(i);
		}

	}

}
