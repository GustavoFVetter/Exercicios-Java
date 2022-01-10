import java.util.Arrays;
import java.util.List;

public class Receitas {

	public static void main(String[] args) {
		
	}
	
	/*Abaixo criar os atributos desta classe
		 * Valor da receita;
		 * data recebimento;
		 * data recebimento esperado;
		 * descricao da receita;
		 * conta;
		 * tipo de receita: salário, presente, prêmio, outros
		 */
	double valorDaReceita;
	int dataRecebimento; // formato esperado ddmmaa
	int dataRecebimentoPrevisto; // formato esperado dddmmaa
	String descricaoReceita;
	String conta;
	String tipoReceita; // salário, presente, prêmio, outros
	
	
	/*
	 * Abaixo criar o método construtor
	 */
	public Receitas(double valorDaReceita, int dataRecebimento, int dataRecebimentoPrevisto, String descricaoReceita,
			String conta, String tipoReceita) {
		super();
		this.valorDaReceita = valorDaReceita;
		this.dataRecebimento = dataRecebimento;
		this.dataRecebimentoPrevisto = dataRecebimentoPrevisto;
		this.descricaoReceita = descricaoReceita;
		this.conta = conta;
		this.tipoReceita = tipoReceita;
	}
	
	/*
	 * Abaixo criar o método construtor padrão para Receitas
	 */
	public Receitas() {
		
	}

	/*
		 * Abaixo criar os métodos:
		 * -> Cadastrar receitas
		 * -> Editar receitas
		 * -> Remover receitas
		 * -> Listar receitas
		 * 			- Filtro por período (data inicial e final)
		 * 			- Filtro por tipo de receita
		 * -> Listar total de receitas
		 */
	
	void cadastrarReceitas(){
		System.out.println("Método cadastrarReceitas");
		}
	
	void editarReceitas() {
		System.out.println("Método editarReceitas");
	}
	
	void excluirReceitas() {
		System.out.println("Método excluirReceitas");
	}
	
	void listarReceitas() {
		System.out.println("Método listarReceitas (verificar filtros");
	}
	
	void listarTotalReceitas() {
		System.out.println("Método listarTotalReceitas");
	}
	
	/*
	 * Abaixo instanciando o objeto Receita
	 */
	Receitas recebidos = new Receitas(valorDaReceita, dataRecebimento, 
			dataRecebimentoPrevisto, descricaoReceita, conta, tipoReceita);
	
	List<Receitas> receitas = Arrays.asList(recebidos);
	
	
	
	
	}	
