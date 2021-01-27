/**
 * 
 */
package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

/**
 * @author lguep
 *
 */
public class InteractifPlusMoins {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random obj = new Random();
		int nbrRandom = obj.nextInt(100);
		int number;
		int win = 1;

		do {

			Scanner myNbr = new Scanner(System.in);
			System.out.println("Trouvez le nombre compris entre 1 et 100:");
			number = myNbr.nextInt();
			if (number == nbrRandom) {
				System.out.println("félicitations vous avez trouver le bon nombre en " +win+" coups");
			}
			if (number > nbrRandom) {
				System.out.println("Votre nombre est trop grand");
				win++;

			}
			if (number < nbrRandom) {
				System.out.println("Votre nombre est trop petit");
				win++;

			}
		} while (number != nbrRandom);

	}
}