/*Para practicar la encapsulación:
Crear clase Persona.
Crear variables las privadas edad, nombre y telefono de la clase Persona.
Crear gets y sets de cada propiedad.
Crear un objeto persona en el main.
Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola*/


public class main {
    public static void main(String args[]){
        System.out.println("PAE-privacidad,abstraccion,encapsulamiento");
        Persona persona = new Persona();

        persona.setNombre("Nombre: Alexander");
        System.out.println(persona.getNombre());

        persona.setEdad(28);
        System.out.println("Edad: " + persona.getEdad());

        persona.setTelefono(70261985);
        System.out.println("Telefono: " + persona.getTelefono());

        System.out.println("***Gracias por ensenarnos bien.***");
    }
}

class Persona{
    //los set y get de cada uno
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getTelefono() {
        return telefono;
    }

    private String nombre;
    private int edad;
    private int telefono;

}
