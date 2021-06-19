package PPS.aula05.pedido.v2;

import java.util.ArrayList;
import java.util.List;

public class Kit implements Elemento {
    private List<Produto> produtos;

    public Kit() {
        this.produtos = new ArrayList<>();
    }

    public void adicionar(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public float getPreco() {
        float total = 0;
        for(Produto p: produtos){
            total+=p.getPreco();
        }
        return total;
    }
}
