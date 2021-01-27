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
public class Interactif21Batons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int allumettes = 21;

		while(allumettes>1) {
			System.out.println("veuillez prendre de 1a 3 allumettes");
			Scanner myNbr = new Scanner(System.in);
			int number = myNbr.nextInt();
			allumettes-=number;
			if(allumettes<=0) {
				System.out.println("VOUS AVEZ PERDU");
				break;
			}
			System.out.println("il reste "+(allumettes)+" allumettes, au tour de l'ordinateur:");
//			if(allumettes=4)
			Random obj = new Random();
			int nbrRandom =obj.nextInt(3)+1;
			allumettes-=nbrRandom;
			if(allumettes<=0) {
				System.out.println("VOUS AVEZ VAINCU L'ORDINATEUR");
				break;
			}
			System.out.println("l'ordinateur a pris "+nbrRandom +" allumettes");
			System.out.println("il reste "+(allumettes)+" allumettes");

		}
	}

}
