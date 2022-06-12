import java.util.Scanner;


public class Exercicio4_Secao04 {

	public static void main(String[] args) {
		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
		//decimais.
		
		int matricula;
		double hora,salario,valorHora;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira matricula do funcionário");
		matricula=sc.nextInt();
		
		System.out.printf("Insira valor da hora do funcionário %d%n",matricula);
		valorHora=sc.nextDouble();
		
		System.out.println("Insira horas trabalhadas do funcionário");
		hora=sc.nextDouble();
		
		System.out.printf("Valores digitados sao :%n %d%n %.2f%n %.2f%n",matricula,valorHora,hora);
		
		salario=valorHora*hora;
		
		System.out.printf("Salario funcionario %d é R$ %.2f",matricula,salario);
					
		sc.close();
		

	}

}
