/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;


/* Ejemplo Gestión de Excepciones Java aprenderaprogramar.com */
public class Programa {

    public static void main(String[] args) {
        try {
            System.out.println("Intentamos ejecutar el bloque de instrucciones:");
            System.out.println("Instrucción 1.");
            System.out.println("Instrucción 2.");
            int n = Integer.parseInt("M"); //error forzado en tiempo de ejecución.
            System.out.println("Instrucción 3, etc.");

        } catch(NumberFormatException nfe){
            System.out.println("Instrucciones a ejecutar cuando se produce un error de formato de numero");
        } catch (Exception e) {
            System.out.println("Instrucciones a ejecutar cuando se produce un error de cuaquier otro tipo");
        } finally {
            System.out.println("Terminó el programa");
            System.out.println("Instrucciones a ejecutar finalmente tanto si se producen errores como si no.");
        }
    }
}
