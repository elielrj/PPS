package PPS.aula02.v1;

public class CartaoDeCredito implements FormaDePagamento{

	@Override
	public  boolean pagar(double valor){
		return true;
	}

}
