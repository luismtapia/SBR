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
    Nodo_BaseConocimineto Anterior;
    
    public Nodo_BaseConocimineto(int LLAVE, String NOMBRE, String ANTECEDENTES,String CONSECUENTE,Nodo_BaseConocimineto ANTERIOR) {
        llave=LLAVE;
        Nombre=NOMBRE;
        Antecedentes=ANTECEDENTES;
        Consecuente=CONSECUENTE;
        Siguiente=null;
        Anterior=ANTERIOR;
    }
}
