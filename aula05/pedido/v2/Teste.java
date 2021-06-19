package PPS.aula05.pedido.v2;


public class Teste {

    public static void main(String[] args) {
        Produto cerveja = new Produto("Cerveja", 10);
        Produto carne = new Produto("Carne", 30);

        Cliente ze = new Cliente("ze");

        Pedido pedido = new Pedido(ze);

        Kit kit = new Kit();
        kit.adicionar(cerveja);
        kit.adicionar(carne);

        Item item1 = new Item(2, kit);


        pedido.adicionar(item1);



        System.out.println(pedido.total());
    }
}
