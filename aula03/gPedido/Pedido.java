package PPS.aula03.gPedido;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private LocalDate data;
    private Cliente cliente;

    private List<Item> itens;

    private String estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.data = LocalDate.now();
        this.itens = new ArrayList<>();
        this.estado = "Aberto";
    }

    public void adicionar(Item item) {
        if(!estado.equalsIgnoreCase("Aberto")) {
            throw new RuntimeException("pedido fechado");
        }
        itens.add(item);
    }

    public void remover(Item item) {
        if(!estado.equalsIgnoreCase("Aberto")) {
            throw new RuntimeException("pedido fechado");
        }
        itens.remove(item);
    }

    public void fechar(){
        estado = "Fechado";
    }

    public void reabrir(){
        estado = "Aberto";
    }

    public float total() {
        float total = 0;
        for(Item item: itens){
            total= total + item.subTotal();
        }
        return  total;
    }
}
