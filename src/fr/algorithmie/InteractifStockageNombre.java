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
public class InteractifStockageNombre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2};
		System.out.println("1) Option 1\n2) Option 2\n");
		System.out.print("Selection: ");

		Scanner in = new Scanner(System.in);
		int option = in.nextInt();
		System.out.println(option);

		switch (option) {
		case 1:
			System.out.println("Vous avez choisi d'ajouter un nombre au tableau");
			System.out.println("Choisissez un nombre:");
			Scanner myNbr = new Scanner(System.in);
			int nbr = in.nextInt();
			for (int i = 0; i < array.length - 1; i++) {
		
					if (array[i] == 0 ) {
						array[i] = nbr;
						break;
					} else if(array[array.length-1]!=0) {
						array = Arrays.copyOf(array, array.length + 1);
						array[i+2] = nbr;
						break;
					}
				
			}
			System.out.println(Arrays.toString(array));
			break;
		case 2:
			System.out.println("Vous avez choisi d'afficher le tableau");
			System.out.println(Arrays.toString(array));
			break;
		default:
			System.err.println("Unrecognized option");
			break;
		}
	}

}
