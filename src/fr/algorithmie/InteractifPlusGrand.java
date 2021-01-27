/**
 * 
 */
package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author lguep
 *
 */
public class InteractifPlusGrand {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[10];

		for (int i = 0; i < 10; i++) {
			Scanner myNbr = new Scanner(System.in);
			System.out.println("Tapez un nombre entre 1 et 10 SVP");

			int number = myNbr.nextInt();
			array[i] = number;
		}
		int b = array[0];
		for (int i = 1; i < array.length; i++) {

			if (b < array[i]) {
				b = array[i];

			}
		}
		System.out.println(b);

	}

}
