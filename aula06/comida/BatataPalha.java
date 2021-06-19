package PPS.aula06.comida;

public class BatataPalha extends Complemento {


	public BatataPalha(float preco, Comida comida) {
		super(preco, comida);
	}

	public float preco(){
        return comida.preco() + preco;
	}

}
