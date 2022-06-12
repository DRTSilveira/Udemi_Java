package application;

import java.util.Scanner;

import entities.GuestStudent;

public class GuestBooking {

	public static void main(String[] args) {
		/*A dona de um pensionato possui dez quartos para alugar para estudantes,
		sendo esses quartos identificados pelos n�meros 0 a 9.
		Fazer um programa que inicie com todos os dez quartos vazios, e depois
		leia uma quantidade N representando o n�mero de estudantes que v�o
		alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
		N estudantes. Para cada registro de aluguel, informar o nome e email do
		estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
		que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
		um relat�rio de todas ocupa��es do pensionato, por ordem de quarto*/
		
		Scanner sc = new Scanner(System.in);
		
		int [] hotelRooms = new int[9];
		
		System.out.println("How many rooms will be booked?");
		int rents = sc.nextInt();
		int i = 0;
		
		while ( i < rents) {
			
			
			GuestStudent [] guest = new GuestStudent[rents];
			System.out.println("What's the guest name?");
			String name = sc.next();
			
			System.out.println("What is guest email?");
			String email = sc.next();
			
			System.out.println("Which room the guest would like to book?");
			int room = sc.nextInt();
			
			guest[i] = new GuestStudent(name,email,room);
			
			hoteLRooms = guest[i].setRoom(room);
			
					
		}
		
		
		
		
		
		
		
		
		sc.close();
		
		
	}

}
