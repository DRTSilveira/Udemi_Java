/*
Fazer um programa para ler o nome de um aluno e as tr�s notas que ele obteve nos tr�s trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer tamb�m se o aluno est� aprovado (PASS) ou n�o (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o m�nimo para ser aprovado (que � 60% da nota). Voc� deve criar uma classe Student para
resolver este problema
*/


package entities;

public class StudentsGrade {
	
		public String name;
		public String serie;
		public double grade1, grade2, grade3,gradeFail,result,gradeFinal;
		public String status;
		
		
		public double gradeFinal() {
					
			
			gradeFinal = ((grade1*30 + grade2*35 + grade3*35)/3350)*100;
			
			return gradeFinal;
			
			}
			
		public void result(double gradeFinal)	{
			
			if(gradeFinal >= 60) {
				
				this.status = "Approved";
			}
			
			else {
				
				this.status = "Fail";
				gradeFail = 60 - gradeFinal;
				
			}
			
			//return result;
			
			
		}
				
		
		public String toString() {
			return "Results of "
					+ name
					+" student of "
					+ serie
					+" with grades: "
					+ grade1
					+ " "
					+ grade2
					+" "
					+ grade3
					+" Final grade of: "
					+ String.format("%.2f",gradeFinal)
					+" "
					+ status
					+" "
					+ String.format("%.2f", gradeFail);
			
					
		}			
}
		


			

