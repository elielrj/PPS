package PPS.aula04.jogoV1;

public class Personagem {
    private Arma arma;
    private int vida;

    public Personagem(Arma arma) {
        this.arma = arma;
        this.vida = 100;
    }

    public Personagem() {
        this(null);
    }

    public void golpear(Personagem personagem){
        if(this.arma == null){ // eliminar
            personagem.diminuirVida(1);
        } else {
            personagem.diminuirVida(arma.qualDano());
        }
    }

    private void diminuirVida(int dano) {
        this.vida = this.vida - dano;
    }

    public int getVida() {
        return vida;
    }
}
