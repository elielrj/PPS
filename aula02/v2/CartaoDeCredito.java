package PPS.aula02.v2;
public class CartaoDeCredito implements FormaDePagamento {

	@Override
	public boolean pagar(Compra compra, double valor){
		compra.setValor(compra.getValor()-valor);
		if(compra.getValor() == 0){
			return true;
		}
		return false;
	}
}