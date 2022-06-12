import java.util.Scanner;


public class Exercicio1_Secao04 {

	public static void  main (String[] args) {
		// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
		//mensagem explicativa, conforme exemplos. 
		
		Scanner sc= new Scanner(System.in);
		
				
		
		int x,y,resultado;
		
		System.out.println("digite o valor de x");
		x=sc.nextInt();
		System.out.printf("voce digitou %d%n",x);
		System.out.println("digite o valor de y");
		y=sc.nextInt();
		System.out.printf("voce digitou %d%n",y);
		System.out.println("o resultado da soma é");
		resultado=x+y;
		System.out.print(resultado);
		
		sc.close();
			
		
				

	}

}
