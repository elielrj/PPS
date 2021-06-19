package PPS.aula06.formas;

public class Preencimento extends Decorador {


    public Preencimento(Forma forma) {
        super(forma);
    }

    @Override
    public void desenhar() {
        forma.desenhar();
        System.out.println(" com preenchimento");
    }
}
