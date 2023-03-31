public class Titular {
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String mail;

    /**
     *
     * @param nombre
     * @param apellido
     * @param dni
     * @param telefono
     * @param mail
     */
    public Titular(String nombre, String apellido, String dni, String telefono, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;

    }

    /**
     *
     * @return String concatena el nombre con el apellido
     */
    public String nombreCompleto(){
           return this.nombre +" "+ this.apellido;
    }
}
