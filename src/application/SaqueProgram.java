package application;

import java.util.Scanner;

import entities.Conta;

public class SaqueProgram {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);


		Conta c1 = new Conta();

		System.out.println("Which account holder name?");

		String nome = sc.nextLine();

		System.out.println("What's the number account?");

		double conta = sc.nextDouble();

		System.out.println("What's will be digit account number?");

		int digito  = sc.nextInt();

		System.out.println("What type of account it will be?");

		int tipo = sc.nextInt();

		System.out.println("Would you like to deposit the first amount? (y/n)");

				
		String opcao = sc.next();
		double depInicial = 0;

			
			
			if (opcao.equals("n")) {
			//double depinicial = 0;
			}
			
			else {
				
				System.out.println("Which value will be deposit?");

				depInicial = sc.nextDouble();
			}

			

		c1.setAbrirConta(conta,digito,tipo,nome,depInicial);

		System.out.println("Account data:");
		System.out.println(c1.getAbrirConta());

		System.out.println("Which is the deposit value?");
		double valorDeposito = sc.nextDouble();

		c1.setDepositoConta(valorDeposito);

		System.out.println("Update account data:");
		System.out.println(c1.getAbrirConta());

		System.out.println("Which is the withdraw value?");
		double valorSaque = sc.nextDouble();

		c1.setSaqueConta(valorSaque);

		System.out.println("Update account data:");
		System.out.println(c1.getAbrirConta());

		System.out.println(valorDeposito);
		System.out.println(valorSaque);

		sc.close();

		}
		

	}


