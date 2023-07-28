package lab2p2_carlosflores;

public class Bartenders {

    private String nombre, turno;
    private int edad, sueldo, numLicores;

    public Bartenders() {
    }

    public Bartenders(String nombre, String turno, int edad, int sueldo, int numLicores) {
        this.nombre = nombre;
        this.turno = turno;
        this.edad = edad;

        this.sueldo = sueldo;
        this.numLicores = numLicores;
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

    public int getNumLicores() {
        return numLicores;
    }

    public void setNumLicores(int numLicores) {
        this.numLicores = numLicores;
    }

    @Override
    public String toString() {
        return "Bartenders{" + "nombre=" + nombre + ", turno=" + turno + ", edad=" + edad + ", sueldo=" + sueldo + ", numLicores=" + numLicores + '}';
    }

}
