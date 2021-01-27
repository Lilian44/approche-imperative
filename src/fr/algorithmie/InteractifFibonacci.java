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
public class InteractifFibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tapez un nombre  SVP");
		Scanner myNbr = new Scanner(System.in);

		int number = myNbr.nextInt();

		long[] array = new long[number];

		for (int i = 0; i <= number-1; i++) {
			if (i == 0) {
				array[i] = 0;
			}
			else if (i == 1) {
				array[i] = 1;
			}else {
				
			array[i] = array[i - 1] + array[i - 2];
			}

		}
		System.out.println(array[number-1]);
	}

}
