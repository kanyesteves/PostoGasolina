package utils;

public class Bomba {
	private int codigo;
	private int quantidade_litros;
	private String tipo_bomba;
	Cliente cliente;
	
	
	public Bomba(int codigo, int quantidade_litros, String tipo_bomba, Cliente cliente) {
		this.codigo = codigo;
		this.quantidade_litros = quantidade_litros;
		this.tipo_bomba = tipo_bomba;
		this.cliente = cliente;
	}

	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade_litros() {
		return quantidade_litros;
	}

	public void setQuantidade_litros(int quantidade_litros) {
		this.quantidade_litros = quantidade_litros;
	}

	public String getTipo_bomba() {
		return tipo_bomba;
	}

	public void setTipo_bomba(String tipo_bomba) {
		this.tipo_bomba = tipo_bomba;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void liberarBomba() {
		
	}
}
