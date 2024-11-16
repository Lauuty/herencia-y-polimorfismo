package ReservaDeVuelos;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private List<Vuelo> vuelos;

    public Reserva(Vuelo vuelos){
        this.vuelos=new ArrayList<>();
    }

    public void agregarVuelos(Vuelo vuelo){
        vuelos.add(vuelo);
    }

    public double calcularReservas(){
        double precioTotal=0;
            for(Vuelo vuelo: vuelos){
                precioTotal += vuelo.calcularPrecio();
            }
        return precioTotal;
    }
}
