package SistemaDeNotificaciones;

// Clase que representa el canal de notificación por correo electrónico
class CorreoElectronico extends CanalNotificacion implements Personalizable {
    private String direccionCorreo;

    // Constructor
    public CorreoElectronico(String usuario, String mensaje, String direccionCorreo) {
        super(usuario, mensaje);
        this.direccionCorreo = direccionCorreo;
    }

    // Implementación del método para enviar la notificación por correo electrónico
    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando correo electrónico...");
        System.out.println("A: " + direccionCorreo);
        System.out.println("Mensaje: " + mensaje);
    }

    // Implementación del método personalizarMensaje para modificar el mensaje
    @Override
    public void personalizarMensaje(String mensaje) {
        this.mensaje = mensaje;
        System.out.println("El mensaje del correo ha sido personalizado.");
    }
}

