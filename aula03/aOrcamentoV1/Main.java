package PPS.aula03.aOrcamentoV1;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.aprovar();
        System.out.println(orcamento.getEstado());
    }
}
