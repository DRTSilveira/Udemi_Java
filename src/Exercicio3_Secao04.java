import java.util.Scanner;

public class Exercicio3_Secao04 {

	public static void main(String[] args) {
		//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
		//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)

		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D,resultado;
		
		System.out.println("Digite valores para A,B,C e D");
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		D=sc.nextInt();
		
		System.out.printf("Valores digitados sao %d, %d, %d, %d%n",A,B,C,D);
		resultado=(A*B)-(C*D);
						
		System.out.printf("Resultado da equação (A * B - C * D) é:%d",resultado);
				
		
		sc.close();
		
		
		
	}

}
