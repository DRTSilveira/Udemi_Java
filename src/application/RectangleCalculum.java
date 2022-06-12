package application;

import java.util.Scanner;

import entities.Rectangle;

public class RectangleCalculum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Application to calculate area, perimeter and diagonal of a rectangle");
		System.out.println("Insert width of new rectangle: ");
		
		Rectangle rec1 = new Rectangle();
		rec1.width = sc.nextDouble();

		System.out.println("Insert height of new rectangle: ");	

		rec1.height = sc.nextDouble();
		
		
		
		System.out.println("rectangle caracteristics");
		System.out.printf("%f %f %f",rec1.area(),rec1.perimeter(),rec1.diagonal());
		
		
		sc.close();

		
		
		
	}

}
