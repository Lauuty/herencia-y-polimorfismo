package SistemaDePagos;

// Clase abstracta que representa un método de pago
abstract class MetodoPago {
    protected String titular;
    protected String numero;

    // Constructor
    public MetodoPago(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }

    // Método abstracto para realizar el pago
    public abstract void realizarPago();
}

