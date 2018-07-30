/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Fig. 13.6: UsoDeExcepciones.java
// Demostración de la limpieza de la pila.

public class LimpiezaDePila {

    public static void main(String args[]) {
        try // llama a lanzaExcepcion para demostrar la limpieza de la pila
        {
            lanzaExcepcion();
        } // fin de try
        catch (Exception excepcion) // excepción lanzada en lanzaExcepcion
        {
            System.err.println("La excepcion se manejo en main");
        } // fin de catch
    } // fin de main

    // lanzaExcepcion lanza la excepción que no se atrapa en este método
    public static void lanzaExcepcion() throws Exception {
        try // lanza una excepción y la atrapa en main
        {
            System.out.println("Metodo lanzaExcepcion");
            throw new Exception(); // genera la excepción
        } // fin de try
        catch (RuntimeException runtimeException) // atrapa el tipo incorrecto
        {
            System.err.println(
                    "La excepcion se manejo en el metodo lanzaExcepcion");
        } // fin de catch
        finally // el bloque finally siempre se ejecuta
        {
            System.err.println("Finally siempre se ejecuta");
        } // fin de finally
    } // fin del método lanzaExcepcion
} // fin de la clase UsoDeExcepciones

