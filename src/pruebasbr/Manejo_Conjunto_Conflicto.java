package pruebasbr;

/**
 *
 * @author luis
 */
public class Manejo_Conjunto_Conflicto {
    NODO_ConjuntoConflicto Inicio;

    public Manejo_Conjunto_Conflicto() {
        Inicio = null;
    }
    
    public void insertar_fila(int llave, String nombre_de_regla,String antecedentes, String consecuentes){
        NODO_ConjuntoConflicto R;
        
        if(Inicio == null){
            //BASE VACIA
            Inicio = new NODO_ConjuntoConflicto(llave, nombre_de_regla, antecedentes, consecuentes);
        }else{
            //BASE OCUPADA
            R = Inicio;
            while(R.Siguiente != null){
                R = R.Siguiente;
            }
            R.Siguiente = new NODO_ConjuntoConflicto(llave, nombre_de_regla, antecedentes, consecuentes);
        }
    }
    
    
    public boolean vacio_CC(){
        boolean vacio;
        vacio = Inicio==null;
        return vacio;
    }
    
    public void buscar(){
        
    }
    
    public NODO_ConjuntoConflicto obtener_menor_numero(){
        NODO_ConjuntoConflicto Nodo_CC_menor= null;
        NODO_ConjuntoConflicto R=Inicio;
        //NODO_ConjuntoConflicto Anterior= null;
        
        int cuantos_antecedentes_ant,cuantos_antecedentes_sig;
        
        if (Inicio!=null) {
            cuantos_antecedentes_ant=contar_antecedentes(Inicio.antecedentes);
            Nodo_CC_menor=Inicio;
            //Anterior=Inicio;
            while(R.Siguiente != null){
                R = R.Siguiente;
                cuantos_antecedentes_sig=contar_antecedentes(R.antecedentes);
                if (cuantos_antecedentes_ant>cuantos_antecedentes_sig) {
                    Nodo_CC_menor=R;
                    //Anterior=R;
                    cuantos_antecedentes_ant=cuantos_antecedentes_sig;
                }
            }
            //Anterior.Siguiente=Nodo_CC_menor.Siguiente;
        }
        return Nodo_CC_menor;
    }
    
    public int contar_antecedentes(String antecedentes){
        int cuantos=0;
            //split
            //String[] items = "A,B,C,,,,,,,,,,".split(",");
            String[] items = antecedentes.split(",");
            
            for (int i = 0; i < items.length; i++) {
                //System.out.println(items[i]);
                cuantos=i+1;
        }
        return cuantos;
    }
    
    public String mostrar_CC(){
        NODO_ConjuntoConflicto R=Inicio;
        String lectura = "";
        if (Inicio!=null) {
            lectura+=R.nombre_de_regla+" : "+R.antecedentes+" : "+R.consecuentes;
            while (R.Siguiente != null) {
                R=R.Siguiente;
                lectura+=R.nombre_de_regla+" : "+R.antecedentes+" : "+R.consecuentes;
            }
        }else{
            lectura="ESTA VACIO EL CC";
        }
        return lectura;
    }
    
    public void sacar_NODO_elegido(NODO_ConjuntoConflicto aSACAR){
        NODO_ConjuntoConflicto R=Inicio;
        
        if (Inicio!=null) {
            if(aSACAR==Inicio)
                Inicio=Inicio.Siguiente;
            else{
                //System.out.println("no es inico R: "+R.Siguiente.nombre_de_regla);
                while(R.Siguiente != null){
                    if (R.Siguiente == aSACAR ) {
                       R.Siguiente=R.Siguiente.Siguiente;
                    }else
                        R = R.Siguiente;
                }
                if (R.Siguiente == null) {
                    //System.out.println("no esta el que se va a sacar obvio este caso no debe de pasaar");
                }
            }
            
            //System.out.println("ant "+Anterior.nombre_de_regla+" --- "+Nodo_CC_menor.nombre_de_regla+ " --sig-> "+Nodo_CC_menor.Siguiente);
            //Anterior.Siguiente=Nodo_CC_menor.Siguiente;
            //System.out.println(mostrar_CC());
        }
    }
    
}
