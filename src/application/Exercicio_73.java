package application;

import util.ConverterCurrency;
import java.util.Scanner;

public class Exercicio_73 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("How is current dollar price?");
		double dprice = sc.nextDouble();
		
		System.out.println("What's the amount to be bought?");
		double dqty = sc.nextDouble();
		
		System.out.printf("Total in real is R$%.2f",ConverterCurrency.Converter(dprice, dqty));
		
		sc.close();
		
	}

}
