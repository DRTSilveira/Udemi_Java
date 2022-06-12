import java.util.Scanner;

public class Secao06_Ex02 {

	public static void main(String[] args) {
		
		//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
		//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
		//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite coordenadas X,Y");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != 0 || y != 0){
			
					
			if(x > 0 && y > 0){
				System.out.println("1 Quadrante");
			}
			else if(x < 0 && y > 0){
				System.out.println("2 Quadrante");
			}
			else if(x < 0 && y < 0){
				System.out.println("3 Quadrante");
			}
			else{
				System.out.println("4 Quadrante");
			}

			System.out.println("Digite coordenadas X,Y");
			x = sc.nextInt();
			y = sc.nextInt();
			
			
			}
		
		System.out.println("Algum eixo é 0");
		
		sc.close();
		
	}
}
		
		
				
		


