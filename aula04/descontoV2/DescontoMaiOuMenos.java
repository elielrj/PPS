package PPS.aula04.descontoV2;

public class DescontoMaiOuMenos implements Desconto {

    @Override
    public double calcularDesconto(Pedido pedido) {
        return pedido.getValor() * 0.1;
    }
}
