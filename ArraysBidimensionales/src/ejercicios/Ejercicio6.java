package ejercicios;

public class Ejercicio6 {

	public static void main(String[] args) {
		int tabla [][]=new int [6][10];
		
		for(int i=0; i<tabla.length; i++) {
			for(int j=0; i<tabla.length;j++) {
				tabla[i][j]=(int)(Math.random()*100);
			}
		}

	}

}
