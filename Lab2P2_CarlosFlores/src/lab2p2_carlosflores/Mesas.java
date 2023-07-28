
package lab2p2_carlosflores;


public class Mesas {
    private int numPlatos, numUtensilios, precioTotal;

    public Mesas() {
    }

    public Mesas(int numPlatos, int numUtensilios, int precioTotal) {
        this.numPlatos = numPlatos;
        this.numUtensilios = numUtensilios;
        this.precioTotal = precioTotal;
    }

    public int getNumPlatos() {
        return numPlatos;
    }

    public void setNumPlatos(int numPlatos) {
        this.numPlatos = numPlatos;
    }

    public int getNumUtensilios() {
        return numUtensilios;
    }

    public void setNumUtensilios(int numUtensilios) {
        this.numUtensilios = numUtensilios;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "Mesas{" + "numPlatos=" + numPlatos + ", numUtensilios=" + numUtensilios + ", precioTotal=" + precioTotal + '}';
    }
    
    
}
