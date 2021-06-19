package PPS.aula05.curso.v2;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private List<Modulo> modulos = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public void adicionarModulo(Modulo modulo) {
        this.modulos.add(modulo);
    }

    public boolean estaConcluida() {
        for (Modulo m : modulos) {
            if(!m.estaConcluida()){
                return false;
            }
        }
        return true;
    }

    public int getCargaHoraria() {
        int total = 0;
        for (Modulo modulo : modulos) {
            total += modulo.getCargaHoraria();
        }
        return total;
    }

    public String getNome() {
        return nome;
    }


}


