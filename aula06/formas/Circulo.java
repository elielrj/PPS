package PPS.aula06.formas;

public class Circulo implements Forma {
    private final int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public void desenhar() {
        System.out.println("circulo desenhado");
    }
}
