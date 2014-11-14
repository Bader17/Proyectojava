/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class Biblioteca  implements Serializable, Comparable{
public static Libro accion=new Libro();
  public static Revista accion1=new Revista(); 
    public static PublicacionesInternas accion2=new PublicacionesInternas(); 
    public static TrabajosDeGrado accion3=new TrabajosDeGrado(); 
    public static Usuarios accion4=new Usuarios();
  
    
    public static void main(String[] args) {
         int respuesta = 0;
         while(respuesta<=2){
			respuesta=Integer.parseInt(JOptionPane.showInputDialog(null,
			"--------------------------------------------------------\n"  +
			"TIPO DE USUARIO	                           \n"	+
			"--------------------------------------------------------\n"  +
			"1. Usuario De Actualizacion                \n"  +
			"2. Salir                              \n"  +
			"--------------------------------------------------------\n"  +
			"Teclea el numero de la accion a relizar:"
			));
			switch(respuesta){
                            
                                                       
                            case 1:
                int resp=0;
                
                while((resp>=0)&&(resp<7)){
			resp=Integer.parseInt(JOptionPane.showInputDialog(null,
			"--------------------------------------------------------\n"  +
			"USUARIO DE ACTUALIZACION	                           \n"	+
			"--------------------------------------------------------\n"  +
			"1. Mantenimiento Libros                \n"  +
			"2. Mantenimiento Revistas                     \n"  +
			"3. Mantenimiento Publicaciones Internas                 \n"  +
			"4. Mantenimiento Trabajos De Grado                    \n"  +
                        "5. Mantenimiento De Usuarios                              \n"  +        
			"6. Salir                              \n"  +
			"--------------------------------------------------------\n"  +
			"Teclea el numero de la accion a relizar:"
			));
			switch(resp){
                            
                            case 1:
                            
		int opc = 0;
		while((opc>=0)&&(opc<5)){
			opc=Integer.parseInt(JOptionPane.showInputDialog(null,
			"--------------------------------------------------------\n"  +
			"LIBROS	                           \n"	+
			"--------------------------------------------------------\n"  +
			"1. Introducir un libro                \n"  +
			"2. Sacar un libro                     \n"  +
			"3. Mostrar los libros                 \n"  +
			"4. Buscar un libro                    \n"  +
			"5. Salir                              \n"  +
			"--------------------------------------------------------\n"  +
			"Teclea el numero de la accion a relizar:"
			));
			switch(opc){
			case 1: getAccion().Insertar();
			break;
			case 2: getAccion().Sacar();
			break;
			case 3: getAccion().Mostrar();
		    break;
		    case 4: getAccion().Buscar();
		    break;
		    case 5: 
                        opc=5;
		break;
			default: JOptionPane.showMessageDialog(null,"No se realizo ninguna accion\nOpcion no valida");
			break;
                        }
                }
                                    
              break;                        
                            case 2:
                  
                                
		int opc1=0;
				while((opc1>=0)&&(opc1<5)){

			opc1=Integer.parseInt(JOptionPane.showInputDialog(null,
			"--------------------------------------------------------\n"  +
			"REVISTAS	                           \n"	+
			"--------------------------------------------------------\n"  +
			"1. Introducir una Revista                \n"  +
			"2. Sacar una Revista                     \n"  +
			"3. Mostrar las Revistas                 \n"  +
			"4. Buscar una Revista                    \n"  +
			"5. Salir                              \n"  +
			"--------------------------------------------------------\n"  +
			"Teclea el numero de la accion a relizar:"
			));
			switch(opc1){
			case 1: getAccion1().Insertar();
			break;
			case 2: getAccion1().Sacar();
			break;
			case 3: getAccion1().Mostrar();
		    break;
		    case 4: getAccion1().Buscar();
		    break;
		    case 5: opc1=5;
		    break;
			default: JOptionPane.showMessageDialog(null,"No se realizo ninguna accion\nOpcion no valida");
			break;
			}
                }
                break;
                            case 3:
                                int opc2=0;
				while((opc2>=0)&&(opc2<5)){

			opc2=Integer.parseInt(JOptionPane.showInputDialog(null,
			"--------------------------------------------------------\n"  +
			"PUBLICACION INTERNA	                           \n"	+
			"--------------------------------------------------------\n"  +
			"1. Introducir una Publicacion Interna                \n"  +
			"2. Sacar una Publicacion                     \n"  +
			"3. Mostrar las Publicaciones                 \n"  +
			"4. Buscar una Publicacion                    \n"  +
			"5. Salir                              \n"  +
			"--------------------------------------------------------\n"  +
			"Teclea el numero de la accion a relizar:"
			));
			switch(opc2){
			case 1: getAccion2().Insertar();
			break;
			case 2: getAccion2().Sacar();
			break;
			case 3: getAccion2().Mostrar();
		    break;
		    case 4: getAccion2().Buscar();
		    break;
		    case 5: opc2=5;
		    break;
			default: JOptionPane.showMessageDialog(null,"No se realizo ninguna accion\nOpcion no valida");
			break;
			}

                }                
                  break;
                            case 4:
                                               int opc3=0;
		while((opc3>=0)&&(opc3<5)){
			opc3=Integer.parseInt(JOptionPane.showInputDialog(null,
			"--------------------------------------------------------\n"  +
			"TRABAJOS DE GRADO	                           \n"	+
			"--------------------------------------------------------\n"  +
			"1. Introducir un documento                \n"  +
			"2. Sacar un documento                     \n"  +
			"3. Mostrar los Documentos                 \n"  +
			"4. Buscar un Documento                    \n"  +
			"5. Salir                              \n"  +
			"--------------------------------------------------------\n"  +
			"Teclea el numero de la accion a relizar:"
			));
			switch(opc3){
			case 1: getAccion3().Insertar();
			break;
			case 2: getAccion3().Sacar();
			break;
			case 3: getAccion3().Mostrar();
		    break;
		    case 4: getAccion3().Buscar();
		    break;
		    case 5: opc3=5;
		    break;
			default: JOptionPane.showMessageDialog(null,"No se realizo ninguna accion\nOpcion no valida");
			break;
			}

                }
                                break;
                            case 5:
                            int opc4=0;
		while((opc4>=0)&&(opc4<5)){
			opc4=Integer.parseInt(JOptionPane.showInputDialog(null,
			"--------------------------------------------------------\n"  +
			"USUARIOS	                           \n"	+
			"--------------------------------------------------------\n"  +
			"1. Introducir un Usuario                \n"  +
			"2. Sacar un Usuario                     \n"  +
			"3. Mostrar los Usuario                 \n"  +
			"4. Buscar un Usuario                    \n"  +
			"5. Salir                              \n"  +
			"--------------------------------------------------------\n"  +
			"Teclea el numero de la accion a relizar:"
			));
			switch(opc4){
			case 1: getAccion4().Insertar();
			break;
			case 2: getAccion4().Sacar();
			break;
			case 3: getAccion4().Mostrar();
		    break;
		    case 4: getAccion4().Buscar();
		    break;
		    case 5:opc4=5;
                        
		   break;
			default: JOptionPane.showMessageDialog(null,"No se realizo ninguna accion\nOpcion no valida");
			break;
			}
 
                } 
                        break;    
                  case 6: resp=7; 
                      break;
			default: JOptionPane.showMessageDialog(null,"No se realizo ninguna accion\nOpcion no valida");
			break;
    }
                       
                    
                        
                }
                             
                         
                 
                     
                 
            {
                     

    int opc5=0;
   while((opc5>=0)&&(opc5<5)){
           opc5=Integer.parseInt(JOptionPane.showInputDialog(null,
           "--------------------------------------------------------\n"  +
           "USUARIOS	                           \n"	+
           "--------------------------------------------------------\n"  +
           "1. Libros                \n"  +
           "2. Revistas                     \n"  +
           "3. Publicaciones Internas                 \n"  +
           "4. Trabajos De Grado                    \n"  +
           "5. Salir                              \n"  +
           "--------------------------------------------------------\n"  +
           "Teclea el numero de la accion a relizar:"
           ));
           switch(opc5){
               
               case 1:
                   getAccion().Buscar();
                                           String res=JOptionPane.showInputDialog(null,"Desea Mostrar todos los libros"); 
if(res.equalsIgnoreCase("si")){ 
                     getAccion().Mostrar();
}
                   break;
               case 2:
                   getAccion1().Buscar();
                                                              String res1=JOptionPane.showInputDialog(null,"Desea Mostrar todos las Revistas"); 
if(res1.equalsIgnoreCase("si")){ 
                getAccion1().Mostrar();
}
                            
                    break;
                             case 3:
                                 getAccion2().Buscar();
                                                                                             String res2=JOptionPane.showInputDialog(null,"Desea Mostrar todos las Publicaciones"); 
if(res2.equalsIgnoreCase("si")){ 
                             getAccion2().Mostrar();
}
                                  break;
                              case 4:
                                  
                                  getAccion3().Buscar();
                                                                                              String res3=JOptionPane.showInputDialog(null,"Desea Mostrar todos los Trabajos"); 
if(res3.equalsIgnoreCase("si")){ 
                              getAccion3().Mostrar(); 
}
                                   break;
                               case 5:
                              opc5=6;
                                   break;
                                   default: JOptionPane.showMessageDialog(null,"No se realizo ninguna accion\nOpcion no valida");
           break;
                                  
           }
   }
            }
             
                                break;    
                                
                                 case 2: 
                       System.exit(0);
		break;
			default: JOptionPane.showMessageDialog(null,"No se realizo ninguna accion\nOpcion no valida");
			break;
}
}
                        }

    /**
     * @return the accion4
     */
    public static Usuarios getAccion4() {
        return accion4;
    }

    /**
     * @param aAccion4 the accion4 to set
     */
    public static void setAccion4(Usuarios aAccion4) {
        accion4 = aAccion4;
    }

    /**
     * @return the accion3
     */
    public static TrabajosDeGrado getAccion3() {
        return accion3;
    }

    /**
     * @param aAccion3 the accion3 to set
     */
    public static void setAccion3(TrabajosDeGrado aAccion3) {
        accion3 = aAccion3;
    }

    /**
     * @return the accion2
     */
    public static PublicacionesInternas getAccion2() {
        return accion2;
    }

    /**
     * @param aAccion2 the accion2 to set
     */
    public static void setAccion2(PublicacionesInternas aAccion2) {
        accion2 = aAccion2;
    }

    /**
     * @return the accion1
     */
    public static Revista getAccion1() {
        return accion1;
    }

    /**
     * @param aAccion1 the accion1 to set
     */
    public static void setAccion1(Revista aAccion1) {
        accion1 = aAccion1;
    }

    /**
     * @return the accion
     */
    public static Libro getAccion() {
        return accion;
    }

    /**
     * @param aAccion the accion to set
     */
    public static void setAccion(Libro aAccion) {
        accion = aAccion;
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}