package PPS.aula03.orcamentoV2;

public class Orcamento {
    private Estado estado;

    public Orcamento() {
        this.estado = new EmAndamento();
    }

    public void aprovar() {
        this.estado = estado.aprovar();
    }

    public String getEstado() {
        return estado.getEstado();
    }
}
