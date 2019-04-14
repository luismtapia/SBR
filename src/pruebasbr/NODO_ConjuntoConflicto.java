package pruebasbr; 

/**
 *
 * @author luis
 */
public class NODO_ConjuntoConflicto {
    
    int llave;
    String nombre_de_regla;
    String antecedentes;
    String consecuentes;
    NODO_ConjuntoConflicto Siguiente;
    NODO_ConjuntoConflicto Anterior;
    
    public NODO_ConjuntoConflicto(int LLAVE, String REGLA, String ANTECEDENTE,String CONSECUENTE) {
        llave=LLAVE;
        nombre_de_regla=REGLA;
        antecedentes=ANTECEDENTE;
        consecuentes=CONSECUENTE;
        Siguiente=null;
    }

    public NODO_ConjuntoConflicto(int llave, String nombre_de_regla, String antecedentes, String consecuentes, NODO_ConjuntoConflicto Siguiente, NODO_ConjuntoConflicto Anterior) {
        this.llave = llave;
        this.nombre_de_regla = nombre_de_regla;
        this.antecedentes = antecedentes;
        this.consecuentes = consecuentes;
        this.Siguiente = null;
        this.Anterior = Anterior;
    }
    
    
    
    
    
}
