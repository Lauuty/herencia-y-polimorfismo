package SistemaDeNotificaciones;

// Clase abstracta que representa un canal de notificación
abstract class CanalNotificacion {
    protected String usuario;
    protected String mensaje;

    // Constructor
    public CanalNotificacion(String usuario, String mensaje) {
        this.usuario = usuario;
        this.mensaje = mensaje;
    }

    // Método abstracto para enviar la notificación
    public abstract void enviarNotificacion();
}
