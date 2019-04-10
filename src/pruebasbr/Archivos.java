package pruebasbr;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author luis
 */
public class Archivos {
    RandomAccessFile archivo_maestro = null;
    RandomAccessFile archivo_indice = null;
    RandomAccessFile archivo_base_hechos = null;
    StringBuffer buffer = null;
    
    String nombre_archivo_maestro="archivos/maestro";
    String nombre_archivo_indice="archivos/indice";
    String nombre_archivo_base_hechos="archivos/hechos_";
    String mensajes;
    
    int llave=1;
    
    public void crear_ejemplo_reglas() throws FileNotFoundException, IOException{
        archivo_maestro = new RandomAccessFile(nombre_archivo_maestro, "rw");
        archivo_indice = new RandomAccessFile(nombre_archivo_indice, "rw");
        
        ejemplo_reglas();
        archivo_maestro.close();
        archivo_indice.close();
    }
    
    private void ejemplo_reglas() throws IOException{//SINTOMAS
        archivo_indice.seek(archivo_indice.length());
        archivo_maestro.seek(archivo_maestro.length());
        llave=0;

        //INDICE 1
        archivo_indice.writeInt(llave);
        archivo_indice.writeLong(archivo_maestro.getFilePointer());
        //MAESTRO
        archivo_maestro.writeInt(llave);
            buffer=new StringBuffer("Regla 0");
            buffer.setLength(10);
            archivo_base_hechos.writeChars(buffer.toString());
            buffer=new StringBuffer("a#b#c#d#e");
            buffer.setLength(50);
            archivo_base_hechos.writeChars(buffer.toString());
            buffer=new StringBuffer("f");
            buffer.setLength(8);
            archivo_base_hechos.writeChars(buffer.toString());
            
        llave++;
        
        //INDICE 1
        archivo_indice.writeInt(llave);
        archivo_indice.writeLong(archivo_maestro.getFilePointer());
        //MAESTRO
        archivo_maestro.writeInt(llave);
            buffer=new StringBuffer("Regla 1");
            buffer.setLength(10);
            archivo_base_hechos.writeChars(buffer.toString());
            buffer=new StringBuffer("g#h#i#j");
            buffer.setLength(50);
            archivo_base_hechos.writeChars(buffer.toString());
            buffer=new StringBuffer("k");
            buffer.setLength(8);
            archivo_base_hechos.writeChars(buffer.toString());
            
        llave++;
    }
    
    public void insertar_regla_cero() throws IOException{
        archivo_maestro = new RandomAccessFile(nombre_archivo_maestro, "rw");
        archivo_indice = new RandomAccessFile(nombre_archivo_indice, "rw");
        
        llave=0;
        archivo_indice.seek(0);
        archivo_maestro.seek(0);

        //INDICE 1
        archivo_indice.writeInt(llave);
        archivo_indice.writeLong(archivo_maestro.getFilePointer());
        //MAESTRO
        archivo_maestro.writeInt(llave);
            buffer=new StringBuffer("Regla 0");
            buffer.setLength(10);
            archivo_maestro.writeChars(buffer.toString());
            buffer=new StringBuffer("");
            buffer.setLength(50);
            archivo_maestro.writeChars(buffer.toString());
            buffer=new StringBuffer("");
            buffer.setLength(8);
            archivo_maestro.writeChars(buffer.toString());
            
        archivo_maestro.close();
        archivo_indice.close();
    }
    
