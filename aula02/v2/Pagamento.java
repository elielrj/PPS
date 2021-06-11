package PPS.aula02.v2;

public class Pagamento {

	private Compra compra;
	private FormaDePagamento formaDePagamento;

	public Pagamento(Compra compra, FormaDePagamento formaDePagamento) {
		this.compra = compra;
		this.formaDePagamento = formaDePagamento;
	}

	public void realizarPagamento(double valor) {
		boolean status = formaDePagamento.pagar(compra, valor);
		if(status == true){
			compra.pagamentoEfetuado();
		}
	}
}
