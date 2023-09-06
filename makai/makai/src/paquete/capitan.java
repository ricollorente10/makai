package paquete;

public class capitan {

    private String nombre;
    private String apellido;
    private String maticula_navegacion;

    public capitan(String nombre, String apellido, String matricula_navegacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.maticula_navegacion = matricula_navegacion;
    }

    @Override
    public String toString() {
        return "NOMBRE: " + this.nombre + "\n" + "APELLIDO: " + this.apellido + "\n" + "MATRICULA DE NAVEGACION: " + this.maticula_navegacion;
    }

}
