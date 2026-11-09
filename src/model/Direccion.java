package model;

/**
 * Representa la dirección física de una persona vinculada a la agencia de turismo.
 * @author Benjamín Rodríguez Rodríguez
 * @version 1.1
 */
public class Direccion {

    /** Calle del domicilio */
    private String calle;
    /** Número del domicilio */
    private int numero;
    /** Comuna del domicilio */
    private String comuna;
    /** Región del domicilio */
    private String region;

    /**
     * Constructor con parámetros. Usa los setters para validar los datos.
     * @throws IllegalArgumentException si algún dato no es válido
     */
    public Direccion(String calle, int numero, String comuna, String region) {
        setCalle(calle);
        setNumero(numero);
        setComuna(comuna);
        setRegion(region);
    }

    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        if (calle == null || calle.trim().isEmpty()) {
            throw new IllegalArgumentException("Debe completar el campo calle.");
        }
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("El número de la dirección debe ser mayor que 0.");
        }
        this.numero = numero;
    }

    public String getComuna() {
        return comuna;
    }
    public void setComuna(String comuna) {
        if (comuna == null || comuna.trim().isEmpty()) {
            throw new IllegalArgumentException("Debe completar el campo comuna.");
        }
        this.comuna = comuna;
    }

    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        if (region == null || region.trim().isEmpty()) {
            throw new IllegalArgumentException("Debe completar el campo región.");
        }
        this.region = region;
    }

    @Override
    public String toString() {
        return calle + " " + numero + ", " + comuna + ", " + region;
    }
}