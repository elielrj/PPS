package PPS.aula01;

import java.util.ArrayList;
import java.util.List;

public class Principal {


    public static void main(String[] args) {
        List<Nota> notas;
        notas = new ArrayList<>();
        notas.add(new Nota(10,5));
        notas.add(new Nota(2,2));
        notas.add(new Nota(6,1));
        notas.add(new Nota(7,2));

        CalculadoraDeMedias calculadoraDeMedias = new CalculadoraDeMedias();
        Formula formulaA = new FormulaAritimetica();
        Formula formulaP = new FormulaPonderada();
        double media = calculadoraDeMedias.calcularMedia(notas,formulaP);
        System.out.println(media);
        media = calculadoraDeMedias.calcularMedia(notas,formulaA);
        System.out.println(media);
    }

}
