package PPS.aula02.v2;

public class Teste {
    public static void main(String[] args) {

        FormaDePagamento formaDePagamentoPorCartaoDeCredito = new CartaoDeCredito();
        FormaDePagamento formaDePagamentoPorPix = new Pix();
        FormaDePagamento formaDePagamentoPorDinheiro = new Dinheiro();

        Compra compra = new Compra(100);

        Pagamento pagamento1 = new Pagamento(compra,formaDePagamentoPorCartaoDeCredito);
        pagamento1.realizarPagamento(20);
        System.out.println("Situação da Compra: " + compra.situacaoDaCompra() + "\nValor Atual: R$" + compra.getValor() + "\n");

        Pagamento pagamento2 = new Pagamento(compra,formaDePagamentoPorPix);
        pagamento1.realizarPagamento(30);
        System.out.println("Situação da Compra: " + compra.situacaoDaCompra() + "\nValor Atual: R$" + compra.getValor() + "\n");

        Pagamento pagamento3 = new Pagamento(compra,formaDePagamentoPorDinheiro);
        pagamento1.realizarPagamento(50);
        System.out.println("Situação da Compra: " + compra.situacaoDaCompra() + "\nValor Atual: R$" + compra.getValor() + "\n");
    }
}
