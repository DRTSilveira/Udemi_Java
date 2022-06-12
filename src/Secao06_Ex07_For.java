import java.util.Scanner;

public class Secao06_Ex07_For {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
		//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
		//exemplo.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de linhas");
		
		int linhas = sc.nextInt();
		
		for(int i = 1; i <= linhas; i++) {
			double quadrado = Math.pow(i,2);
			double cubo = Math.pow(i, 3);
			
			System.out.print(i);
			System.out.printf(" - %.0f",quadrado);
			System.out.printf(" - %.0f%n",cubo);
			
						
		}
		sc.close();
		
	}

}
