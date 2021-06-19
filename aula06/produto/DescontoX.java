package PPS.aula06.produto;

public class DescontoX extends Desconto {
private float valor;

    public DescontoX(Item item, float valor) {
        super(item);
        this.valor = valor;

    }

    @Override
    public float preco() {
        return item.preco() - valor;
    }
}
