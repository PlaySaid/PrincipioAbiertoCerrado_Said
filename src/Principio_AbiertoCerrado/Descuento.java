package Principio_AbiertoCerrado;

public class Descuento {
    double porcentaje;
    
    public Descuento(double porcentaje){
        this.porcentaje = porcentaje;
    }
    
    public double calculoDescuento(double precio){
        return precio * (porcentaje/100);
    }
    
    public double getPorcentaje(){
        return porcentaje;
    }
}