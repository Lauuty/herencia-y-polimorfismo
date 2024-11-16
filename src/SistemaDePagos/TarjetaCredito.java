package SistemaDePagos;

// Clase que representa el método de pago con tarjeta de crédito
class TarjetaCredito extends MetodoPago implements Cancelable {
    private String fechaExpiracion;
    private String codigoSeguridad;

    // Constructor
    public TarjetaCredito(String titular, String numero, String fechaExpiracion, String codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    // Implementación del método realizarPago
    @Override
    public void realizarPago() {
        System.out.println("Realizando pago con tarjeta de crédito.");
        System.out.println("Titular: " + titular);
        System.out.println("Número de tarjeta: " + numero);
        System.out.println("Fecha de expiración: " + fechaExpiracion);
        System.out.println("Código de seguridad: " + codigoSeguridad);
        // Aquí podría agregarse más lógica de verificación de pago.
    }

    // Implementación del método cancelarPago
    @Override
    public void cancelarPago() {
        System.out.println("Pago con tarjeta de crédito cancelado.");
        // Aquí podría agregarse más lógica de cancelación del pago.
    }
}
