package SistemaDeNotificaciones;

// Clase principal para probar el sistema de notificaciones
public class SistemaNotificaciones {
    public static void main(String[] args) {
        // Crear objetos de canales de notificación
        CanalNotificacion correo1 = new CorreoElectronico("Juan Pérez", "¡Hola! Tienes una nueva notificación.", "juan.perez@example.com");
        CanalNotificacion mensaje1 = new MensajeTexto("Ana Gómez", "¡Hola! Tienes un mensaje nuevo.", "555-1234");

        // Crear el sistema de notificaciones
        Notificaciones sistemaNotificaciones = new Notificaciones();

        // Agregar canales de notificación
        sistemaNotificaciones.agregarCanalNotificacion(correo1);
        sistemaNotificaciones.agregarCanalNotificacion(mensaje1);

        // Mostrar la información de los canales de notificación
        sistemaNotificaciones.mostrarInformacionCanales();

        // Personalizar el mensaje de notificación
        sistemaNotificaciones.personalizarMensaje("¡Tienes un nuevo mensaje importante!");

        // Enviar las notificaciones
        sistemaNotificaciones.enviarNotificaciones();
    }
}

