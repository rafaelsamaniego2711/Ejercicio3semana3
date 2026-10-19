public class Servicio {
    private String nombre;
    private int puerto;
    private boolean activo;
    private int cantidadPeticiones;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public int getPuerto() {
        return this.puerto;
    }

    public void setPuerto(int puerto) {
        if (puerto > 0) {
            this.puerto = puerto;
        }
    }

    public boolean isActivo() {
        return this.activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getCantidadPeticiones() {
        return this.cantidadPeticiones;
    }

    public void setCantidadPeticiones(int cantidadPeticiones) {
        if (cantidadPeticiones >= 0) {
            this.cantidadPeticiones = cantidadPeticiones;
        }
    }

    public void iniciar() {
        this.activo = true;
    }

    public void detener() {
        this.activo = false;
    }

    public void registrarPeticion() {
        this.cantidadPeticiones++;
    }
}
