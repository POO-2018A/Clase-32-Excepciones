/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.InputMismatchException;

// F ig. .: UsoDeExcepciones.java
// Demostración del mecanismo de manejo de excepciones
// try...catch...f inally.
public class UsoDeExcepciones {

    public static void main(String args[]) {
        try {
            lanzaExcepcion(); //llama al método lanzaExcepcion
        } // fin de try
        catch (Exception excepcion) // excepción lanzada por lanzaExcepcion
        {
            System.err.println("La excepcion se manejo en main");
        } // fin de catch

        noLanzaExcepcion();
    } // fin de main

    // demuestra los bloques try...catch...finally
    public static void lanzaExcepcion() throws Exception {
        try // lanza una excepción y la atrapa de inmediato
        {
            System.out.println("Metodo lanzaExcepcion");
            throw new Exception(); // genera la excepción


        } // fin de try
        catch (Exception excepcion) // atrapa la excepción lanzada en el bloque try
        {
            System.err.println(
                    "La excepcion se manejo en el metodo lanzaExcepcion");
            throw excepcion; // vuelve a lanzar para procesarla más adelante
            // no se llegaría al código que se coloque aquí, la excepción se vuelve a lanzar en el bloque catch
        } // f in de catch
        finally // se ejecuta sin importar lo que ocurra en los bloques try...catch
        {
            System.out.println("Terminó la llamada del metodo");
            System.err.println("Se ejecuto finally en lanzaExcepcion");
        } // fin de f inally

        // no se llega al código que se coloque aquí, la excepción se vuelve a lanzar en el bloque catch  
    } // fin del método lanzaExcepcion

    // demuestra el uso de finally cuando no ocurre una excepción
    public static void noLanzaExcepcion() {
        try // el bloque try no lanza una excepción
        {
            System.out.println("Metodo noLanzaExcepcion");
        } // f in de try
        catch (Exception excepcion) // no se ejecuta
        {
            System.err.println(excepcion);
        } // f in de catch
        finally // se ejecuta sin importar lo que ocurra en los bloques try...catch
        {
            System.err.println(
                    "Se ejecuto F inally en noLanzaExcepcion");
        } // f in de bloque f inally

        System.out.println("Fin del metodo noLanzaExcepcion");
    } // f in del método noLanzaExcepcion
} // f in de la clase UsoDeExcepciones
