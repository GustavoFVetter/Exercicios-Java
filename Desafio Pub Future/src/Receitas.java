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
		 * tipo de receita: sal�rio, presente, pr�mio, outros
		 */
	double valorDaReceita;
	int dataRecebimento; // formato esperado ddmmaa
	int dataRecebimentoPrevisto; // formato esperado dddmmaa
	String descricaoReceita;
	String conta;
	String tipoReceita; // sal�rio, presente, pr�mio, outros
	
	
	/*
	 * Abaixo criar o m�todo construtor
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
	 * Abaixo criar o m�todo construtor padr�o para Receitas
	 */
	public Receitas() {
		
	}

	/*
		 * Abaixo criar os m�todos:
		 * -> Cadastrar receitas
		 * -> Editar receitas
		 * -> Remover receitas
		 * -> Listar receitas
		 * 			- Filtro por per�odo (data inicial e final)
		 * 			- Filtro por tipo de receita
		 * -> Listar total de receitas
		 */
	
	void cadastrarReceitas(){
		System.out.println("M�todo cadastrarReceitas");
		}
	
	void editarReceitas() {
		System.out.println("M�todo editarReceitas");
	}
	
	void excluirReceitas() {
		System.out.println("M�todo excluirReceitas");
	}
	
	void listarReceitas() {
		System.out.println("M�todo listarReceitas (verificar filtros");
	}
	
	void listarTotalReceitas() {
		System.out.println("M�todo listarTotalReceitas");
	}
	
	/*
	 * Abaixo instanciando o objeto Receita
	 */
	Receitas recebidos = new Receitas(valorDaReceita, dataRecebimento, 
			dataRecebimentoPrevisto, descricaoReceita, conta, tipoReceita);
	
	List<Receitas> receitas = Arrays.asList(recebidos);
	
	
	
	
	}	
