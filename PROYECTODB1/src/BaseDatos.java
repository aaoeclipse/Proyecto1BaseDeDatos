//Universidad del valle de guatemala
//Proyecto de Bases de Datos No. 1
//Integrantes:
//--Luisa Arboleda
//--Andres Oliva
//--Santiago Paiz


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



 
public class BaseDatos {
    
    //Campos de la clase
    private String nombre; 
    private List <Tabla> tablas; 

    //Constructor
    public BaseDatos(String nombre) {
        this.nombre = nombre;
        tablas=new ArrayList() ;
    }

    public BaseDatos() {
    	
    }
    
    //Gets y Sets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tabla> getTablas() {
         return tablas;
    }

    public void setTabla(Tabla ta) {
        tablas.add(ta);
    }

    public void setTablas(List<Tabla> tablas) {
        this.tablas = tablas;
    }
    
}
