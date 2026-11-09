package model;

/**
 * Clase base que representa a una persona vinculada a la agencia Llanquihue Tour.
 * Contiene los datos de clientes, guías, empleados y proveedores.
 * @author Benjamín Rodríguez Rodríguez
 * @version 1.1
 */
public class Persona {

    /** Nombre de la persona */
    private String nombre;
    /** Apellido de la persona */
    private String apellido;
    /** RUT de la persona, formato XXXXXXXX-Y */
    private String rut;
    /** Teléfono de contacto */
    private String telefono;

    /**
     * Constructor con parámetros. Usa los setters para validar los datos.
     * @throws IllegalArgumentException si algún dato no es válido
     */
    public Persona(String nombre, String apellido, String rut, String telefono) {
        setNombre(nombre);
        setApellido(apellido);
        setRut(rut);
        setTelefono(telefono);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Debe completar el campo nombre.");
        }
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        if (apellido == null || apellido.trim().isEmpty()) {
            throw new IllegalArgumentException("Debe completar el campo apellido.");
        }
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }
    public void setRut(String rut) {
        if (rut == null || !rut.matches("[0-9]+-[0-9kK]")) {
            throw new IllegalArgumentException("El formato debe ser XXXXXXXX-Y");
        }
        this.rut = rut;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        if (telefono == null || telefono.trim().isEmpty()) {
            throw new IllegalArgumentException("Debe compeltar el campo teléfono.");
        }
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " | RUT: " + rut + " | Teléfono: " + telefono;
    }
}