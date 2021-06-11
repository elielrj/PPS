package PPS.aula04.descontoV2;

public class SemDesconto implements Desconto {

    @Override
    public double calcularDesconto(Pedido pedido) {
        return 0;
    }
}
