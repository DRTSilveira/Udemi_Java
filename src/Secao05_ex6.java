import java.util.Scanner;
public class Secao05_ex6 {

	public static void main(String[] args) {
		//Voc� deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
		//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor n�o estiver em 
		//nenhum destes intervalos, dever� ser impressa a mensagem �Fora de intervalo�. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor");

		double valor = sc.nextDouble();
		
		if(valor<0 || valor>100){
			System.out.println("O valor digitado de "+valor+" esta fora do intervalo");
		}

		else if(valor>=0 && valor<=25){
			System.out.println("Intervalo [0,25]");
		}
		
		else if(valor>25 && valor<=50){
			System.out.println("Intervalo [26,50]");
		}
		
		else if(valor>50 && valor<=75){
			System.out.println("Intervalo [51,75]");
		}	
		
		else{
			System.out.println("Intervalo [76,100]");
		}
		
		System.out.println("fim da execu��o");
		sc.close();


	}

}
