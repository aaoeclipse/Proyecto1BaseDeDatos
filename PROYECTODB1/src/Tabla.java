//Universidad del valle de guatemala
//Proyecto de Bases de Datos No. 1
//Integrantes:
//--Luisa Arboleda
//--Andres Oliva
//--Santiago Paiz


import java.util.ArrayList;
import java.util.Map;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Esta clase se encarga de las tablas utilizadas en una base de datos
*/
 
public class Tabla {
    
    //Campos de la clase
    private String nombre; 
    private ArrayList <Columna> columnas; 
    private ArrayList <PrimaryKey> primaryk; 
    private ArrayList <ForeignKey> foreignk; 
    private ArrayList <Check> check; 
    
    //Constructor
    public Tabla(String nombre) {
        this.nombre = nombre;
        columnas= new ArrayList();
        primaryk= new ArrayList();
        foreignk= new ArrayList();
        check= new ArrayList();
    }

    public Tabla() {
    }

    //Metodos de manejo de atributos de una tabla
    public void agregarPK(PrimaryKey p){
        primaryk.add(p);
    }
    public void agregarFK(ForeignKey f){
        foreignk.add(f);
    }
     public void agregarCheck(Check c) {
         check.add(c);
    }
     public void agregarColumna(Columna c) {
        columnas.add(c);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Columna> getColumnas() {
        return columnas;
    }

    public void setColumnas(ArrayList<Columna> columnas) {
        this.columnas = columnas;
    }

    public ArrayList<PrimaryKey> getPrimaryk() {
        return primaryk;
    }

    public void setPrimaryk(ArrayList<PrimaryKey> primaryk) {
        this.primaryk = primaryk;
    }

    public ArrayList<ForeignKey> getForeignk() {
        return foreignk;
    }

    public void setForeignk(ArrayList<ForeignKey> foreignk) {
        this.foreignk = foreignk;
    }

    public ArrayList<Check> getCheck() {
        return check;
    }

    public void setCheck(ArrayList<Check> check) {
        this.check = check;
    }
    
}
