package SistemaDeNotificaciones;

// Clase que representa el canal de notificación por mensaje de texto
class MensajeTexto extends CanalNotificacion implements Personalizable {
    private String numeroTelefono;

    // Constructor
    public MensajeTexto(String usuario, String mensaje, String numeroTelefono) {
        super(usuario, mensaje);
        this.numeroTelefono = numeroTelefono;
    }

    // Implementación del método para enviar la notificación por mensaje de texto
    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando mensaje de texto...");
        System.out.println("A: " + numeroTelefono);
        System.out.println("Mensaje: " + mensaje);
    }

    // Implementación del método personalizarMensaje para modificar el mensaje
    @Override
    public void personalizarMensaje(String mensaje) {
        this.mensaje = mensaje;
        System.out.println("El mensaje del texto ha sido personalizado.");
    }
}

