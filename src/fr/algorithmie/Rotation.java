/**
 * 
 */
package fr.algorithmie;

import java.util.Arrays;

/**
 * @author lguep
 *
 */
public class Rotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 0,1,2,3 };
		int[] array2 = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] == array[array.length-1]) {
				array2[0]=array[i];
			}else {
				array2[i+1]=array[i];
				
			}
		
		}
		System.out.println(Arrays.toString(array2));
	}

}
