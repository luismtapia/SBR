/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasbr;

/**
 *
 * @author luis
 */
public class Nodo_BaseConocimineto {
    
    int llave;
    String Nombre;
    String Antecedentes;
    String Consecuente;
    
    Nodo_BaseConocimineto Siguiente;
    
    public Nodo_BaseConocimineto(int LLAVE, String NOMBRE, String ANTECEDENTES,String CONSECUENTE) {
        llave=LLAVE;
        Nombre=NOMBRE;
        Antecedentes=ANTECEDENTES;
        Consecuente=CONSECUENTE;
        Siguiente=null;
    }
}
