package Tacos;

public class Principal {

    public static void main(String[] args) {
        Cuenta CantidadTacos=new Cuenta(2,2,2);        
        CantidadTacos.setCostoMinimo(10);
        CantidadTacos.mostrarCuenta();
        
    }
}
