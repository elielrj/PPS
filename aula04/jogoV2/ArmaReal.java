package PPS.aula04.jogoV2;

public class ArmaReal implements Arma{

    private int dano;

    public ArmaReal(int dano) {
        this.dano =dano;
    }

    @Override
    public int qualDano() {
        return dano;
    }
}
