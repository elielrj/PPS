package PPS.aula03.fEstadosSequenciais;

public class Teste {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        System.out.println(aluno.getSemestre());
        aluno.avancar();
        System.out.println(aluno.getSemestre());
        aluno.avancar();
        System.out.println(aluno.getSemestre());
        aluno.avancar();
        System.out.println(aluno.getSemestre());
    }
}
