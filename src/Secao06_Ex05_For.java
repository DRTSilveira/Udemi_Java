import java.util.Scanner;

public class Secao06_Ex05_For {

	public static void main(String[] args) {
		
		
		
		//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. 
		//Lembrando que, por definição, fatorial de 0 é 1. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite numero para fatorar");
		int numero = sc.nextInt();
		double resultado = 1;
		
		for(int i = numero; i >=1; i --) {
			resultado *= i;
			
		}
		
		System.out.println(resultado);
		
		sc.close();

	}

}
