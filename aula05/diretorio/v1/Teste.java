package PPS.aula05.diretorio.v1;

public class Teste {

    public static void main(String[] args) {
        Diretorio diretorio = new Diretorio("imagens");

        diretorio.adicionarArquivo("x.png");
        diretorio.adicionarArquivo("y.png");

        for (Arquivo arquivo1 : diretorio.getArquivos()) {
            System.out.println(arquivo1.getNome());
        }
    }

}


