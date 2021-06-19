package PPS.aula05.pedido.v1;


public class Teste {

    public static void main(String[] args) {
        Produto cerveja = new Produto("Cerveja", 10);
        Produto carne = new Produto("Carne", 30);

        Cliente ze = new Cliente("ze");

        Pedido pedido = new Pedido(ze);
        Item item1 = new Item(2, carne);
        pedido.adicionar(item1);

        System.out.println(pedido.total());
    }
}
