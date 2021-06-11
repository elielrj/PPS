package PPS.aula04.enderecoV2;

public class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Pessoa(String nome) {
        this(nome, new SemEndereco());
    }

    public String getDadosPessoais() {
            return nome + " - " + endereco.getRua();
    }
}
