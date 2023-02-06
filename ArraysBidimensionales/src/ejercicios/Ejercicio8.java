package ejercicios;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int tabla [][]= new int [5][5];
		
		for(int i=0; i<tabla.length;i++) {
			for(int j=0; j<tabla.length;j++) {
				tabla[i][j]=(int) (Math.random()*10);
				
				
				if(tabla[i][j] == tabla[j][i]) {
					System.out.println("tabla[i][j] == tabla[j][i] son simétricas");
				}else {
					System.out.println("tabla[i][j] == tabla[j][i] no son simétricas");
				}
				
				}
		}

	}

}
