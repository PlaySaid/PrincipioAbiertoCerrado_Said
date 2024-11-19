package Principio_AbiertoCerrado;

public class Unidad23_POO_SEM2 {

    public static void main(String[] args) {
        double precioProducto = 10000;
        
        Descuento porcentajeDescuento = new Descuento(20);
        double descuentoAplicado = porcentajeDescuento.calculoDescuento(precioProducto);
        System.out.println("El descuento aplicado es: "+descuentoAplicado);
        
        double Total = precioProducto - descuentoAplicado;
        
        System.out.println("El precio total a pagar es " + Total);
    }
    
}
