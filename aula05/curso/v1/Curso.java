package PPS.aula05.curso.v1;

import java.util.ArrayList;
import java.util.List;

public class Curso implements Unidade {

    private String nome;
    private List<Unidade> modulos = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    @Override
    public void adicionarUnidade(Unidade unidade) {
        this.modulos.add(unidade);
    }

    @Override
    public boolean estaConcluida() {
        for (Unidade m : modulos) {
            return m.estaConcluida();
        }
        return false;
    }

    @Override
    public int getCargaHoraria() {
        int total = 0;
        for (Unidade modulo : modulos) {
            total += modulo.getCargaHoraria();
        }
        return total;
    }

    public String getNome() {
        return nome;
    }

    public List<Unidade> getModulos() {
        return modulos;
    }

}
