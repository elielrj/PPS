package PPS.aula03.orcamentoV2;

public interface Estado {
    String getEstado();
    Estado aprovar();
    Estado reprovar();
    Estado finalizar();

}
