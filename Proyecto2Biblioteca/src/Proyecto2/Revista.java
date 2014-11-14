/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jeyfer
 */
public class Revista extends Documento {
	
	String revistas[]=new String [tamanyo];
	
	int tope=revistas.length-1;
	public void Insertar(){
            {
               try
		{
		 File f = new File("Revista.txt");
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
			JOptionPane.showMessageDialog(null,"Saca una revista para poder introducir una nueva revista");
		}
		else {
                try {
                    cima++;
                    revistas[cima]=JOptionPane.showInputDialog(null,"Teclea el nombre de la revista:");
                  JOptionPane.showInputDialog(null,"Ingrese el nombre de la casa de Edicion:");
                  JOptionPane.showInputDialog(null,"Ingrese el mes y año de Edicion:");
                  
                    JOptionPane.showMessageDialog(null,"Se inserto la revista ( "+revistas[cima]+" )");
                    
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
		if(cima==tope){
                    
			JOptionPane.showMessageDialog(null,"No se realizo ninguna accion");
			JOptionPane.showMessageDialog(null,"Saca una revista para poder introducir una nueva revista");
		}
		else {
			cima++;
			revistas[cima]=JOptionPane.showInputDialog(null,"Teclea el nombre de la revista:");
			JOptionPane.showMessageDialog(null,"Se inserto la revista ( "+revistas[cima]+" )");
		}
	}
	public void Sacar(){
		if(cima==-1){
			JOptionPane.showMessageDialog(null,"No se realizo ninguna accion");
			JOptionPane.showMessageDialog(null,"Introduce una nueva revista para poder sacar una revista");
		}
		else{
			JOptionPane.showMessageDialog(null,"Se saco la revista ( "+revistas[cima]+" )");
			cima--;
		}
	}
	public void Mostrar(){
		if(cima==-1){
			JOptionPane.showMessageDialog(null,"No hay revistas que mostrar");
		}
		else{
			String mostrar="";
			int i=0;
			for(i=0;i<=cima;i++){
				mostrar=mostrar+"( "+revistas[i]+" )\n";
			}
			JOptionPane.showMessageDialog(null,"Las revistas almacenadas son:\n"+mostrar);
		}
	}
	public void Buscar(){
		int veces=0;
		String encontrado="";
		String buscar=JOptionPane.showInputDialog(null,"Que revista quieres buscar?:");
		for(int i=0;i<=cima;i++){
			if(buscar.equalsIgnoreCase(revistas[i])){
			encontrado=encontrado+revistas[i];
			veces=veces+1;
			}
		}
		if(veces==0){
			JOptionPane.showMessageDialog(null,"No se encontraron revistas con el nombre ( "+buscar+" )");
		}
		else{
			JOptionPane.showMessageDialog(null,"Se encontraron "+veces+" revista(s) con el nombre ( "+buscar+" )");
		}
	}
}
    
