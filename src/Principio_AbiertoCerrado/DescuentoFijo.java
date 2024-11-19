package Principio_AbiertoCerrado;

public class DescuentoFijo extends Descuento{
    private double descuento_fijo;
    
    public DescuentoFijo(double porcentaje) {
        super(0);
        this.descuento_fijo = descuento_fijo;
    }
    public double calcularDescuento(double precio){
        if(precio>=descuento_fijo){
            return descuento_fijo;
        }
        return 0;
    }
    public double getDescuento_fijo(){
    return descuento_fijo;
    }
}
