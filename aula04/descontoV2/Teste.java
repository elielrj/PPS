package PPS.aula04.descontoV2;

public class Teste {
    public static void main(String[] args) {
        Desconto descontoBom = new DescontoBom();
        Pedido pedido = new Pedido(100,descontoBom);
        System.out.println(pedido.calcularDesconto());

        DescontoMaiOuMenos descontoMaisOuMenos = new DescontoMaiOuMenos();
        Pedido pedido2 = new Pedido(100,descontoMaisOuMenos);
        System.out.println(pedido2.calcularDesconto());

        Pedido pedido3 = new Pedido(100);
        System.out.println(pedido3.calcularDesconto());

        Pedido pedido4 = new Pedido(100, null);
        System.out.println(pedido4.calcularDesconto());
    }
}
