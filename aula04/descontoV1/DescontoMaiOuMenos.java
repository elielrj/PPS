package PPS.aula04.descontoV1;

public class DescontoMaiOuMenos implements Desconto {

    @Override
    public double calcularDesconto(Pedido pedido) {
        return pedido.getValor() * 0.1;
    }
}
