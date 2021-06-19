package PPS.aula05.passagem;

import java.util.ArrayList;
import java.util.List;

public class Conexao implements Adicionavel {

	private String nome;
	private double custo;
	private List<Voo> voos;

	public Conexao(String nome, double custo) {
		this.nome = nome;
		this.voos = new ArrayList<>();
		this.custo = custo;
	}

	@Override
	public void adicionar(Voo voo) {
		voos.add(voo);
	}

	@Override
	public double custo() {
		double valorDaConexao = 0;
		for(Voo voo: voos){
			valorDaConexao += voo.custo();
		}
		return valorDaConexao + custo;
	}

}
