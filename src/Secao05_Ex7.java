import java.util.Scanner;
public class Secao05_Ex7 {

	public static void main(String[] args) {
		//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
				//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
				//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). 
				//Se o ponto estiver na origem, escreva a mensagem “Origem”.  
				//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a 
				//situação. 
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite valor eixo x");
		double x = sc.nextDouble();
		System.out.println("Digite valor eixo y");
		double y = sc.nextDouble();
		System.out.printf("Coordenadas sao:(%.2f %.2f)",x,y);
		
		if(x>0 && y>0) {
			System.out.println("Q1");
		}
		else if(x<0 && y>0) {
			System.out.println("Q2");
		}
		else if(x<0 && y<0) {
			System.out.println("Q3");
		}
		else if(x>0 && y<0) {
			System.out.println("Q4");
		}
		else if(x==0 && y==0) {
			System.out.println("Origem");
		}
		System.out.println("fim da execução");
		sc.close();
	}

}
