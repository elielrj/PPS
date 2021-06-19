package PPS.aula05.diretorio.v2;

public class Teste {
    public static void main(String[] args) {
        Arquivo arquivo1 = new Arquivo("Arquivo 1 ");
        Arquivo arquivo2 = new Arquivo("Arquivo 2");

        Diretorio diretorio1 = new Diretorio("Diretório 1");
        Diretorio diretorio2 = new Diretorio("Diretório 2");

        diretorio1.adicionar(arquivo1);
        diretorio1.adicionar(diretorio2);
        diretorio2.adicionar(arquivo2);

        String resultado = diretorio1.exibir();
        System.out.println(resultado);
    }
}
