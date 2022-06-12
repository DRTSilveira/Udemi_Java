import java.util.Scanner;

public class Secao05_Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("informar o codigo do lanche");
		int codigo = sc.nextInt();
		System.out.println("Digite qtde do pedido");
		int qtde = sc.nextInt();
		
			
		
		if (codigo==1) {
		
			String nome = "hotdog";
			double preco = 4;
			double total = preco*qtde;
			System.out.println("Resumo do pedido");
			System.out.printf("Codigo %d, Nome: %s, Preço unit:R$ %.2f, Qtde: %d, Total:R$ %.2f", codigo,nome,preco,qtde,total);
			
		}
		else if (codigo==2) {
		
			String nome = "x-salada";
			double preco = 5;
			double total = preco*qtde;
			System.out.println("Resumo do pedido");
			System.out.printf("Codigo %d, Nome: %s, Preço unit:R$ %.2f, Qtde: %d, Total:R$ %.2f", codigo,nome,preco,qtde,total);
			
		}
		
		else if (codigo==3) {
			
			String nome = "x-bacon";
			double preco = 6;
			double total = preco*qtde;
			System.out.println("Resumo do pedido");
			System.out.printf("Codigo %d, Nome: %s, Preço unit:R$ %.2f, Qtde: %d, Total:R$ %.2f", codigo,nome,preco,qtde,total);
			
		}

		else if (codigo==4) {
			
			String nome = "x-calabresa";
			double preco = 7;
			double total = preco*qtde;
			System.out.println("Resumo do pedido");
			System.out.printf("Codigo %d, Nome: %s, Preço unit:R$ %.2f, Qtde: %d, Total:R$ %.2f", codigo,nome,preco,qtde,total);
			
		}
		
		else {
			String nome = "refri";
			double preco = 2;
			double total = preco*qtde;
			System.out.println("Resumo do pedido");
			System.out.printf("Codigo %d, Nome: %s, Preço unit:R$ %.2f, Qtde: %d, Total:R$ %.2f", codigo,nome,preco,qtde,total);
			
		}
		
		

		sc.close();
		
	}
	}

