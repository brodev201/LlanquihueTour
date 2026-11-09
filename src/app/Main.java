package app;

import model.Direccion;
import model.Empleado;
import model.Persona;

/**
 * Clase principal que prueba el modelo de clases de la agencia de turismo Llanquihue Tour.
 * @author Benjamín Rodríguez Rodríguez
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("LLANQUIHUE TOUR");

        // Direcciones (objetos que serán parte de los empleados)
        Direccion dir1 = new Direccion("Av. Vicente Pérez Rosales", 120, "Llanquihue", "Los Lagos");
        Direccion dir2 = new Direccion("Calle Errázuriz", 345, "Puerto Varas", "Los Lagos");
        Direccion dir3 = new Direccion("Av. Costanera", 78, "Frutillar", "Los Lagos");

        // Empleados (heredan de Persona y contienen una Direccion)
        Empleado emp1 = new Empleado("Bruce", "Wayne", "18863841-4", "+569 11112222",
                "Guía de fauna", 5, dir1);
        Empleado emp2 = new Empleado("Dick", "Grayson", "15234567-K", "+569 33334444",
                "Guía de flora", 8, dir2);
        Empleado emp3 = new Empleado("Tim", "Drake", "18456789-0", "+569 55556666",
                "Guía de geología", 3, dir3);

        // Persona general (clase base)
        Persona persona = new Persona("Jason", "Tod", "20111222-3", "+569 77778888");

        System.out.println("\n Empleados registrados");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        System.out.println("\n Persona general (clase base)");
        System.out.println(persona);

        System.out.println("\n Composición: acceso a la dirección del empleado");
        System.out.println(emp1.getNombre() + " vive en la comuna de " + emp1.getDireccion().getComuna());

        System.out.println("\n Modificación con set");
        emp3.setCargo("Guía de astronomía");
        System.out.println("Nuevo cargo de " + emp3.getNombre() + ": " + emp3.getCargo());

        System.out.println("\n Validación de datos");
        try {
            new Empleado("Damian", "Wayne", "123456789", "+569 99990000",
                    "Chofer", 2, dir1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear empleado: " + e.getMessage());
        }
    }
}