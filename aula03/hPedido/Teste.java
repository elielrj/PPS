package PPS.aula03.hPedido;

public class Teste {

    public static void main(String[] args) {
        Produto cerveja = new Produto("Cerveja", 10);
        Produto carne = new Produto("Carne", 30);

        Cliente ze = new Cliente("ze");

        Pedido pedido = new Pedido(ze);

        Item item1 = new Item(2, cerveja);
        Item item2 = new Item(carne);

        pedido.adicionar(item1);

        System.out.println(pedido.getEstado());
        System.out.println(pedido.total());

        pedido.fechar();
        System.out.println(pedido.getEstado());

        pedido.reabrir();
        System.out.println(pedido.getEstado());

        pedido.fechar();
        System.out.println(pedido.getEstado());

        pedido.adicionar(item2);
        System.out.println(pedido.getEstado());
    }
}
