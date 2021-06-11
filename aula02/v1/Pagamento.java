package PPS.aula02.v1;

public class Pagamento {

	private Compra compra;
	private FormaDePagamento formaDePagamento;

	public Pagamento(Compra compra, FormaDePagamento formaDePagamento) {
		this.compra = compra;
		this.formaDePagamento = formaDePagamento;
	}

	public void pagar(double valor) {
		boolean compraPaga;
		compraPaga = formaDePagamento.pagar(compra.getValor());

		if(compraPaga){
			compra.setValor(compra.getValor() - valor);
			compra.setStatus(true);
		}
	}

}