    public void insertar_regla(String nombre_R, String antecedentess,String consecuentess) throws IOException{//SINTOMAS
        archivo_maestro = new RandomAccessFile(nombre_archivo_maestro, "rw");
        archivo_indice = new RandomAccessFile(nombre_archivo_indice, "rw");
        
        llave=recupera_ultima_llave()+1;
        archivo_indice.seek(archivo_indice.length());
        archivo_maestro.seek(archivo_maestro.length());

        //INDICE 1
        archivo_indice.writeInt(llave);
        archivo_indice.writeLong(archivo_maestro.getFilePointer());
        //MAESTRO
        archivo_maestro.writeInt(llave);
            buffer=new StringBuffer(nombre_R);
            buffer.setLength(10);
            archivo_maestro.writeChars(buffer.toString());
            String nuevos_antecedentes=ordenarANTECEDENTES(antecedentess);
            buffer=new StringBuffer(nuevos_antecedentes);
            buffer.setLength(50);
            archivo_maestro.writeChars(buffer.toString());
            buffer=new StringBuffer(consecuentess);
            buffer.setLength(8);
            archivo_maestro.writeChars(buffer.toString());
        mensajes="INSERTADO CORRECTAMENTE";
        
        System.out.println("datos a insertar: "+nombre_R+" "+antecedentess+" "+consecuentess);
        archivo_maestro.close();
        archivo_indice.close();
    }
    
    public String ordenarANTECEDENTES(String ANTECEDENTES){//String ANTECEDENTES="d,b,c,c,a";
        String ordenados="";
        String[] vectorANTECEDENTES = ANTECEDENTES.split(",");
        int cuantos=0;
        
        for (String string : vectorANTECEDENTES) {
            cuantos++;
        }
             
        //ORDENAR
        int i, j;
        String temp;

        for (i = 0; i < cuantos-1 ; i++) {
            for (j = i + 1; j < cuantos ; j++) {
                if (vectorANTECEDENTES[i].compareTo(vectorANTECEDENTES[j]) > 0) {
                    temp = vectorANTECEDENTES[i];
                    vectorANTECEDENTES[i] = vectorANTECEDENTES[j];
                    vectorANTECEDENTES[j] = temp;
                }
            }         
        }
        
        for (int k = 0; k < cuantos; k++) {
            ordenados+=vectorANTECEDENTES[k]+",";
        }
        
        ordenados=ordenados.substring(0, ordenados.length()-1);
        
        System.out.println("NUEVA CADENA ORDENADA: "+ordenados);
        return ordenados;
    }
    
    private int recupera_ultima_llave() throws IOException{
        archivo_indice.seek(archivo_indice.length()-12);
        
        return archivo_indice.readInt();
    }
    
    public void modificar_regla(int llav, String nombre_R, String antecedentess,String consecuentess) throws IOException{//SINTOMAS
        archivo_maestro = new RandomAccessFile(nombre_archivo_maestro, "rw");
        archivo_indice = new RandomAccessFile(nombre_archivo_indice, "rw");
        long pos=buscar_pos_de_regla(llav);
        archivo_maestro.seek(pos);

        //MAESTRO
        archivo_maestro.writeInt(llav);
            buffer=new StringBuffer(nombre_R);
            buffer.setLength(10);
            archivo_maestro.writeChars(buffer.toString());
            buffer=new StringBuffer(antecedentess);
            buffer.setLength(50);
            archivo_maestro.writeChars(buffer.toString());
            buffer=new StringBuffer(consecuentess);
            buffer.setLength(8);
            archivo_maestro.writeChars(buffer.toString());
        mensajes="actualizado CORRECTAMENTE";
        
        archivo_maestro.close();
        archivo_indice.close();
    }
    
    public void eliminar_regla(int llav)throws IOException{
        archivo_maestro = new RandomAccessFile(nombre_archivo_maestro, "rw");
        archivo_indice = new RandomAccessFile(nombre_archivo_indice, "rw");
        long pos=buscar_pos_de_regla(llav);
        archivo_maestro.seek(pos);

        //MAESTRO
        archivo_maestro.writeInt(llav);
            buffer=new StringBuffer("");
            buffer.setLength(10);
            archivo_maestro.writeChars(buffer.toString());
            buffer=new StringBuffer("");
            buffer.setLength(50);
            archivo_maestro.writeChars(buffer.toString());
            buffer=new StringBuffer("");
            buffer.setLength(8);
            archivo_maestro.writeChars(buffer.toString());
        mensajes="ELIMANADO CORRECTAMENTE";
        
        archivo_maestro.close();
        archivo_indice.close();
    }
    
