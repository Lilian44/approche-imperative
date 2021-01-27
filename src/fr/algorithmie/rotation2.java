package fr.algorithmie;

import java.util.Arrays;

public class rotation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 0, 1, 2, 3 };
		int stock = 0;

		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] == array.length - 1) {
				stock = array[i];
			}
			if (i == 0) {
				array[i] = stock;
			} else {
				array[i] = array[i - 1];
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
