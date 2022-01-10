import java.util.Arrays;
import java.util.List;

public class Contas {
	
	public static void main(String[] args) {
		
	}

	/*Abaixo criar os atributos desta classe
	 * Saldo
	 * Iipo de conta: carteira, conta-corrente, poupança
	 * Instituicao financeira;
	 */
	double saldo;
	String tipoConta; // carteira, conta-corrente, poupança
	String banco;
	
	
	/*Abaixo criar os metodos desta classe
	 * -> Cadastrar conta
	 * -> Editar conta
	 * -> Remover conta
	 * -> Listar contas
	 * -> Transferir saldo entre contas
	 * -> Listar saldo total
	 */
	
	void cadastrarConta() {
		//System.out.println("Cadastre uma conta: ");
		}
	
	void editarConta() {
		//System.out.println("Edite uma conta: ");
		}
	
	void removerConta() {
		//System.out.println("Remova uma conta: ");
		}
	
	void listarContas() {
		//System.out.println("Imprimir uma lista de contas: ");
		}
	
	void transferirSaldoEntreContas() {
		//System.out.println("Fazer transferência entre contas: ");
		}
	
	void listarSaldoTotal() {
		//System.out.println("Listar saldo total das contas: ");
		}

	
	/*
	 * Abaixo criar o construtor para Contas
	 */
	public Contas(double saldo, String tipoConta, String banco) {
		super();
		this.saldo = saldo;
		this.tipoConta = tipoConta;
		this.banco = banco;
	}
	
	/*
	 * Abaixo criar o construtor padrão para Contas
	 */
	public Contas() {
		
	}
	
	/*
	 * Abaixo instanciar o objeto Contas
	 */
	
	Despesas despesa1 = new Despesas();
		
	
	/*
	 * Abaixo criar uma lista de despesas
	 */
	List<Despesas> despesa = Arrays.asList(despesa1);
	
	
}