     public String consultar_reglas_secuencial() throws IOException{            
        archivo_maestro = new RandomAccessFile(nombre_archivo_maestro, "rw");   
        long ap_actual, ap_final;
        String lectura,cadena="";
        
        while ((ap_actual=archivo_maestro.
                getFilePointer())!=(ap_final=archivo_maestro.length())) {            
            cadena+="llave: "+archivo_maestro.readInt();
                char nom[]=new char[10],temp;
                for (int c = 0; c < nom.length; c++) {
                    temp=archivo_maestro.readChar();
                    cadena+=temp;
                }
                char nomb[]=new char[50],tempo;
                for (int c = 0; c < nomb.length; c++) {
                    tempo=archivo_maestro.readChar();
                    cadena+=tempo;
                }
                char nombr[]=new char[8],tempor;
                for (int c = 0; c < nombr.length; c++) {
                    tempor=archivo_maestro.readChar();
                    cadena+=tempor;
                }
            
            cadena+="\n";
        }//fin de while
        lectura=cadena;
        mensajes="lectura CORRECTA";
        archivo_maestro.close();
        return lectura;
    }
    
    public String[] consultar_regla_indexada(int mi_llave) throws IOException{
        archivo_maestro = new RandomAccessFile(nombre_archivo_maestro, "rw");
        long pos=buscar_pos_de_regla(mi_llave);
        archivo_maestro.seek(pos);
        int i;
        String cadena="";
        String[] lectura=new String[4];
        
            lectura[0]=""+archivo_maestro.readInt();
                char nom[]=new char[10],temp;
                for (int c = 0; c < nom.length; c++) {
                    temp=archivo_maestro.readChar();
                    cadena+=temp;
                }
                lectura[1]=cadena;
                cadena="";
                char nomb[]=new char[50],tempo;
                for (int c = 0; c < nomb.length; c++) {
                    tempo=archivo_maestro.readChar();
                    cadena+=tempo;
                }
                lectura[2]=cadena;
                cadena="";
                char nombr[]=new char[8],tempor;
                for (int c = 0; c < nombr.length; c++) {
                    tempor=archivo_maestro.readChar();
                    cadena+=tempor;
                }
                lectura[3]=cadena;
                //cadena="";
        
        mensajes="lectura CORRECTA";
        archivo_maestro.close();
        return lectura;
    }
    
    public long buscar_pos_de_regla(int mi_llave) throws IOException{
        long pos=0;
        archivo_indice =new RandomAccessFile(nombre_archivo_indice, "rw");
        int llave_actual=-1;
        
        do{            
            llave_actual=archivo_indice.readInt();
            pos=archivo_indice.readLong();
            if(llave_actual!=mi_llave)
                llave_actual=-1;
            
        }while (llave_actual==-1);
        
        archivo_indice.close();
        return pos;
    }
    
    
    //*******************************************************************************
    public NODO_ConjuntoConflicto extraerCualquierRegla() throws IOException{
        archivo_maestro = new RandomAccessFile(nombre_archivo_maestro, "rw");
        archivo_indice = new RandomAccessFile(nombre_archivo_indice, "rw");
        int llav;
        String nombre_regl = "", antecedent = "",consecuent = "";
        
        archivo_maestro.seek(140);//ir a la llave que quiera
        llav=archivo_maestro.readInt();
        char nom[]=new char[10],temp;
        for (int c = 0; c < nom.length; c++) {
            temp=archivo_maestro.readChar();
            nombre_regl+=temp;
        }
        char nomb[]=new char[50],tempo;
        for (int c = 0; c < nomb.length; c++) {
            tempo=archivo_maestro.readChar();
            antecedent+=tempo;
        }
        char nombr[]=new char[8],tempor;
        for (int c = 0; c < nombr.length; c++) {
            tempor=archivo_maestro.readChar();
            consecuent+=tempor;
        }
        
        archivo_maestro.close();
        archivo_indice.close();
        return new NODO_ConjuntoConflicto(llav, nombre_regl, antecedent, consecuent);
    }
    
    
    ///****************************************************************
    
