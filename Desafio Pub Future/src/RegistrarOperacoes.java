import java.util.Scanner;

public class RegistrarOperacoes extends Receitas {

	
	
	// Aqui criar o método main que vai rodar o programa
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a descrição da receita: ");
		String descricaoReceita = leitor.nextLine();
		System.out.println("Digite o valor da receita: ");
		double valorDaReceita = leitor.nextDouble();
		System.out.println("Digite a data do recebimento: formato ddmmaa ");
		int dataRecebimento = leitor.nextInt();
		System.out.println("Digite a data do recebimento esperado: formato ddmmaa ");
		int dataRecebimentoEsperado = leitor.nextInt();
		System.out.println("Digite o tipo da receita: ");
		String tipoReceita = leitor.next();
		System.out.println("Digite a conta da receita: ");
		String conta = leitor.next();
		
		System.out.println("Descrição da receita: " + descricaoReceita);
		System.out.println("Valor da receita: " + valorDaReceita);
		System.out.println("Data do recebimento: " + dataRecebimento);
		System.out.println("Data do recebimento esperado: " + dataRecebimentoEsperado);
		System.out.println("Tipo da receita: " + tipoReceita);
		System.out.println("Conta da receita: " + conta);
	}
	
}
