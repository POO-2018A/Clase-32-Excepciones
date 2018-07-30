/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesencadenadas;
// Fig. 13.8: UsoDeExcepcionesEncadenadas.java
// Demostración de las excepciones encadenadas.

public class ExcepcionesEncadenadas {

    public static void main(String args[]) {
        try {
            metodo1(); // llama a metodo1
        } // fin de try
        catch (Exception excepcion) // excepciones lanzadas desde metodo1
        {
            excepcion.printStackTrace();
        } // fin de catch
    } // fin de main

    // llama a metodo2; lanza las excepciones de vuelta a main
    public static void metodo1() throws Exception {
        try {
            metodo2(); // llama a metodo2
        } // fin de try
        catch (Exception excepcion) // excepción lanzada desde metodo2
        {
            throw new Exception("La excepcion se lanzo en metodo1", excepcion);
        } // fin de try
    } // fin del método metodo1

    // llama a metodo3; lanza las excepciones de vuelta a metodo1
    public static void metodo2() throws Exception {
        try {
            metodo3(); // llama a metodo3
        } // fin de try
        catch (Exception excepcion) // excepción lanzada desde metodo3
        {
            throw new Exception("La excepcion se lanzo en metodo2", excepcion);
        } // fin de catch
    } // fin del método metodo2

    // lanza excepción Exception de vuelta a metodo2
    public static void metodo3() throws Exception {
        throw new Exception("La excepcion se lanzo en metodo3");
    } // fin del método metodo3
} // fin de la clase UsoDeExcepcionesEncadenadas

