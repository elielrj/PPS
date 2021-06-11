package PPS.aula01;

import java.util.List;

public class CalculadoraDeMedias {

    public double calcularMedia(List<Nota> notas, Formula formula){
        return formula.calcularMedia(notas);
    }
}
