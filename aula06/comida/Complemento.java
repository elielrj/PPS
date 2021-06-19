package PPS.aula06.comida;

public abstract class Complemento implements Comida {
	protected float preco;
	protected Comida comida;

	public Complemento(float preco, Comida comida) {
		this.preco = preco;
		this.comida = comida;
	}

}
