/**
 * Created by chalosalvador on 8/5/17.
 */
public class Estudiante {

    private String nombre;
    private String apellido;
    private String [] materias;
    public static int contador = 0;

    public Estudiante() {

    }

    public Estudiante(String nombre, String apellido, String[] materias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materias = materias;
        contador++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }
}
