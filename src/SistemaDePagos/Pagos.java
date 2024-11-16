package SistemaDePagos;

import java.util.ArrayList;
import java.util.List;

// Clase que gestiona los pagos
class Pagos {
    private List<MetodoPago> metodosPago;

    // Constructor
    public Pagos() {
        metodosPago = new ArrayList<>();
    }

    // Método para agregar un método de pago
    public void agregarMetodoPago(MetodoPago metodoPago) {
        metodosPago.add(metodoPago);
    }

    // Método para realizar los pagos de todos los métodos de pago
    public void realizarPagos() {
        for (MetodoPago metodo : metodosPago) {
            metodo.realizarPago();
        }
    }

    // Método para cancelar los pagos de todos los métodos de pago
    public void cancelarPagos() {
        for (MetodoPago metodo : metodosPago) {
            if (metodo instanceof Cancelable) {
                ((Cancelable) metodo).cancelarPago();
            }
        }
    }

    // Mostrar la información de todos los métodos de pago
    public void mostrarInformacionPagos() {
        for (MetodoPago metodo : metodosPago) {
            System.out.println("Método de pago: " + metodo.getClass().getSimpleName());
            System.out.println("Titular: " + metodo.titular);
            System.out.println("Número: " + metodo.numero);
            System.out.println();
        }
    }
}

