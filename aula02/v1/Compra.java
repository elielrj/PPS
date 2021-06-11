package PPS.aula02.v1;

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

	public void setStatus(boolean pago) {
		this.status = pago;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean getStatus() {
		return status;
	}
}