    public void insertarHECHO(String hecho, String nombre) throws FileNotFoundException, IOException{
        archivo_base_hechos = new RandomAccessFile(nombre_archivo_base_hechos+nombre, "rw");
        archivo_base_hechos.seek(archivo_base_hechos.length());
            buffer=new StringBuffer(hecho);
            buffer.setLength(8);
            archivo_base_hechos.writeChars(buffer.toString());
            //reordenaHECHOS_ALFABETICAMENTE(nombre);
            System.out.println("REGISTRO INSERTADO CORRECTAMENTE BH");
        archivo_base_hechos.close();
    }
    
    public void borrarHECHO(String hecho, String nombre) throws IOException{
        archivo_base_hechos = new RandomAccessFile(nombre_archivo_base_hechos+nombre, "rw");
        String cadena="";
        
        char nombr[]=new char[8],temp;
        for (int c = 0; c < nombr.length; c++) {
            temp=archivo_base_hechos.readChar();
            cadena+=temp;
        }
        if(cadena.equals(hecho)){
            System.out.println("encontrada listo paara borrar BH:");
            archivo_base_hechos.seek(archivo_base_hechos.getFilePointer()-16);//bytes de los 8 caracteres
            
            //reordenaHECHOS(hecho);
        }
        archivo_base_hechos.close();
    }
    
    public void burbuja(String nombre) throws FileNotFoundException, IOException{
        if(esta_ordenado(nombre)){
            mensajes="YA ESTA ORDENADO";
        }else{
            System.out.println("no esta or");
            //reordenaHECHOS_ALFABETICAMENTE(nombre);
        }
            //
        
       
    }
    
    public void reordenaHECHOS_ALFABETICAMENTE(String nombre) throws IOException{
        archivo_base_hechos = new RandomAccessFile(nombre_archivo_base_hechos+nombre, "rw");
        char nomb[],temp;
        long puntero=0;
        String cadena="",pivote,pivote2;
        
        
        while(!esta_ordenado(nombre)){
            archivo_base_hechos = new RandomAccessFile(nombre_archivo_base_hechos+nombre, "rw");
            archivo_base_hechos.seek(puntero);
            
            nomb=new char[8];
            for (int c = 0; c < nomb.length; c++) {
                temp=archivo_base_hechos.readChar();
                cadena+=temp;
            }
            pivote=cadena.trim();
            cadena="";
            
            for (int c = 0; c < nomb.length; c++) {
                temp=archivo_base_hechos.readChar();
                cadena+=temp;
            }
            pivote2=cadena.trim();
            cadena="";

            if(pivote2.compareTo(pivote) < 0){
                archivo_base_hechos.seek(archivo_base_hechos.getFilePointer()-32);

                buffer=new StringBuffer(pivote2);
                buffer.setLength(8);
                archivo_base_hechos.writeChars(buffer.toString());
                buffer=new StringBuffer(pivote);
                buffer.setLength(8);
                archivo_base_hechos.writeChars(buffer.toString());
                
                archivo_base_hechos.seek(archivo_base_hechos.getFilePointer()-16);
                System.out.println (pivote2+" va antes que pivote "+pivote);
                System.out.println("cambia "+pivote2+" por "+pivote);
            }else{
                archivo_base_hechos.seek(archivo_base_hechos.getFilePointer()-16);
            }
            puntero=archivo_base_hechos.getFilePointer();
        }//fin de while
        
        archivo_base_hechos.close();
    }
    
    private boolean esta_ordenado(String nombre) throws IOException{
        archivo_base_hechos = new RandomAccessFile(nombre_archivo_base_hechos+nombre, "rw");
        long ap_actual, ap_final;
        String cadena="",abc1,abc2;
        boolean ordenado=true;
        
        while ((ap_actual=archivo_base_hechos.getFilePointer())!=(ap_final=archivo_base_hechos.length()-16) && ordenado) {
            char nombr[]=new char[8],temp;
            for (int c = 0; c < nombr.length; c++) {
                temp=archivo_base_hechos.readChar();
                cadena+=temp;
            }
            abc1=cadena.trim();cadena="";
            
            char nomb[]=new char[8],tem;
            for (int c = 0; c < nomb.length; c++) {
                tem=archivo_base_hechos.readChar();
                cadena+=tem;
            }
            abc2=cadena.trim();cadena="";
            
            if (abc1.compareTo(abc2) < 0) {
                ordenado=true;
                System.out.println("ordenada");
            }else{
                ordenado=false;
                System.out.println("desordenado");
            }
            archivo_base_hechos.seek(archivo_base_hechos.getFilePointer()-16);
        }//fin while
        
        archivo_base_hechos.close();
        return ordenado;
    }
    
