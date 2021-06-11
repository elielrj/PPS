

package PPS.aula03.cEstadoMateria;

/**
 *
 * @author willian
 */
public class Teste {
    
    public static void main(String[] args) {
        Substancia substancia = new Agua();
        substancia.setNome("Agua");
        substancia.setEstado(new Liquido());
        
        substancia.condensar();
        System.out.println(substancia.getNome());
        System.out.println(substancia.getEstado().getNome());
        
        substancia.fundir();
        
        
        
    }

}
