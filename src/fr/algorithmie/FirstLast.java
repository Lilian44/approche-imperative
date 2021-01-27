/**
 * 
 */
package fr.algorithmie;

/**
 * @author lguep
 *
 */
public class FirstLast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 6, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		boolean a = true;
		if (array.length >= 1 && array[0] == array[array.length - 1]) {

		} else {
			a = false;
		}
		System.out.println(a);

	}

}
