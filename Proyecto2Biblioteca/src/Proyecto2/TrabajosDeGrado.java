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
class TrabajosDeGrado extends Documento {
    
    	
	String trabajos[]=new String [tamanyo];
	
	int tope=trabajos.length-1;
	public void Insertar(){	

              {
               try
		{
		 File f = new File("Trabajos.txt");
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
			JOptionPane.showMessageDialog(null,"Saca un Trabajo para poder introducir uno nuevo ");
		}
		else {
                try {
                    cima++;
                    trabajos[cima]=JOptionPane.showInputDialog(null,"Teclea el nombre del Trabajo:(D.Diplomado/B.Bachiller/L.Licenciatura");
                    JOptionPane.showInputDialog(null,"Ingrese el Nombre de la universidad");
                    JOptionPane.showMessageDialog(null,"Se inserto el Trabajo ( "+trabajos[cima]+" )");
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
			trabajos[cima]=JOptionPane.showInputDialog(null,"Teclea el nombre de la publicacion:");
			JOptionPane.showMessageDialog(null,"Se inserto la publicacion ( "+trabajos[cima]+" )");
		}
	}
	public void Sacar(){
		if(cima==-1){
			JOptionPane.showMessageDialog(null,"No se realizo ninguna accion");
			JOptionPane.showMessageDialog(null,"Introduce un nuevo Trabajo para poder sacar un Trabajo");
		}
		else{
			JOptionPane.showMessageDialog(null,"Se saco el Trabajo ( "+trabajos[cima]+" )");
			cima--;
		}
	}
	public void Mostrar(){
		if(cima==-1){
			JOptionPane.showMessageDialog(null,"No hay Trabajos que mostrar");
		}
		else{
			String mostrar="";
			int i=0;
			for(i=0;i<=cima;i++){
				mostrar=mostrar+"( "+trabajos[i]+" )\n";
			}
			JOptionPane.showMessageDialog(null,"Los Trabajos almacenados son:\n"+mostrar);
		}
	}
	public void Buscar(){
		int veces=0;
		String encontrado="";
		String buscar=JOptionPane.showInputDialog(null,"Que Trabajos quieres buscar?:");
		for(int i=0;i<=cima;i++){
			if(buscar.equalsIgnoreCase(trabajos[i])){
			encontrado=encontrado+trabajos[i];
			veces=veces+1;
			}
		}
		if(veces==0){
			JOptionPane.showMessageDialog(null,"No se encontraron Trabajo con el nombre ( "+buscar+" )");
		}
		else{
			JOptionPane.showMessageDialog(null,"Se encontraron "+veces+" Trabajo(s) con el nombre ( "+buscar+" )");
		}
	}
    
}

    
