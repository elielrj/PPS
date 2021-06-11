

package PPS.aula03.cEstadoMateria;
/**
 *
 * @author willian
 */
public class Liquido implements Estado {

  private String nome = "Líquido";
  
  

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void solidificar(Substancia substancia) {
        substancia.setEstado(new Solido());
    }

    @Override
    public void fundir(Substancia substancia) {
        throw new RuntimeException("liquido nao entra em estado de fusao");
    }

    @Override
    public void condensar(Substancia substancia) {
        substancia.setEstado(new Liquido());
    }

    @Override
    public void vaporizar(Substancia substancia) {
        substancia.setEstado(new Gasoso());
    }

}



