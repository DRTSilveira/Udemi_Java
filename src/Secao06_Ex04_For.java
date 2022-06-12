import java.util.Scanner;

public class Secao06_Ex04_For {

	public static void main(String[] args) {
		//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
		//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite qtde de testes");
		int testes = sc.nextInt();
		
		for(int i = 1; i <= testes; i++) {
		System.out.println("Digite primeiro numero");
		double p1 = sc.nextDouble();
		
		System.out.println("Digite segundo numero");
		double p2 = sc.nextDouble();
		
		if(p2 == 0) {
			System.out.println("Divisao impossivel");
		}
		
		else {
		
			double divisao = p1/p2;
			
			System.out.printf("%.2f%n",divisao);
		}
			
			
			
			
	}
		sc.close();
	}
}
		
	

