package PPS.aula03.hPedido;

public class Aberto implements Estado {
	private String nome;

	public Aberto() {
		this.nome = "Aberto";
	}
	@Override
	public String getEstado() {
		return nome;
	}
	@Override
	public void adicionar(Pedido pedido, Item item) {
		pedido.adicionarItemAListaDeItens(item);
	}
	@Override
	public void remover(Pedido pedido, Item item) {
		pedido.removerItemDaListaDeItem(item);
	}
	@Override
	public void fechar(Pedido pedido) {
		pedido.setEstado(new Fechado());
	}
	@Override
	public void reabrir(Pedido pedido) {
		throw new RuntimeException("Pedido aberto, imposível reabrir!\n");
	}
}
