import java.util.Scanner;

public class Secao05_Ex2 {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro");
		
		int x = sc.nextInt();
		float y = x%2;
		int z = (int)y;
		
			
		if (z==1){
			System.out.println("Numero impar");
		}
		else {
			System.out.println("Numero par");
		}
		
		sc.close();

		
		
		
	}

}
