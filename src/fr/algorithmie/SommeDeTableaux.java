/**
 * 
 */
package fr.algorithmie;

import java.util.Arrays;

/**
 * @author lguep
 *
 */
public class SommeDeTableaux {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
		int[] array3 = new int[array2.length];
		
		for (int i = 0; i < array.length; i++) {
			array3[i]= array[i]+array2[i];
		}
	
		System.out.println(Arrays.toString(array3));

	}

}
