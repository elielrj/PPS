package PPS.aula06.formas;

public class Teste {

    public static void main(String[] args) {

        //1. Desenhar um circulo

        Forma forma = new Quadrado(10);
        forma.desenhar();

        //2. Aplicar largura da linha de borda

        Decorador linha = new Linha(0.2, forma);
        linha.desenhar();

        //3. Aplicar cor na linha de borda
        Decorador cor = new Cor("Verde", linha);
        cor.desenhar();

        //4. Aplicar cor no preenchimento
        Decorador preencimento = new Preencimento(forma);
        preencimento.desenhar();

        Cor azul = new Cor("Azul", forma);
        azul.desenhar();


    }
}
