package PPS.aula03.orcamentoV2;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.aprovar();
        System.out.println(orcamento.getEstado());
    }
}
