/**
 * 
 */
package fr.algorithmie;

import java.util.Scanner;

/**
 * @author lguep
 *
 */
public class IntercatifTantQue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		do{
			Scanner myNbr = new Scanner(System.in);
			System.out.println("Tapez un nombre entre 1 et 10 SVP");
	
			 number = myNbr.nextInt();
			 if(number < 10 && number > 1) {
				 System.out.println("votre chiffre est : "+number);
			 };
			 
		}while( number > 10 || number < 1);
		
	}
}
