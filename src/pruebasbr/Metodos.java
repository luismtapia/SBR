
package pruebasbr;

import java.io.IOException;

/**
 *
 * @author luis
 */
public class Metodos {
    Archivos archivo=new Archivos();
    Manejo_Conjunto_Conflicto ConjuntoConflicto=new Manejo_Conjunto_Conflicto();
    Manejo_Conjunto_Conflicto Grafo_RETE=new Manejo_Conjunto_Conflicto();
    
    public void inicio(String BaseHechos, String Meta) throws IOException{//inferir
        //BaseHechos=nombre del paciente
        NODO_ConjuntoConflicto nodoCC= ExtraerCualquierRegla("Base de Conocimientos");
        //ConjuntoConflicto.insertar_fila(nodoCC.llave,nodoCC.nombre_de_regla,nodoCC.antecedentes,nodoCC.consecuentes);
        //simula el metodo equiparar
        ConjuntoConflicto.insertar_fila(1, "Regla 1", "a,b", "c");
        ConjuntoConflicto.insertar_fila(2, "Regla 2", "c,d", "e");
        ConjuntoConflicto.insertar_fila(3, "Regla 3", "f", "g");
        ConjuntoConflicto.insertar_fila(3, "Regla 4", "e,g", "h");
        
        System.out.println("CC:"+ConjuntoConflicto.mostrar_CC());
        
        while (!Contenida(Meta,BaseHechos) && !Vacio(ConjuntoConflicto)) {
            //System.out.println("no contenida");
            //ConjuntoConflicto=Equiparar("BC",BaseHechos);//nodoCC es conjuntoconflicto
            if (!Vacio(ConjuntoConflicto)) {
                NODO_ConjuntoConflicto R=Resolver(ConjuntoConflicto);//R=regla
                String NuevosHechos= Aplicar(R, BaseHechos);
                Actualizar(BaseHechos, NuevosHechos);
                
                //System.out.println("no vacio");
                //System.out.println("resolvio: "+R.nombre_de_regla+" antecedentes: "+R.antecedentes);
                //System.out.println("nuevos hechos: "+NuevosHechos+" |");
                
            }
        }//fin del while
        if (Contenida(Meta,BaseHechos)) {
            System.out.println("exito");
        }else{
            System.out.println("no encontrada");//quitar
        }
    }

    public NODO_ConjuntoConflicto ExtraerCualquierRegla(String BC) throws IOException{
        NODO_ConjuntoConflicto extraerCualquierRegla = archivo.extraerCualquierRegla();
        return extraerCualquierRegla;
    }
    
    public boolean Contenida(String Meta, String BH) throws IOException{//base de hechos solo es informativo
        return archivo.buscar_en_BASE_DE_HECHOS(Meta,BH);//regresa true si esta la meta contenida en BH
    }
    
    public Manejo_Conjunto_Conflicto Equiparar(String antecedenteBC, String nombre) throws IOException{//me regresa todos las reglas donde esta BH
        Manejo_Conjunto_Conflicto nodoscreado;
        cargar_BC_en_grafo();
        nodoscreado = buscar_hecho_BC_como_antecedente();//RETE
        //resultados_guardar_en_nodos();
        
        return nodoscreado;
    }
    
    public boolean Vacio(Manejo_Conjunto_Conflicto ConjuntoConflicto){
        return this.ConjuntoConflicto.vacio_CC();
    }
    
    public NODO_ConjuntoConflicto Resolver(Manejo_Conjunto_Conflicto CC){//saca una regla de un conjunto conflicto
        NODO_ConjuntoConflicto nodoCC;
        
        nodoCC=CC.obtener_menor_numero();
        //
        CC.sacar_NODO_elegido(nodoCC);
        System.out.println("CC despues de sacar menor: "+CC.mostrar_CC());
        return nodoCC;
    }
    
    public String Aplicar(NODO_ConjuntoConflicto R, String BH) throws IOException{
            String NuevoHecho=R.consecuentes;
            if(archivo.buscar_en_BASE_DE_HECHOS(NuevoHecho, BH)){//SI esta en BH
                NuevoHecho="";
            }
        return NuevoHecho;
    }
    
    public void Actualizar(String nombre, String NuevosHechos) throws IOException{
        archivo.insertarHECHO(NuevosHechos,nombre);
    }
    
    
    
    
    //**************************************************************************
    private void cargar_BC_en_grafo() throws IOException{
        Manejo_Base_Conocimiento grafo_resultado=archivo.cargar_reglas_en_grafo();
        System.out.println(grafo_resultado.mostrar_BC());
        //regresa un grafo
    }
    private Manejo_Conjunto_Conflicto buscar_hecho_BC_como_antecedente(){
        Manejo_Conjunto_Conflicto mi_nodo_CC=new Manejo_Conjunto_Conflicto();
            
        return mi_nodo_CC;
    }
}
