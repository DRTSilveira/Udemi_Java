import java.util.Scanner;

public class Secao05_Ex4 {

	public static void main(String[] args) {
		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode 
		//come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite hora inicio do jogo");
		double inicio = sc.nextInt();
		
		System.out.println("Digite hora final do jogo");
		double fim = sc.nextInt();
		
		if (inicio == 0 && fim == 0){
			double duracao = 24;
			System.out.println("Dura��o do jogo foi: " + duracao + "horas");
		}
		else {
			double x = inicio/24;
			double y = fim/24;
			double duracao = java.lang.Math.abs(x-y)*24;
			System.out.println("Dura��o do jogo foi: " + duracao + "horas");
			
		}
				
		sc.close();
	}

}
