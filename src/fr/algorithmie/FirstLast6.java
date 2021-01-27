/**
 * 
 */
package fr.algorithmie;

/**
 * @author lguep
 *
 */
public class FirstLast6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 0, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, 6 };
		boolean a = true;
		if (array.length > 0 && array[0] == 6 || array[array.length - 1] == 6) {

		} else {
			a = false;
		}
		System.out.println(a);
	}

}
