package SistemaDePagos;

// Clase que representa el método de pago con PayPal
class PayPal extends MetodoPago implements Cancelable {
    private String correoElectronico;

    // Constructor
    public PayPal(String titular, String numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
    }

    // Implementación del método realizarPago
    @Override
    public void realizarPago() {
        System.out.println("Realizando pago con PayPal.");
        System.out.println("Titular: " + titular);
        System.out.println("Correo electrónico: " + correoElectronico);
        System.out.println("Número de cuenta PayPal: " + numero);
        // Aquí podría agregarse más lógica de verificación de pago.
    }

    // Implementación del método cancelarPago
    @Override
    public void cancelarPago() {
        System.out.println("Pago con PayPal cancelado.");
        // Aquí podría agregarse más lógica de cancelación del pago.
    }
}

