import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String mes;
		int variavel = sc.nextInt();
		
		switch(variavel) {
		
		case 1 : mes = "Janeiro";
		break;
		
		case 2 : mes = "Fevereiro";
		break;
		
		default : mes = "Mês invalido!";
		
		}
		
		System.out.println("Você selecionou o mês = " + mes);
		
	}
	
}
