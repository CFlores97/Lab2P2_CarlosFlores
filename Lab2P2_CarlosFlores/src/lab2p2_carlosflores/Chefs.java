
package lab2p2_carlosflores;


public class Chefs {
    private String nombre, turno;
    private int edad, numEstrellas, sueldo;
    
    public Chefs(){
        
    }

    public Chefs(String nombre, String turno, int edad, int numEstrellas, int sueldo) {
        this.nombre = nombre;
        this.turno = turno;
        this.edad = edad;
        this.numEstrellas = numEstrellas;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumEstrellas() {
        return numEstrellas;
    }

    public void setNumEstrellas(int numEstrellas) {
        this.numEstrellas = numEstrellas;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString(){
        return "Nomre: " + nombre + " Turno: " + turno + " Edad: " + edad + " Numero de Estrellas Michellin: " + numEstrellas + " Sueldo: " + sueldo;
    }
    
}
