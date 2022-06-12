import java.util.Scanner;

public class Secao06_Ex06_For {

	public static void main(String[] args) {
		//Ler um número inteiro N e calcular todos os seus divisores. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite valor a ser dividido");
		
		int numero = sc.nextInt();
		
		System.out.println("Resultado:");
		
		for(int i = 1; i <= numero; i ++) {
			if(numero % i ==0) {
				System.out.println(i);
							
			}
				
		}
		
		
		sc.close();

	}

}
