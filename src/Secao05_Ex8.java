import java.util.Scanner;

public class Secao05_Ex8 {

	public static void main(String[] args) {
		//Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e 
		//mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo. 
		
		//Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de 
		//salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é 
		//de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com 
		//duas casas decimais. 
		
		Scanner sc = new Scanner(System.in);
		
		
		double saldoTaxA = 0;
		double impostoA = 0;
		double saldoTaxB = 0;
		double impostoB = 0;
		double saldoTaxC = 0;
		double impostoC = 0;
		
		System.out.println("Qual o salario?");
		
		double salario = sc.nextDouble();
		
		if (salario<=2000.00){
			System.out.println("Isento de imposto");
			}
		
		if(salario >2000.00){
			saldoTaxA = salario - 2000.00;
			}
		
		if (saldoTaxA < 1000.00){
			impostoA = saldoTaxA * 0.08;
			}
		
		if(saldoTaxA >= 1000.00){
			impostoA = 80.00;
			saldoTaxB = (saldoTaxA - 1000.00);
			}
		
		if(saldoTaxB < 1500.00){
			impostoB = saldoTaxB*0.18;
			}
		
		if(saldoTaxB >= 1500.00){
			impostoB = 270.00;
			saldoTaxC = (saldoTaxB - 1500.00);
			impostoC = saldoTaxC * 0.28;

			}
		
		

	
	double impostoTotal = impostoA + impostoB + impostoC;

	System.out.println("Imposto a pagar" + impostoTotal);

		
		sc.close();
		
	}

}
