package pruebasbr;

/**
 *
 * @author luis
 */
public class Manejo_Base_Conocimiento {
    Nodo_BaseConocimineto Inicio;

    public Manejo_Base_Conocimiento() {
        Inicio = null;
    }
    
    public void insertar_BC(int llave, String nombre, String antecedentes, String consecuente){
        Nodo_BaseConocimineto R;
        
        if(Inicio == null){
            //BASE VACIA
            Inicio = new Nodo_BaseConocimineto(llave,nombre, antecedentes, consecuente,null);
        }else{
            //BASE OCUPADA
            R = Inicio;
            while(R.Siguiente != null){
                R = R.Siguiente;
            }
            R.Siguiente = new Nodo_BaseConocimineto(llave,nombre, antecedentes, consecuente,R);
        }
    }
    
    public String mostrar_BC(){
        Nodo_BaseConocimineto R=Inicio;
        String lectura = "";
        if (Inicio!=null) {
            do {
                lectura+=R.llave+" : "+R.Nombre+" : "+R.Antecedentes+" : "+R.Consecuente;
                R=R.Siguiente;
            } while (R.Siguiente != null);
                lectura+=R.llave+" : "+R.Nombre+" : "+R.Antecedentes+" : "+R.Consecuente;
        }else{
            lectura="ESTA VACIO LA BC";
        }
        return lectura;
    }
    
    public void ordenar(){
        Nodo_BaseConocimineto R;
        R=Inicio;
        
        
        if(Inicio != null){//ordena
            
            //BASE VACIA
            //Inicio = new Nodo_BaseConocimineto(llave,nombre, antecedentes, consecuente,null);
            //BASE OCUPADA
            R = Inicio;
            while(R.Siguiente != null){
                R = R.Siguiente;
            }
            //R.Siguiente = new Nodo_BaseConocimineto(llave,nombre, antecedentes, consecuente,R);
        }else{
            System.out.println("esta ordenada cara");
        }
    }
}
