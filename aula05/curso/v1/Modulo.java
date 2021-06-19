package PPS.aula05.curso.v1;

import java.util.ArrayList;
import java.util.List;

public class Modulo implements Unidade {
    private String nome;
    private List<Unidade> disciplinas = new ArrayList<>();

    public Modulo(String nome) {
        this.nome = nome;
    }

    @Override
    public void adicionarUnidade(Unidade unidade) {
        this.disciplinas.add(unidade);
    }

    public boolean estaConcluida() {
        for (Unidade m : disciplinas) {
            return m.estaConcluida();
        }
        return false;
    }

    @Override
    public int getCargaHoraria() {
        int total = 0;
        for (Unidade modulo : disciplinas) {
            total += modulo.getCargaHoraria();
        }
        return total;
    }

    public String getNome() {
        return nome;
    }

    public List<Unidade> getDisciplinas() {
        return disciplinas;
    }


}
