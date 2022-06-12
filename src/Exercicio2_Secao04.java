import java.util.Scanner;
import java.util.Locale;



public class Exercicio2_Secao04 {

	public static void main(String[] args) {
		//Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste c�rculo com quatro 
		//casas decimais conforme exemplos. 

		double pi = 3.14159;
		double area,raio;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite valor do raio em mm");
		raio=sc.nextDouble();
		System.out.printf("valor digitado %.4f mm%n",raio);
		area=pi*Math.pow(raio,2);
		System.out.printf("Valor da �rea do circulo %.4f mm2 %n",area);
		
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		
		
		System.out.println("Digite valor do raio em mm com numero formato americano");
		raio=sc.nextDouble();
		System.out.printf("valor digitado %.4f mm%n",raio);
		area=pi*Math.pow(raio,2);
		System.out.printf("Valor da �rea do circulo %.4f mm2 %n",area);
		
		
		
		
		
		
		
		
		sc.close();
				
		
	}

}
