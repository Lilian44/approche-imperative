/**
 * 
 */
package fr.algorithmie;

/**
 * @author lguep
 *
 */
public class ComparaisonTableau {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 15, -3, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };
		int a = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array[i] == array2[j]) {
					a++;
				}
			}
		}
		System.out.println(a);

	}

}
