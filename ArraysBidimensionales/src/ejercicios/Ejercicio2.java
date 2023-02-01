package ejercicios;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int tabla [][]= new int [10][10];
		
		for (int i=1;i<tabla.length; i++) {
			for(int j=1; j<tabla.length; j++) {
				tabla[i][j]= i * j;
			}
		}
		
			for (int i =1;i<tabla.length;i++) {
				for (int j =1;j<tabla[i].length;j++) {
					System.out.print(tabla [i][j] + " ");
				}
				System.out.println();
			}
			
	}

}
