package patronesEstrocturales.proxy.ejercicio;

public class Cliente {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("123c", 1000);
        TarjetaDebito tarjetaDebito = new TarjetaDebito("Brenda", 4506001, cuenta1);

        tarjetaDebito.acceso(100, "Bs");
        tarjetaDebito.acceso(10, "US");
        tarjetaDebito.acceso(1, "E");
        
    }
}
