package PPS.aula04.descontoV2;

public class Pedido {
    private double valor;
    private Desconto desconto;

    public Pedido(double valor) {
        this(valor, new SemDesconto());
    }

    public Pedido(double valor, Desconto desconto) {
        this.valor = valor;
        if(desconto == null){
            this.desconto = new SemDesconto();
        }else {
            this.desconto = desconto;
        }
    }

    public double calcularDesconto() {
        return desconto.calcularDesconto(this);
    }

    public double getValor() {
        return valor;
    }
}
