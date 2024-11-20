package Ejercicio3;

public class Ejecucion {

    public static void main(String[] args) {
        
        Mensajero correo = new Mensajero();
        correo.enviar();
        
        MensajeroSMS sms = new MensajeroSMS();
        sms.enviar();
    }
    
}
