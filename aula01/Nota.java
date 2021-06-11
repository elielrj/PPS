package PPS.aula01;

public class Nota {
    private double valor;
    private double peso;

    public Nota(double valor){
        this(valor,1);
    }

    public Nota(double valor, double peso) {
        this.valor = valor;
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public double getPeso() {
        return peso;
    }
}
