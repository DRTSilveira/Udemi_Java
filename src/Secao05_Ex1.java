import java.util.Scanner;

public class Secao05_Ex1 {

	public static void main(String[] args) {
		//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro");
		
		int x = sc.nextInt();
		
		if (x==0){
			System.out.println("Numero digitado foi " + x);
			System.out.println("Numero digitado � 0");
			}
		
		if (x>0){
			System.out.println("Numero digitado foi " + x);
			System.out.println("Numero Positivo");
			}
		if(x<0){
			System.out.println("Numero digitado foi " + x);
			System.out.println("Numero digitado � negativo");
sc.close();

	}

}
}



	
