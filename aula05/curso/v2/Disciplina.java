package PPS.aula05.curso.v2;

public class Disciplina {
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

    public int getCargaHoraria() {
        return this.ch;
    }

    public String getNome() {
        return nome;
    }

    public boolean estaConcluida() {
        return estaConcluida;
    }


}
