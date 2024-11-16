package SistemaDeNotificaciones;

import java.util.ArrayList;
import java.util.List;

// Clase que gestiona los canales de notificación
class Notificaciones {
    private List<CanalNotificacion> canalesNotificacion;

    // Constructor
    public Notificaciones() {
        canalesNotificacion = new ArrayList<>();
    }

    // Método para agregar un canal de notificación
    public void agregarCanalNotificacion(CanalNotificacion canal) {
        canalesNotificacion.add(canal);
    }

    // Método para enviar notificaciones a todos los canales
    public void enviarNotificaciones() {
        for (CanalNotificacion canal : canalesNotificacion) {
            canal.enviarNotificacion();
        }
    }

    // Método para personalizar el mensaje de todos los canales
    public void personalizarMensaje(String nuevoMensaje) {
        for (CanalNotificacion canal : canalesNotificacion) {
            if (canal instanceof Personalizable) {
                ((Personalizable) canal).personalizarMensaje(nuevoMensaje);
            }
        }
    }

    // Mostrar la información de todos los canales de notificación
    public void mostrarInformacionCanales() {
        for (CanalNotificacion canal : canalesNotificacion) {
            System.out.println("Canal de Notificación: " + canal.getClass().getSimpleName());
            System.out.println("Usuario: " + canal.usuario);
            System.out.println("Mensaje: " + canal.mensaje);
            System.out.println();
        }
    }
}

