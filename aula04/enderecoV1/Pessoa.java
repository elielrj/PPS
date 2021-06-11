package PPS.aula04.enderecoV1;

public class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getDadosPessoais() {
        if(endereco== null) {
            return nome;
        }else{
            return nome + " - " + endereco.getRua();
        }
    }
}
