package PPS.aula06.comida;

public class QueijoRalado extends Complemento {
    public QueijoRalado(float preco, Comida comida) {
        super(preco, comida);
    }

    @Override
    public float preco() {
        return comida.preco() + preco;
    }
}
