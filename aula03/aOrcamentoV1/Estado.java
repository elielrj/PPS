package PPS.aula03.aOrcamentoV1;

public interface Estado {
    String getEstado();
    Estado aprovar();
    Estado reprovar();
    Estado finalizar();

}
