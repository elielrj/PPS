package PPS.aula06.comida;

public class Sopa implements Comida {
    private float preco;

    public Sopa(float preco) {
        this.preco = preco;
    }

    @Override
    public float preco() {
        return preco;
    }
}
