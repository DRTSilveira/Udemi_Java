import java.util.Scanner;

public class Secao06_Ex02_For {

	public static void main(String[] args) {
		
		//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. 
		//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
		//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite qtde de numeros para analisar (Entre 1 e 100)");
			int qtde = sc.nextInt();
			int dentro = 0;
			int fora = 0;
			
			if(qtde >=1 && qtde <=100){
				
				for(int i=1; i < qtde+1; i++) {
					
					System.out.printf("digite os valores conforme a qtde de %d/%d%n",i,qtde);
					int valor = sc.nextInt();
					
					if(valor>=10 && valor<=20) {
						dentro += 1;
					}
					
					else {
						fora += 1;
					}
					
					
					}

				System.out.printf("Qtde valores dentro: %d%n",dentro);
				System.out.printf("Qtde valores fora: %d%n",fora);

					
				}
				
			else {
				System.out.println("Valor invalido");
								
				
				
				}
	
		
			
			sc.close();
			
			}
			
	


			
	}


