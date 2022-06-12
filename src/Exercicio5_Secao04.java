import java.util.Scanner;

public class Exercicio5_Secao04 {

	public static void main(String[] args) {
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

		
		Scanner sc = new Scanner(System.in);
		
		int qtdePeca1,qtdePeca2;
		double valorPeca1,valorPeca2,total;
		String codPeca1,codPeca2;
			
		System.out.println("Digite codigo Peça 1");	
		codPeca1=sc.next();
		
		System.out.println("Digite codigo Peça 2");
		codPeca2=sc.next();
		
		System.out.printf("Codigos digitados sao: %s e %s%n",codPeca1,codPeca2);
		
		System.out.printf("Digite valores das peças " +codPeca1 +" e "+codPeca2);
		valorPeca1=sc.nextDouble();
		valorPeca2=sc.nextDouble();
		
		System.out.printf("Digite quantidade das peças " +codPeca1 +" e "+codPeca2);
		qtdePeca1=sc.nextInt();
		qtdePeca2=sc.nextInt();
		
		System.out.println("Valores das peças sao "+valorPeca1+ " e "+valorPeca2);
		System.out.println("Qtde das peças sao "+qtdePeca1+ " e "+qtdePeca2);
		
		total=valorPeca1*qtdePeca1+valorPeca2*qtdePeca2;
		
		System.out.printf("Valor total é R$%.2f",total);
				
		
		sc.close();
		
	}

}
