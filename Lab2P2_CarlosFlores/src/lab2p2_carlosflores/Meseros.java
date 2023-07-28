
package lab2p2_carlosflores;

public class Meseros {
    private String nombre, turno;
    private int edad, sueldo, propina;

    public Meseros() {
    }

    public Meseros(String nombre, String turno, int edad, int sueldo, int propina) {
        this.nombre = nombre;
        this.turno = turno;
        this.edad = edad;
        
        this.sueldo = sueldo;
        this.propina = propina;
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

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getPropina() {
        return propina;
    }

    public void setPropina(int propina) {
        this.propina = propina;
    }

    @Override
    public String toString() {
        return "Meseros{" + "nombre=" + nombre + ", turno=" + turno + ", edad=" + edad + ", sueldo=" + sueldo + ", propina=" + propina + '}';
    }
    
    
}
