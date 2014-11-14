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
class Usuarios extends Documento {
   

    int tamanyo=5;
	String usuarios[]=new String [tamanyo];
	int cima=-1;
	int tope=usuarios.length-1;
 
	public void Insertar(){
	
              {
               try
		{
		 File f = new File("Usuarios.txt");
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
			JOptionPane.showMessageDialog(null,"Saca un Usuario para poder introducir un0 nuevo ");
		}
		else {
                try {
                    cima++;
                    usuarios[cima]=JOptionPane.showInputDialog(null,"Teclea el nombre del Usuario:"+"En la posicion["+cima+"]");
                    JOptionPane.showMessageDialog(null,"Se inserto el Usuario ( "+usuarios[cima]+" )");
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
        }
	public void Sacar(){
		if(cima==-1){
			JOptionPane.showMessageDialog(null,"No se realizo ninguna accion");
			JOptionPane.showMessageDialog(null,"Introduce un nuevo Usuario para poder sacar un Usuario");
		}
		else{
			JOptionPane.showMessageDialog(null,"Se saco el Usuario ( "+usuarios[cima]+" )");
			cima--;
		}
	}
	public void Mostrar(){
		if(cima==-1){
			JOptionPane.showMessageDialog(null,"No hay Usuarios que mostrar");
		}
		else{
			String mostrar="";
			int i=0;
			for(i=0;i<=cima;i++){
				mostrar=mostrar+"( "+usuarios[i]+" )\n";
			}
			JOptionPane.showMessageDialog(null,"Los Usuarios almacenados son:\n"+mostrar);
		}
	}
	public void Buscar(){
		int veces=0;
		String encontrado="";
		String buscar=JOptionPane.showInputDialog(null,"Que Usuarios quieres buscar?:");
		for(int i=0;i<=cima;i++){
			if(buscar.equalsIgnoreCase(usuarios[i])){
			encontrado=encontrado+usuarios[i];
			veces=veces+1;
			}
		}
		if(veces==0){
			JOptionPane.showMessageDialog(null,"No se encontraron Usuarios con el nombre ( "+buscar+" )");
		}
		else{
                    for(int i=0;i<=cima;){
			if(buscar.equalsIgnoreCase(usuarios[i])){
                            encontrado=encontrado+usuarios[i];
			JOptionPane.showMessageDialog(null,"Se encontraron "+"["+veces+"]"+"En la posicion"+cima+" Usuarios(s) con el nombre ( "+buscar+" )");
		i++;
                        }
	}
}
        }
}