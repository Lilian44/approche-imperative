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
		int nbrRandom =obj.nextInt(100);
		//System.out.println(nbr);
	check(nbrRandom);
		
	
	}
	
	public static void check(int nbrRandom) {
		
		Scanner myNbr = new Scanner(System.in);
		System.out.println("Trouvez le nombre compris entre 1 et 100:");
		int number = myNbr.nextInt();
		if( number== nbrRandom) {
			System.out.println("félicitations vous avez trouver le bon nombre en" );
		}if(number>nbrRandom) {
			System.out.println("Votre nombre est trop grand");
			
			check(nbrRandom);
		}if(number<nbrRandom) {
			System.out.println("Votre nombre est trop petit");
			
			check(nbrRandom);
		}
	}
	


}
