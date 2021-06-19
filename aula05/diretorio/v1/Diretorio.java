package PPS.aula05.diretorio.v1;

import java.util.ArrayList;
import java.util.List;

public class Diretorio {

    private String nome;
    private List<Arquivo> arquivos = new ArrayList<>();

    public Diretorio(String nome) {
        this.nome = nome;
    }

    public void adicionarArquivo(String nome) {
        Arquivo arquivo = new Arquivo(nome);
        this.arquivos.add(arquivo);
    }

    public String getNome() {
        return nome;
    }

    public List<Arquivo> getArquivos() {
        return arquivos;
    }
}

