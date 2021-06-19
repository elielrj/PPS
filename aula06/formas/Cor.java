package PPS.aula06.formas;

public class Cor extends Decorador {
    private final String nome;


    public Cor(String nome, Forma forma) {
        super((forma));
        this.nome = nome;
    }

    @Override
    public void desenhar() {
        forma.desenhar();
        System.out.println(" na cor " + nome);

    }
}
