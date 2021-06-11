package PPS.aula03.cEstadoMateria;
/**
 *
 * @author willian
 */
public interface Substancia {

    String getNome();
    
    void setNome(String nome);

    void setEstado(Estado estado);
    
    Estado getEstado();

    void solidificar();

    void fundir();

    void condensar();

    void vaporizar();
}
