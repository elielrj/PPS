package PPS.aula03.hPedido;

import java.time.LocalDate;

public class Pedido {

    private LocalDate data;
    private Cliente cliente;
    private ListaDeItens listaDeItens;
    private Estado estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.data = LocalDate.now();
        this.listaDeItens = new ListaDeItens();
        this.estado = new Aberto();
    }

    public String getEstado() {
        return estado.getEstado();
    }
    public void adicionar(Item item) {
        this.estado.adicionar(this, item);
    }
    public void remover(Item item) {
        this.estado.remover(this,item);
    }
    public void fechar(){
        this.estado.fechar(this);
    }
    public void setEstado(Estado estado){
        this.estado = estado;
    }
    public void reabrir(){
        this.estado.reabrir(this);
    }
    public float total() {
        return listaDeItens.total();
    }
    public void adicionarItemAListaDeItens(Item item) {
        listaDeItens.adicionarItem(item);
    }
    public void removerItemDaListaDeItem(Item item) {
        listaDeItens.removerItem(item);
    }
}
