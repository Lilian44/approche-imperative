/**
 * 
 */
package fr.algorithmie;

/**
 * @author lguep
 *
 */
public class carré {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line;
		int[] array = new int[4];

		for (int j = 0; j <= array.length - 1; j++) {
			if (j == 0 || j == array.length - 1) {
				for (int i = 0; i <= array.length - 1; i++) {
					if (i == 0) {
						System.out.print("+");
					} else if (i == array.length - 1) {
						System.out.print("+\n");
					} else {
						System.out.print("--");
					}
				}

			} else {
				for (int p = 0; p <= array.length - 1; p++) {
					if (p == 0) {
						System.out.print("|");
					} else if (p == array.length - 1) {
						System.out.print("|\n");
					} else {
						System.out.print("  ");
					}
				}

			}

		}

//		for (int i = 0; i <= array.length - 1; i++) {
//			if (i == 0) {
//				System.out.print("+");
//			} else if (i == array.length - 1) {
//				System.out.print("+");
//			} else {
//				System.out.print("--");
//			}
//
//		}

	}

}
