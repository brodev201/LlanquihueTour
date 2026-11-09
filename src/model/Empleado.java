package model;

/**
 * Representa a un empleado de la agencia Llanquihue Tour.
 * Es una Persona y tiene una Direccion.
 * @author Benjamín Rodríguez Rodríguez
 * @version 1.0
 */
public class Empleado extends Persona {

    /** Cargo que desempeña el empleado */
    private String cargo;
    /** Años de experiencia en la agencia */
    private int anosExperiencia;
    /** Dirección del empleado */
    private Direccion direccion;

    /**
     * Constructor con parámetros. Los datos de la persona se pasan a la clase base
     * con super() y el resto se valida mediante los setters.
     * @throws IllegalArgumentException si algún dato es inválido
     */
    public Empleado(String nombre, String apellido, String rut, String telefono,
                    String cargo, int anosExperiencia, Direccion direccion) {
        super(nombre, apellido, rut, telefono);
        setCargo(cargo);
        setAnosExperiencia(anosExperiencia);
        setDireccion(direccion);
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        if (cargo == null || cargo.trim().isEmpty()) {
            throw new IllegalArgumentException("Debe completar el campo cargo.");
        }
        this.cargo = cargo;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }
    public void setAnosExperiencia(int anosExperiencia) {
        if (anosExperiencia < 0) {
            throw new IllegalArgumentException("Los años de experiencia deben ser igual o mayor a 0.");
        }
        this.anosExperiencia = anosExperiencia;
    }

    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        if (direccion == null) {
            throw new IllegalArgumentException("Debe completar el campo dirección.");
        }
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return super.toString() + " | Cargo: " + cargo
                + " | Experiencia: " + anosExperiencia + " años"
                + " | Dirección: " + direccion;
    }
}