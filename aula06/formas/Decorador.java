package PPS.aula06.formas;

public abstract class Decorador implements Forma {

    protected final Forma forma;

    public Decorador(Forma forma) {
        this.forma = forma;
    }

    @Override
    public void desenhar() {
        forma.desenhar();
    }
}
