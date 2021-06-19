package PPS.aula06.formas;

public class Linha extends Decorador {
    private final double largura;


    public Linha(double largura, Forma forma) {
        super((forma));
        this.largura = largura;

    }

    @Override
    public void desenhar() {
        forma.desenhar();
        System.out.println(" com linha");
    }
}
