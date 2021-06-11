package PPS.aula02.v1;

public class Teste {
    public static void main(String[] args) {

        Compra compra1 = new Compra(100);
        Compra compra2 = new Compra(200);
        Compra compra3 = new Compra(300);

        FormaDePagamento formaDePagamento1 = new Dinheiro();
        FormaDePagamento formaDePagamento2 = new CartaoDeCredito();
        FormaDePagamento formaDePagamento3 = new Pix();

        Pagamento pagamento1 = new Pagamento(compra1,formaDePagamento1);
        Pagamento pagamento2 = new Pagamento(compra2,formaDePagamento2);
        Pagamento pagamento3 = new Pagamento(compra3,formaDePagamento3);

        pagamento1.pagar(50);
        System.out.println(compra1.getStatus());
    }
}
