import java.util.Locale;



public class Exercicio_1 {

	public static void main(String[] args) {
		String product1="computer";
		String product2="office desk";
		int age=30;
		int code=5290;
		char gender='f';
		double price1=2100.0;
		double price2=650.50;
		double measure=53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s has the price of %f%n",product1,price1);
		System.out.printf("%s hs the price of %f%n",product2,price2);
	
		
		System.out.printf("Record %d years old, code %d and genger %s",age,code,gender);
		
		System.out.printf("measure with eight decimal places is: %f%n",measure);
		System.out.printf("Rouded measure is %.3f%n",measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		
		
		
		
		
		
		
		
		

	}

}
