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
class PublicacionesInternas extends Documento {
  
	String publicaciones[]=new String [tamanyo];
	
	int tope=publicaciones.length-1;
	public void Insertar(){
            {
               try
		{
		 File f = new File("Publicaciones.txt");
		 FileOutputStream mf = new FileOutputStream(f);
		 salida= new ObjectOutputStream(mf) ;
		}
		catch(Exception ex)
		{
			System.err.println( "Error al abrir el archivo de Salida" );
		}
        

		Biblioteca ArchivoPublicaciones = null;
		if(cima==tope){
			JOptionPane.showMessageDialog(null,"No se realizo ninguna accion");
			JOptionPane.showMessageDialog(null,"Saca una Publicacion para poder introducir una nueva Publicacion");
		}
		else {
                try {
                    cima++;
                    publicaciones[cima]=JOptionPane.showInputDialog(null,"Teclea el nombre de la Publicacion:");
                  JOptionPane.showInputDialog(null,"Ingrese la referencia:");
                    JOptionPane.showMessageDialog(null,"Se inserto la Publicacion ( "+publicaciones[cima]+" )");
                    salida.writeObject(ArchivoPublicaciones);
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
			JOptionPane.showMessageDialog(null,"Saque una publicacion para poder introducir una nueva");
		}
		else {
			cima++;
			publicaciones[cima]=JOptionPane.showInputDialog(null,"Teclea el nombre de la publicacion:");
			JOptionPane.showMessageDialog(null,"Se inserto la publicacion ( "+publicaciones[cima]+" )");
		}
	}
	public void Sacar(){
		if(cima==-1){
			JOptionPane.showMessageDialog(null,"No se realizo ninguna accion");
			JOptionPane.showMessageDialog(null,"Introduce una nueva publicacion para poder sacar una publicacion");
		}
		else{
			JOptionPane.showMessageDialog(null,"Se saco la publicacion ( "+publicaciones[cima]+" )");
			cima--;
		}
	}
	public void Mostrar(){
		if(cima==-1){
			JOptionPane.showMessageDialog(null,"No hay publicaciones que mostrar");
		}
		else{
			String mostrar="";
			int i;
			for(i=0;i<=cima;i++){
				mostrar=mostrar+"( "+publicaciones[i]+" )\n";
			}
			JOptionPane.showMessageDialog(null,"las publicaciones almacenadass son:\n"+mostrar);
		}
	}
	public void Buscar(){
		int veces=0;
		String encontrado="";
		String buscar=JOptionPane.showInputDialog(null,"Que publicacion quieres buscar?:");
		for(int i=0;i<=cima;i++){
			if(buscar.equalsIgnoreCase(publicaciones[i])){
			encontrado=encontrado+publicaciones[i];
			veces=veces+1;
			}
		}
		if(veces==0){
			JOptionPane.showMessageDialog(null,"No se encontraron las publicaciones con el nombre ( "+buscar+" )");
		}
		else{
			JOptionPane.showMessageDialog(null,"Se encontraron "+veces+" publicaciones(s) con el nombre ( "+buscar+" )");
		}
	}
    
}
