import java.util.Scanner;

public class Secao06_Ex01_For {

	public static void main(String[] args) {
		// Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
		// até X, um valor por linha, inclusive o
		// X, se for o caso.

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor entre 1 e 1000");
		int limite = sc.nextInt();

		if (limite >= 1 && limite <= 1000) {

			int i = 0;

			for (i = 1; i <= limite; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}

			}

		}

		else {
			System.out.println("Valor invalido");

		}
		System.out.printf("Limite digitado foi %d%n", limite);

		sc.close();
	}

}
