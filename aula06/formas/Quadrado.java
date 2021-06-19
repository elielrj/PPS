package PPS.aula06.formas;

public class Quadrado implements Forma {

    private int tamanho;

    public Quadrado(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void desenhar() {
        System.out.println("quadrado desenhado com o tamanho " + tamanho);
    }
}
