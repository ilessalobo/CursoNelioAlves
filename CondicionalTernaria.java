
public class CondicionalTernaria {

	public static void main(String[] args) {

		// Sintaxe
		// (condicao) ? valor_se_verdadeiro : valor_se_falso

		// EX:
		// ( 2 > 4) ? 50 : 80 resposta: 80
		// ( 10 != 3 ) ? "Maria" : "Alex" resposta: "Maria"

		double preco = 34.5;
		double desconto;

		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}

		System.out.println(desconto);
		
		// Os códigos acima se resumidos poderiam ficar como no exemplo abaixo:

		double desconto1 = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.println(desconto1);
	}

}
