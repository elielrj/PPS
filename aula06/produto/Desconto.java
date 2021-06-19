package PPS.aula06.produto;

public abstract class Desconto implements Item {
    protected Item item;

    public Desconto(Item item) {
        this.item = item;
    }
}
