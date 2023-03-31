public class Titular {
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String mail;

    public Titular(String nombre, String apellido, String dni, String telefono, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;

    }
    public String nombreCompleto(){
           return this.nombre +" "+ this.apellido;
    }
}