    public String mostrarHECHOS(String nombre) throws IOException{
        archivo_base_hechos = new RandomAccessFile(nombre_archivo_base_hechos+nombre, "rw");
        String cadena="",lectura="";
        long ap_actual, ap_final;
        
        while ((ap_actual=archivo_base_hechos.getFilePointer())!=(ap_final=archivo_base_hechos.length())) {
            char nombr[]=new char[8],temp;
            for (int c = 0; c < nombr.length; c++) {
                temp=archivo_base_hechos.readChar();
                cadena+=temp;
            }
            lectura+=cadena+"\n";
            cadena="";
        }//fin while

        archivo_base_hechos.close();
        return lectura;
    }
    
    public boolean buscar_en_BASE_DE_HECHOS(String dato_a_buscar, String nombre) throws IOException{
        archivo_base_hechos = new RandomAccessFile(nombre_archivo_base_hechos+nombre, "rw");
        String hecho_actual="",separado="";
        int n=-1;
        
        boolean encontrada=false;
        
        while (n==-1) {
            char nombr[]=new char[8],temp;
            for (int c = 0; c < nombr.length; c++) {
                temp=archivo_base_hechos.readChar();
                hecho_actual+=temp;
            }
            
            //System.out.println("hecho leuido: "+hecho_actual+" buscado: "+dato_a_buscar);
            
            separado=hecho_actual.trim();
            //System.out.println(separado);
            if (separado.equals(dato_a_buscar)) {
                mensajes="ENCONTRADA";
                //System.out.println("encontrada");
                encontrada=true;
                n=0;
                archivo_base_hechos.seek(archivo_base_hechos.length());
            }else{
                n=-1;
                hecho_actual="";
                //System.out.println("haciendo: ");
                mensajes="no en";
            }
            if(archivo_base_hechos.getFilePointer()==archivo_base_hechos.length()){
                n=0;
                //System.out.println("fin");
            }
                
        }//fin while
        
        archivo_maestro.close();
        return encontrada;
    }
    
    private String quitar_espacios(String cadena){
        return cadena.replace(" ", "");
    }
    
    public Manejo_Base_Conocimiento cargar_reglas_en_grafo() throws IOException{
        Manejo_Base_Conocimiento grafo = null;
        archivo_maestro = new RandomAccessFile(nombre_archivo_maestro, "rw");
        long ap_actual, ap_final;
        int LLAVE;
        String NOMBRE="";
        String ANTECEDENTE="";
        String CONSECUENTE="";
        
        while ((ap_actual=archivo_maestro.getFilePointer())!=(ap_final=archivo_maestro.length())) {            
            LLAVE=archivo_maestro.readInt();
                char nom[]=new char[10],temp;
                for (int c = 0; c < nom.length; c++) {
                    temp=archivo_maestro.readChar();
                    NOMBRE+=temp;
                }
                char nomb[]=new char[50],tempo;
                for (int c = 0; c < nomb.length; c++) {
                    tempo=archivo_maestro.readChar();
                    ANTECEDENTE+=tempo;
                }
                char nombr[]=new char[8],tempor;
                for (int c = 0; c < nombr.length; c++) {
                    tempor=archivo_maestro.readChar();
                    CONSECUENTE+=tempor;
                }
            grafo.insertar_BC(LLAVE, NOMBRE, ANTECEDENTE, CONSECUENTE);
        }//fin de while
        mensajes="GRAFO CARGADO CORRECTAMENTE";
        System.out.println(grafo.mostrar_BC());
        archivo_maestro.close();
        return grafo;
    }
}
