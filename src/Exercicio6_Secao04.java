import java.util.Scanner;

public class Exercicio6_Secao04 {

	public static void main(String[] args) {
		//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
		//mostre
		//a) a área do triângulo retângulo que tem A por base e C por altura.  
		//b) a área do círculo de raio C. (pi = 3.14159)  
		//c) a área do trapézio que tem A e B por bases e C por altura.  
		//d) a área do quadrado que tem lado B.  
		//e) a área do retângulo que tem lados A e B. 
		
		double A,B,C;
		double ATri,ACir,ATrap,AQuad,ARec;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os valores para A,B e C");
		
		A=sc.nextDouble();
		B=sc.nextDouble();
		C=sc.nextDouble();
		
		ATri=A*C/2;
		ACir=3.14159*Math.pow(C,2);
		ATrap=((A+B)*C)/2;
		AQuad=Math.pow(B,2);
		ARec=A*B;
		
		System.out.printf("Valores digitados para A,B e C são: %.2f %.2f e %.2f%n",A,B,C);
		System.out.printf("%.2f%n",ATri);
		System.out.printf("%.2f%n",ACir);
		System.out.printf("%.2f%n",ATrap);
		System.out.printf("%.2f%n",AQuad);
		System.out.printf("%.2f%n",ARec);
		
		sc.close();
		
		
		
	}

}
