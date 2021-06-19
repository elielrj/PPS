package PPS.aula05.passagem;

public class Trecho implements Voo {

	private String origem;
	private String destino;
	private double custo;

	public Trecho(String origem, String destino, double custo) {
		this.origem = origem;
		this.destino = destino;
		this.custo = custo;
	}

	public double custo() {
		return this.custo;
	}

}
