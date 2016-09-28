package Tacos;

public class Tacos {
    private int canasta;
    private int marisco;
    private int asadero;
    
    public Tacos (int canasta, int marisco, int asadero){
        this.canasta=canasta;
        this.marisco=marisco;
        this.asadero=asadero;
                       
    }
    
    public int getCanasta(){
        return canasta;
    }
    public int getMarisco(){
        return marisco;
    }
    public int getAsadero(){
        return asadero;
    }
}
