package utils;

public class Conveniencia {
	Cliente cliente;
	private int atendente;
	private int quantidade_vendas;
	
	public Conveniencia(Cliente cliente, int atendente, int quantidade_vendas) {
		this.cliente = cliente;
		this.atendente = atendente;
		this.quantidade_vendas = quantidade_vendas;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getAtendente() {
		return atendente;
	}

	public void setAtendente(int atendente) {
		this.atendente = atendente;
	}

	public int getQuatidade_vendas() {
		return quantidade_vendas;
	}

	public void setQuatidade_vendas(int quatidade_vendas) {
		this.quantidade_vendas = quatidade_vendas;
	}
	
	
	public void recebimento(float pagamento) {
		
	}
	
	public void cadastrarCliente(Cliente cliente) {
		
	}
	
	public void calcularTroco(String troco) {
		
	}
	
	public void controlarEstoque() {
		
	}
	
	public void registrarVendasConcluidas(String venda) {
		
	}
}
