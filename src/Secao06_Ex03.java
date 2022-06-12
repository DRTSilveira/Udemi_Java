import java.util.Scanner;

public class Secao06_Ex03 {

	public static void main(String[] args) {
	
		//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
		//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
		//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
		//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
		//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
		//exemplo.
		
		Scanner sc = new Scanner(System.in);
		
		int alc = 0;
		int gas = 0;
		int die = 0;
		int option =0;
		
		System.out.println("Qual seu combustivel?");
		System.out.println("Digite o codigo para o combustive");
		
		
		while(option != 4) {
			
			option = sc.nextInt();
			
			switch (option) {
			
			case 1:
				alc += 1;
				break;
			
			case 2:
				gas += 1;
				break;
				
			case 3:
				die += 1;
				break;
				
			case 4:
				System.out.println("Muito obrigado");
				break;
				
			default:
				System.out.println("Codigo invalido");
				break;
								
			}
			
		}
		
		System.out.printf("Comb escolhidos: %d, %d, %d%n ",alc,gas,die);
		
		sc.close();
		

	}

}
