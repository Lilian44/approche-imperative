/**
 * 
 */
package fr.algorithmie;

/**
 * @author lguep
 *
 */
public class FabriqueMur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		fabriqueMur(3, 2, 9);

	}

	static boolean fabriqueMur(int nbSmall, int nbBig, int longueur) {
		int grandes = 0;

		boolean resultat = false;
		
		for (int i = 0; i <= nbBig; i++) {
			if (nbBig > 0) {

				grandes += 5;
				if (grandes > longueur) {
					grandes -= 5;
					for (int j = 0; j <= nbSmall; j++) {

						if ((grandes + j) == longueur) {
							resultat = true;
							System.out.println(resultat);
						}
					}
				}
			}

		}
		if (grandes < longueur && resultat == false) {
			for (int b = 0; b <= nbSmall; b++) {
				if ((grandes + b) == longueur) {
					resultat = true;
					System.out.println(resultat);
				} else if (b == nbSmall && (grandes + b) < longueur) {
					resultat = false;
					System.out.println(resultat);
				}
			}
		}
		return resultat;

	}

}
