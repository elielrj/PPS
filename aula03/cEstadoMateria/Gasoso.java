

package PPS.aula03.cEstadoMateria;

/**
 *
 * @author willian
 */
public class Gasoso implements Estado {


 private String nome;

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void solidificar(Substancia substancia) {
        throw new RuntimeException("gasoso nao solidifica");
    }

    @Override
    public void fundir(Substancia substancia) {
       throw new RuntimeException("gasoso nao entra em estado de fusao");
    }

    @Override
    public void condensar(Substancia substancia) {
substancia.setEstado(new Liquido());
    }

    @Override
    public void vaporizar(Substancia substancia) {
         throw new RuntimeException("gasoso já está em estado de vaporizacao");
    }

}
