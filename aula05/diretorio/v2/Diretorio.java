package PPS.aula05.diretorio.v2;

import java.util.ArrayList;
import java.util.List;

public class Diretorio implements Adcionavel {

	private List<Elemento> elementos;
	private String nome;

	public Diretorio(String nome) {
		this.elementos = new ArrayList<>();
		this.nome = nome;
	}

	@Override
	public void adicionar(Elemento elemento){
		this.elementos.add(elemento);
	}

	@Override
	public String exibir(){
		String s = nome;
		for(Elemento elemento: elementos){
			if(elemento instanceof Diretorio){
				s+= "\n+" + ((Diretorio) elemento).exibir();
			} else {
				s+= "\n--" + elemento.exibir();
			}
		}
		return  s;
	}

}
