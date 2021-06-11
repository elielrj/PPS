package PPS.aula02.v2;

public class Compra {

	private double valor;
	private boolean status;

	public Compra(double valor) {
		this.valor = valor;
		this.status = false;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;

	}

	public void pagamentoEfetuado() {
		this.status = true;
	}

	public boolean situacaoDaCompra() {
		return status;
	}

}
