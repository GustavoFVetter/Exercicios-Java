import java.util.Arrays;
import java.util.List;

public class Despesas {

	//Abaixo criar os atributos desta classe
	double valorDaDespesa;
	int dataPagamento; // formato esperado ddmmaa
	int dataPagamentoPrevisto; // formato esperado ddmmaa
	String descricaoDespesa;
	String conta;
	String tipoDespesa; // alimentação, educação, lazer, moradia, roupa, saúde, 
						// transporte, outros
	
	
	//Abaixo criar os metodos desta classe
	/*
	 * -> cadastrar despesas
	 * -> editar despesas
	 * -> remover despesas
	 * -> listar despesas
	 * 			filtro por período (DataInicial e dataFinal)
	 * 			filtro por tipo de despesas
	 * -> listar total despesas
	 */
	
	void cadastrarDespesas() {
		System.out.println("Cadastre a despesa: ");
		}
	
	void editarDespesas() {
		System.out.println("Edite a despesa: ");
		}
	
	void removerDespesas() {
		System.out.println("Remova a despesa: ");
		}
	
	
	// Abaixo criado o contrutor despesas
	public Despesas(double valorDaDespesa, int dataPagamento, int dataPagamentoPrevisto,
			String descricaoDespesa, String conta, String tipoDespesa) {
		super();
		this.valorDaDespesa = valorDaDespesa;
		this.dataPagamento = dataPagamento;
		this.dataPagamentoPrevisto = dataPagamentoPrevisto;
		this.descricaoDespesa = descricaoDespesa;
		this.conta = conta;
		this.tipoDespesa = tipoDespesa;
	}
	
	public Despesas () {
		
	}
	
	/*
	 * Abaixo instanciar a despesas
	 */
	
	Despesas despesa1 = new Despesas(valorDaDespesa, dataPagamento, 
			dataPagamentoPrevisto, descricaoDespesa, conta, tipoDespesa);
	
	List<Despesas> despesas = Arrays.asList(despesa1);
	
	
	/*
	 * Abaixo criar os getters and setters de Despesas
	 */
	public double getValorDaDespesa() {
		return valorDaDespesa;
	}

	public void setValorDaDespesa(double valorDaDespesa) {
		this.valorDaDespesa = valorDaDespesa;
	}

	public int getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(int dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public int getDataPagamentoPrevisto() {
		return dataPagamentoPrevisto;
	}

	public void setDataPagamentoPrevisto(int dataPagamentoPrevisto) {
		this.dataPagamentoPrevisto = dataPagamentoPrevisto;
	}

	public String getDescricaoDespesa() {
		return descricaoDespesa;
	}

	public void setDescricaoDespesa(String descricaoDespesa) {
		this.descricaoDespesa = descricaoDespesa;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getTipoDespesa() {
		return tipoDespesa;
	}

	public void setTipoDespesa(String tipoDespesa) {
		this.tipoDespesa = tipoDespesa;
	}

	public Despesas getDespesa1() {
		return despesa1;
	}

	public void setDespesa1(Despesas despesa1) {
		this.despesa1 = despesa1;
	}

	public List<Despesas> getDespesas() {
		return despesas;
	}

	public void setDespesas(List<Despesas> despesas) {
		this.despesas = despesas;
	}


	
	
	
	
	
}
