import java.util.Scanner;

public class Secao06_Ex03_For {

	public static void main(String[] args) {
		//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
		//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
		//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
		//peso 5
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite qtde de testes");
		int teste = sc.nextInt();
		int p1 = 2;
		int p2 = 3;
		int p3 = 5;
		
		for (int i=1; i <= teste; i ++) {
			System.out.println("Digite primeiro numero");
			double n1 = sc.nextDouble();
			n1 = n1 * p1;
			System.out.println("Digite segundo numero");
			double n2 = sc.nextDouble();
			n2 = n2 * p2;
			System.out.println("Digite terceiro numero");
			double n3 = sc.nextDouble();
			n3 = n3 * p3;
			
			double media = (n1 + n2 + n3)/(p1 + p2 + p3);
			System.out.printf("%.1f%n",media);
			
						
			
			
		}
		
		
		
		
		sc.close();
		

	}

}
