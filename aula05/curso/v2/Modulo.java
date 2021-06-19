package PPS.aula05.curso.v2;

import java.util.ArrayList;
import java.util.List;

public class Modulo {
    private String nome;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Modulo(String nome) {
        this.nome = nome;
    }


    public void adicionarUnidade(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public boolean estaConcluida() {
        for (Disciplina d : disciplinas) {
            if(!d.estaConcluida()){
                return false;
            }
        }
        return true;
    }


    public int getCargaHoraria() {
        int total = 0;
        for (Disciplina d : disciplinas) {
            total += d.getCargaHoraria();
        }
        return total;
    }

    public String getNome() {
        return nome;
    }


}
