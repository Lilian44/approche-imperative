/**
 * 
 */
package fr.algorithmie;

import java.util.Arrays;

/**
 * @author lguep
 *
 */
public class InversionContenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] arrayCopy = new int[array.length];
		
		for (int i = 0; i <= array.length-1; i++) {
			arrayCopy[i]=array[array.length-i-1];
		}
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(arrayCopy));
	}

}
