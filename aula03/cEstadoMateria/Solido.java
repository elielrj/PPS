package PPS.aula03.cEstadoMateria;
/**
 *
 * @author willian
 */
public class Solido implements Estado {

    private String nome;

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void solidificar(Substancia substancia) {
        throw new RuntimeException("já é solido");
    }

    @Override
    public void fundir(Substancia substancia) {
        substancia.setEstado(new Liquido());
    }

    @Override
    public void condensar(Substancia substancia) {
        throw new RuntimeException("solido nao condensa");
    }

    @Override
    public void vaporizar(Substancia substancia) {
        throw new RuntimeException("solido nao vaporiza");
    }

}
