import java.util.Scanner;


public class Exercicio4_Secao04 {

	public static void main(String[] args) {
		//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por 
		//hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas 
		//decimais.
		
		int matricula;
		double hora,salario,valorHora;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira matricula do funcion�rio");
		matricula=sc.nextInt();
		
		System.out.printf("Insira valor da hora do funcion�rio %d%n",matricula);
		valorHora=sc.nextDouble();
		
		System.out.println("Insira horas trabalhadas do funcion�rio");
		hora=sc.nextDouble();
		
		System.out.printf("Valores digitados sao :%n %d%n %.2f%n %.2f%n",matricula,valorHora,hora);
		
		salario=valorHora*hora;
		
		System.out.printf("Salario funcionario %d � R$ %.2f",matricula,salario);
					
		sc.close();
		

	}

}
