package SistemaDePagos;


// Clase principal para probar el sistema de pagos
public class SistemaDePagos {
    public static void main(String[] args) {
        // Crear objetos de métodos de pago
        MetodoPago tarjeta1 = new TarjetaCredito("Juan Pérez", "1234567890123456", "12/25", "123");
        MetodoPago paypal1 = new PayPal("Ana Gómez", "ana.gomez@example.com", "ana.gomez@paypal.com");

        // Crear el sistema de pagos
        Pagos sistemaPagos = new Pagos();

        // Agregar métodos de pago
        sistemaPagos.agregarMetodoPago(tarjeta1);
        sistemaPagos.agregarMetodoPago(paypal1);

        // Mostrar la información de los métodos de pago
        sistemaPagos.mostrarInformacionPagos();

        // Realizar los pagos
        sistemaPagos.realizarPagos();

        // Cancelar los pagos
        sistemaPagos.cancelarPagos();
    }
}
