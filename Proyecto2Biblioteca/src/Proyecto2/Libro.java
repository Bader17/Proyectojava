/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jeyfer
 */
public class Libro extends Documento {
    
	
	String libros[]=new String [tamanyo];
        
	
	int tope=libros.length-1;
        
        
        

                    public void Insertar(){
            {
               try
		{
		 File f = new File("Libros.txt");
		 FileOutputStream mf = new FileOutputStream(f);
		 salida= new ObjectOutputStream(mf) ;
		}
		catch(Exception ex)
		{
			System.err.println( "Error al abrir el archivo de Salida" );
		}
        

		Biblioteca ArchivoRevistas = null;
		if(cima==tope){
			JOptionPane.showMessageDialog(null,"No se realizo ninguna accion");
			JOptionPane.showMessageDialog(null,"Saca un libro para poder introducir un nuevo libro");
		}
		else {
                try {
                    cima++;
                    libros[cima]=JOptionPane.showInputDialog(null,"Teclea el nombre del libro:");
                  JOptionPane.showInputDialog(null,"Ingrese el nombre de la casa de Edicion:");
                  JOptionPane.showInputDialog(null,"Ingrese el mes y año de Edicion:");
                  
                    JOptionPane.showMessageDialog(null,"Se inserto el libro ( "+libros[cima]+" )");
                    
                    salida.writeObject(ArchivoRevistas);
                } catch (IOException ex) {
                    Logger.getLogger(Libro.class.getName()).log(Level.SEVERE, null, ex);
                }
                try
	{
		if (salida != null)
		{
			salida.close();
		}
	}
	catch(Exception ex)
	{
		System.err.println( "Error al cerrar el archivo de salida." );
	}
	}		
}
                 
        }
	
       
        
        
        
	public void Sacar(){
		if(cima==-1){
			JOptionPane.showMessageDialog(null,"No se realizo ninguna accion");
			JOptionPane.showMessageDialog(null,"Introduce un nuevo libro para poder sacar un libro");
		}
		else{
			JOptionPane.showMessageDialog(null,"Se saco el libro ( "+libros[cima]+" )");
			cima--;
		}
	}
	public void Mostrar(){
		if(cima==-1){
			JOptionPane.showMessageDialog(null,"No hay libros que mostrar");
		}
		else{
			String mostrar="";
			int i;
			for(i=0;i<=cima;i++){
				mostrar=mostrar+"( "+libros[i]+" )\n";
			}
			JOptionPane.showMessageDialog(null,"Los libros almacenados son:\n"+mostrar);
		}
                
	}
	public void Buscar(){
		int veces=0;
		String encontrado="";
		String buscar=JOptionPane.showInputDialog(null,"Que libro quieres buscar?:");
		for(int i=0;i<=cima;i++){
			if(buscar.equalsIgnoreCase(libros[i])){
			encontrado=encontrado+libros[i];
			veces=veces+1;
			}
		}
		if(veces==0){
			JOptionPane.showMessageDialog(null,"No se encontraron libros con el nombre ( "+buscar+" )");
		}
		else{
			JOptionPane.showMessageDialog(null,"Se encontraron "+veces+" libro(s) con el nombre ( "+buscar+" )");
		}
                
	}


}
