import java.util.Scanner;

public class Secao06_Ex01 {

	public static void main(String[] args) {
		
		//Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de senha
		//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
		//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta � o valor 2002.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha");
		int senha = sc.nextInt();
		int lock = 2022;
		
		while(senha != lock) {
			System.out.println("Senha invalida, Digite a senha");			
			senha = sc.nextInt();
		}
		
		System.out.println("Access Granted");
		
		sc.close();
				

	}

}
