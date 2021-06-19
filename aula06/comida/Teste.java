package PPS.aula06.comida;

public class Teste {

    public static void main(String[] args) {
        Comida sanduba = new Sanduiche(10);

        Complemento bataba = new BatataPalha(2,sanduba);

        //System.out.println(bataba.preco());

        Comida sopa = new Sopa(5);

        QueijoRalado queijoRalado = new QueijoRalado(3, new BatataPalha(1, sopa));

        System.out.println(queijoRalado.preco());

        System.out.println(sopa.preco());
    }
}
