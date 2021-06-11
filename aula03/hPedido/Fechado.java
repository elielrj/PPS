package PPS.aula03.hPedido;

public class Fechado implements Estado {
	private String nome;

	public Fechado() {
		this.nome = "Finalizado";
	}
	@Override
	public String getEstado() {
		return nome;
	}
	@Override
	public void adicionar(Pedido pedido, Item item) {
		throw new RuntimeException("Fedido fechado. Não pode ser adicionado item!\n");
	}
	@Override
	public void remover(Pedido pedido, Item item) {
		throw new RuntimeException("Fedido fechado. Não pode ser removido item!\n");
	}
	@Override
	public void fechar(Pedido pedido) {
		throw new RuntimeException("Fedido já fechado.!\n");
	}
	@Override
	public void reabrir(Pedido pedido) {
		pedido.setEstado(new Reabrir());
	}
}
