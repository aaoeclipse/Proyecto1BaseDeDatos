///Universidad del valle de guatemala
//Proyecto de Bases de Datos No. 1
//Integrantes:
//--Luisa Arboleda
//--Andres Oliva
//--Santiago Paiz



import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;


/*
 * Esta clase principal se encarga de redireccionar a la interfaz
 */

public class Main {

    /**
     * @param args the command line arguments
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        
        //Enlace a la interfaz
        Consola ventana=new Consola();
        ventana.setVisible(true);  
        ventana.setResizable(false);
        ventana.setBounds(100, 100, 1700, 1000);
       
     
        
}
}
