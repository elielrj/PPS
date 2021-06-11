package PPS.aula03.orcamentoV2;

public class Finalizado implements Estado {
    @Override
    public String getEstado() {
        return "Finalizado";
    }
    @Override
    public Estado aprovar() {
        throw new RuntimeException("nao da");
    }

    @Override
    public Estado reprovar() {
        throw new RuntimeException("nao da");
    }

    @Override
    public Estado finalizar() {
        throw new RuntimeException("nao da");
    }
}
