package PPS.aula05.passagem;

public class Teste {
    public static void main(String[] args) {

        Trecho trecho1 = new Trecho("São Paulo","Brasília",500);
        Trecho trecho2 = new Trecho("Brasília","Recife",300);
        Trecho trecho3 = new Trecho("Recife","Natal",350);

        Conexao conexao1 = new Conexao("Conexão 1", 30);
        conexao1.adicionar(trecho2);
        conexao1.adicionar(trecho3);

        Conexao conexao2 = new Conexao("Conexão 2", 50);
        conexao2.adicionar(trecho1);
        conexao2.adicionar(conexao1);

        System.out.println(conexao1.custo());
        System.out.println(conexao2.custo());

    }
}
