package Tacos;

public class Cuenta extends Tacos {

    private float montoMinimo = 0;

    public Cuenta(int canasta, int marisco, int asadero) {
        super(canasta, marisco, asadero);

    }

    public void setCostoMinimo(float montoMinimo) {
        this.montoMinimo = montoMinimo;
    }

    public float getMontoMinimo() {
        return montoMinimo;
    }

    public float costoAsadero() {
        float Asadero = getMontoMinimo();
        return (float) (Asadero + (Asadero * 0.60));
    }

    public float costoCanasta(){
        return (float) (costoAsadero()+(costoAsadero()*.12));
    }
    public float costoMarisco(){
        return (float) (costoAsadero()+(costoAsadero()*.23));
    }

    public void mostrarCuenta() {
        System.out.println("Total tacos de asadero: " + getAsadero() + " Costo unitario: " + costoAsadero());
        System.out.println("Total tacos de canasta: " + getCanasta() + " Costo unitario: " + costoCanasta());
        System.out.println("Total tacos de asadero: " + getMarisco() + " Costo unitario: " + costoMarisco());
               
    }
}
