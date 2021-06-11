package PPS.aula04.jogoV1;

public class Teste {

    public static void main(String[] args) {
        Arma machado = new Arma(10);
        Personagem personagem1 = new Personagem(machado);
        Personagem personagem2 = new Personagem();

        personagem1.golpear(personagem2);

        System.out.println(personagem1.getVida());
        System.out.println(personagem2.getVida());
    }
}
