import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by chalosalvador on 8/5/17.
 */
public class Principal {

    public static void main(String[] args){

//        Estudiante e1 = new Estudiante();
//        Estudiante e2 = e1;
//
//        e1.setNombre("Chalo");
//        e1.setApellido("Salvador");
//
//        System.out.println("E1 " + e1.getNombre());
//        System.out.println("E2 " + e2.getNombre());
//
//        System.out.println("E1 " + e1.getApellido());
//        System.out.println("E2 " + e2.getApellido());

        Scanner scan = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[3];
        String nombre;
        String apellido;
        String[] materias_estudiante;
        String[] materias = new String [10];
        int [] estudiantes_materia = new int[10];
        int contador_materias = 0; // me permite saber la cantidad de materias que voy ingresando

        int cantidad;

        for(int i = 0; i < estudiantes.length; i++) {
            System.out.println("INFORMACION DEL ESTUDIANTE " + (i+1));

            System.out.print("Ingrese el nombre: ");
            nombre = scan.nextLine();

            System.out.print("Ingrese el apellido: ");
            apellido = scan.nextLine();

            cantidad = -1;
            do {
                try {
                    System.out.print("Ingrese la cantidad de materias: ");
                    cantidad = scan.nextInt();

                    System.out.print("Ingrese la cantidad de horas: ");
                    cantidad = scan.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("Cantidad de materias no válida.");
                    scan.nextLine();
                } catch (ArrayIndexOutOfBoundsException e1) {
                    System.out.println("La materia no existe.");
                } catch (Exception e3) {
                    System.out.println("Todo el resto de excepciones");
                }
            }while(cantidad < 0);

            materias_estudiante = new String[cantidad];
            System.out.println("INGRESE LAS MATERIAS");

            for (int j = 0; j < materias_estudiante.length; j++){
                System.out.print("Ingrese la materia " + (j+1) + ": ");

                if(j == 0)
                    scan.nextLine();

                materias_estudiante[j] = scan.nextLine();

                /* Llevo un control de las materias que se van ingresando ara tener una lista única de materias */
                boolean ingresada = false;
                for (int k = 0; k < materias.length; k++){
                    // debido a que tengo 10 posiciones en el arreglo materias debo verificar si la posición
                    // tiene algún valor o es null, si es null quiere decir que no hay más materias en la lista
                    if(materias[k] == null) {
                        break;
                    } else {
                        if (materias[k].equals(materias_estudiante[j])) {
                            ingresada = true;
                            estudiantes_materia[k]++; // la materia ya fue ingresada entonces sumo + 1 estudiante
                            break;
                        }
                    }
                }

                /* La materia no ha sido ingresada anteriormente entonces la ingreso */
                if(!ingresada){
                    materias[contador_materias] = materias_estudiante[j];
                    estudiantes_materia[contador_materias] = 1; // es el primer estudiante en esta materia
                    contador_materias++;
                }

            }

            System.out.println();
            estudiantes[i] = new Estudiante(nombre, apellido, materias_estudiante);
        }

        for (int i = 0; i < estudiantes.length; i++) {
            nombre = estudiantes[i].getNombre();
            apellido = estudiantes[i].getApellido();
            materias_estudiante = estudiantes[i].getMaterias();

            System.out.println("INFORMACION DEL ESTUDIANTE " + i);
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);

            for (int j = 0; j < materias_estudiante.length; j++) {
                System.out.println("Materia " + (j+1) + ": " + materias_estudiante[j]);
            }

            System.out.println();


        }
        System.out.println("SE HAN MATRICULADO " + Estudiante.contador + " ESTUDIANTES.");

        for (int i = 0; i < materias.length; i++) {
            System.out.println(materias[i] + ": " + estudiantes_materia[i]);
        }


    }
}
