package ReservaDeVuelos;

public class VueloRegular extends Vuelo implements Promocionable {
    private int numeroAsientos;
    private double precioAsiento;

    public VueloRegular(int numeroVuelo, String origen, String destino, String fecha, int numeroAsientos) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos=numeroAsientos;
        this.precioAsiento=80;
    }

    @Override
    public double calcularPrecio() {
        return precioAsiento*numeroAsientos;
    }

    @Override
    public void aplicarPromocion(double precio) {
        System.out.println("Aplicando la promoción, el precio del vuelo queda en: " + (precio-(precio*0.15)));
    }
}
