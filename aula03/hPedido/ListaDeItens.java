package PPS.aula03.hPedido;

import java.util.ArrayList;
import java.util.List;

public class ListaDeItens {

    private List<Item> itens;

    public ListaDeItens() {
        this.itens = new ArrayList<>();
    }

    public boolean removerItem(Item item) {
        return itens.remove(item);
    }

    public int quatidadeDeItens() {
        return itens.size();
    }

    public boolean adicionarItem(Item item) {
        return itens.add(item);
    }

    public float total() {
        float total = 0;
        for(Item item: itens){
            total += item.subTotal();
        }
        return total;
    }
}
