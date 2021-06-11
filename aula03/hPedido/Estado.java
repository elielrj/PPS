package PPS.aula03.hPedido;

public interface Estado {
	public String getEstado();
	public void adicionar(Pedido pedido, Item item);
	public void remover(Pedido pedido, Item item);
	public void fechar(Pedido pedido);
	public void reabrir(Pedido pedido);
}
