package PPS.aula04.jogoV2;

public class Personagem {
    private Arma arma;
    private int vida;

    public Personagem(Arma arma) {
        this.arma = arma;
        this.vida = 100;
    }

    public Personagem() {
        this(new SemArma());
    }

    public void golpear(Personagem personagem){
            personagem.diminuirVida(arma.qualDano());
    }

    private void diminuirVida(int dano) {
        this.vida = this.vida - dano;
    }

    public int getVida() {
        return vida;
    }
}
