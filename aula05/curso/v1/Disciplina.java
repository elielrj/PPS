package PPS.aula05.curso.v1;

public class Disciplina implements Unidade {
    private String nome;
    private int ch;
    private boolean estaConcluida;

    public Disciplina(String nome, int ch) {
        this.nome = nome;
        this.ch = ch;
    }

    public void concluirDisciplina() {
        this.estaConcluida = true;
    }


    @Override
    public int getCargaHoraria() {
        return this.ch;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void adicionarUnidade(Unidade unidade) {
        throw new RuntimeException("Uma disciplina não pode ser composta de qualquer outra unidade.");
    }

    @Override
    public boolean estaConcluida() {
        return estaConcluida;
    }


}
