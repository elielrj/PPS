package PPS.aula04.descontoV2;

public class DescontoBom implements Desconto {

    @Override
    public double calcularDesconto(Pedido pedido) {
        return pedido.getValor() * 0.5;
    }
}
