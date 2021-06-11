package PPS.aula04.descontoV1;

public class Pedido {
    private double valor;
    private Desconto desconto;

    public Pedido(double valor) {
        this.valor = valor;
    }

    public Pedido(double valor, Desconto desconto) {
        this.valor = valor;
        this.desconto = desconto;
    }

    public double calcularDesconto() {
        if(desconto == null) {
            return 0;
        }
        return desconto.calcularDesconto(this);
    }

    public double getValor() {
        return valor;
    }
}
