package curso_nelio;

import java.util.Locale;

public class LocalePrintf {

	public static void main(String[] args) {

		double x = 10.55658465;
		
		System.out.println(x);
		
		/*Para delimitar quantidade de casas decimais e \n ou %n pula uma linha*/
		System.out.printf("%.2f%n", x);
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f%n", x);
		
		/*Para formato decimal americano usa-se o Locale estabelecendo a região*/
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		// %f = ponto flutuante
		// %d = inteiro
		// %s = texto
		// %n = quebra de linha
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

		System.out.printf("----------------------------------------------------------------------------------");

		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("\nProducts: ");

		System.out.printf("%s, which price is $ %.2f \n", product1, price1);
		System.out.printf("%s, which price is $ %.2f \n", product2, price2);

		System.out.printf("\nRecord: %d years old, code %d and gender: %s", age, code, gender);

		System.out.printf("\nMeasure with eight decimal places: %.8f", measure);
		System.out.printf("\nRouded (three decimal places): %.3f", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("\nUs decimal point: %.3f", measure);

	}

}
