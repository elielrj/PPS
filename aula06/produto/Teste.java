package PPS.aula06.produto;

public class Teste {

    public static void main(String[] args) {
        Item produto = new Produto(100);

        Desconto descontoX = new DescontoX(produto, 10);

        Desconto descontoY = new DescontoY(descontoX, 5);

        System.out.println(produto.preco());

        System.out.println(descontoX.preco());
        System.out.println(descontoY.preco());
    }
}
