/*
Fazer um programa para ler o nome de um aluno e as tr�s notas que ele obteve nos tr�s trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer tamb�m se o aluno est� aprovado (PASS) ou n�o (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o m�nimo para ser aprovado (que � 60% da nota). Voc� deve criar uma classe Student para
resolver este problema
*/

package application;

import java.util.Scanner;
import entities.StudentsGrade;

public class Exercicio_3{
	
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
	
	System.out.println("What is the student name?");
	
	entities.StudentsGrade student1 = new StudentsGrade();
	
	student1.name = sc.nextLine();
	
	System.out.println("What is the student class?");
	student1.serie = sc.nextLine();
	
	System.out.println("What is the student grade1?");
	student1.grade1 = sc.nextDouble();
	System.out.println("What is the student grade2?");
	student1.grade2 = sc.nextDouble();
	System.out.println("What is the student grade3?");
	student1.grade3 = sc.nextDouble();
	
	student1.gradeFinal();
	student1.result(student1.gradeFinal);
	//String status = student1.status;
	//double notaFaltou = student1.gradeFail;
	
	System.out.println(student1);
	
	
	
	
	
	
	sc.close();

}

	
}

