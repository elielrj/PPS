package PPS.aula06.produto;

public class DescontoY extends Desconto {
    private final float valor;

    public DescontoY(Desconto desconto, float valor) {
        super(desconto);
        this.valor = valor;
    }

    @Override
    public float preco() {
        return item.preco() - valor;
    }
}
