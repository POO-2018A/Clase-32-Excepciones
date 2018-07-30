/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosexcepciones;
// Fig. 13.7: UsoDeExcepciones.java
// Demostración de getMessage y printStackTrace de la clase Exception.

public class MetodosExcepciones {

    public static void main(String args[]) {

        try{
            metodo2();
        } catch(Exception e){
            
        }
        
        try{
            metodo3();
        } catch(Exception e){
            
        }
        
        try {
            metodo1(); // llama a metodo1
        } // fin de try
        catch (Exception excepcion) // atrapa la excepción lanzada en metodo1
        {
            System.err.printf("%s\n\n", excepcion.getMessage());
            excepcion.printStackTrace(); // imprime el rastreo de la pila de la excepción

            // obtiene la información de rastreo de la pila
            StackTraceElement[] elementosRastreo = excepcion.getStackTrace();

            System.out.println("\nRastreo de la pila de getStackTrace:");
            System.out.println("Clase\t\t\tArchivo\t\t\tLinea\tMetodo");

            // itera a través de elementosRastreo para obtener la descripción de la excepción
            for (StackTraceElement elemento : elementosRastreo) {
                System.out.printf("%s\t", elemento.getClassName());
                System.out.printf("%s\t", elemento.getFileName());
                System.out.printf("%s\t", elemento.getLineNumber());
                System.out.printf("%s\n", elemento.getMethodName());
            } // fin de for
        } // fin de catch
    } // fin de main

    // llama a metodo2; lanza las excepciones de vuelta a main
    public static void metodo1() throws Exception {
        metodo2();
    } // fin del método metodo1

    // llama a metodo3; lanza las excepciones de vuelta a metodo1
    public static void metodo2() throws Exception {
        metodo3();
    } // fin del método metodo2

    // lanza la excepción Exception de vuelta a metodo2
    public static void metodo3() throws Exception {
        throw new Exception("La excepcion se lanzo en metodo3");
    } // fin del método metodo3
    
    private String nombre;
    public String getNombre () {
        if ( this.nombre==null ) {
            try{
            throw new Exception("Aún no se ha asignado un nombre"); 
            }catch(Exception e){
                
            }
        }
        
        return this.nombre; 
    }
} // fin de la clase MetodosExcepciones

