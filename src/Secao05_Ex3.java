import java.util.Scanner;

public class Secao05_Ex3 {

	public static void main(String[] args) {
		
		//Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		//Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
		//ordem crescente ou decrescente.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero 1 de 2");
		int x = sc.nextInt();

		System.out.println("Digite o numero 2 de 2");
		int y = sc.nextInt();

		if(x % y ==0 || y % x == 0){
			
			System.out.println("Numeros "+x +" e " + y + " sao multiplos");
				}
			else{
				System.out.println("Numeros " + x +" e "+ y + " nao sao multiplos");
				
				sc.close();
			}
	}
}

	
		


	
		
			
			
		
			
		
	