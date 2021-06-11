/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPS.aula03.cEstadoMateria;;

/**
 *
 * @author willian
 */
public interface Estado {
    
    String getNome();    
    
    void solidificar(Substancia substancia);
    
    void fundir(Substancia substancia);
    
    void condensar(Substancia substancia);
    
    void vaporizar(Substancia substancia);
    
}
