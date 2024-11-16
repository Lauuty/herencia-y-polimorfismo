package ReservaDeVuelos;

public class VueloCharter extends Vuelo implements Promocionable{
    private double precioTotal;

    public VueloCharter(int numeroVuelo, String origen, String destino, String fecha, double precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal=10000;
    }

    @Override
    public double calcularPrecio() {
        return precioTotal;
    }

    @Override
    public void aplicarPromocion(double precio) {
        System.out.println("Aplicando la promoción, el precio del vuelo queda en: " + (precio-(precio*0.15)));
    }
}
