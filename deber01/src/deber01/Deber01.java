/*
 * Desarrollado por Kleine Hassler / Alumno de ISI
 * JAVA WEB 
 * Deber 01
 * 2022-SEP-13
 *
 */
package deber01;
import java.util.ArrayList;
import java.util.Scanner;

public class Deber01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String opcion = "0";
        ArrayList<Items> nitems = new ArrayList<Items>();
        Items objlitems = new Items();
                
        do{
            Scanner objRecibir = new Scanner(System.in);
            System.out.println("Escoge Opcion del Menu9");
            System.out.println("Salir con 9");
            
            System.out.println("------ MENU ---------");
            System.out.println("1: -> Agregar Productos");
            System.out.println("2: -> Editar Productos");
            System.out.println("3: -> Eliminar Productos");
            System.out.println("4: -> Listar Productos");
            System.out.println("9: -> Salir");
            opcion=objRecibir.nextLine();
            
            if(opcion.equals("9")){
                System.out.println("Hasta la Proxima ");
            }else{

                switch(opcion){
                    case "1":
                        for(int i=0;i<nitems.size();i++){
                            System.out.println("Posicion "+i+" ->  ITEM: "+nitems.get(i).getNombres()+" $ "+nitems.get(i).getPrecios() );                          
                        }
                        for (int i = 0; i < 1; i++) {
                            System.out.println("Ingrese Nombre de Articulo");
                            String nombre=objRecibir.nextLine();
                            System.out.println("Ingrese Precio del Articulo");
                            String precio=objRecibir.nextLine();
                            Items objnewitem = new Items();
                            objnewitem.setNombres(nombre);
                            objnewitem.setPrecios(precio);
                            nitems.add(objnewitem);
                            
                            
                        }   
                        // Ver Resultado
                        for(int i=0;i<nitems.size();i++){
                            System.out.println("Posicion "+i+" ->  ITEM: "+nitems.get(i).getNombres()+" $ "+nitems.get(i).getPrecios() );                          
                        }
                        break;
                    case "2":
                        // Editar Producto
                        if(nitems.size()>0){
                            
                            Scanner objEditar = new Scanner(System.in);
                            
                            System.out.println("---- Lista de Articulos a Editar !!! ---------");
                            for(int i=0;i<nitems.size();i++){
                                System.out.println("Posicion "+i+" ->  ITEM: "+nitems.get(i).getNombres()+" $ "+nitems.get(i).getPrecios() );                          
                            }
                            //
                            System.out.println("Ingrese posicion a Editar del Articulo");
                            String posi=objEditar.nextLine();
                                                       
                            int posi1 = 0;
                            posi1= Integer.parseInt(posi);
                                
                            System.out.println("Ingrese Nombre de Articulo");
                            String nombre=objEditar.nextLine();
                            System.out.println("Ingrese Precio del Articulo");
                            String precio=objEditar.nextLine();
                            
                            Items objedititem = new Items();
                            objedititem.setNombres(nombre);
                            objedititem.setPrecios(precio);
                            nitems.set (posi1, objedititem);
                            
                            System.out.println("---- Exitoso el Cambio de Articulo!!!");
                        }else{
                            System.out.println("---- Lista Vacia :: NO es posible Editar Articulos!!!");
                        }

                        break;
                    case "3":
                        if(nitems.size()>0){
                            /* Borrar*/
                             Scanner objDeleted = new Scanner(System.in);
                            
                            System.out.println("---- Lista de Articulos que puedes Borrar !!! ---------");
                            for(int i=0;i<nitems.size();i++){
                                System.out.println("Posicion "+i+" ->  ITEM: "+nitems.get(i).getNombres()+" $ "+nitems.get(i).getPrecios() );                          
                            }
                            //
                            System.out.println("Ingrese posicion del Articulo a Borrar");
                            String posi=objDeleted.nextLine();
                                                                                 
                            int posi1 = 0;
                            posi1= Integer.parseInt(posi);
                            Items objdelitem = new Items();
                            
                            nitems.remove(posi1);
                            
                             System.out.println("---- Logro remover el Articulo exitosamente !!!!!");
                            
                        }else{
                            System.out.println("Lista Vacia");
                        }
                        break;
                    case "4":
                        if(nitems.size()>0){
                            System.out.println(":. --- Lista de Articulos Registrados --- .:");
                            for(int i=0;i<nitems.size();i++){
                                System.out.println("Posicion "+i+" ->  ITEM: "+nitems.get(i).getNombres()+" $ "+nitems.get(i).getPrecios() );                          
                            }
                            System.out.println("========================================");
                            System.out.println(" ");
                        }else{
                            System.out.println("Lista Vacia");
                        }
                        
                        break;

                }
             }
        } while(!opcion.equals("9"));

        
    }
    
}
