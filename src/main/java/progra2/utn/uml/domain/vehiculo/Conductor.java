package progra2.utn.uml.domain.vehiculo;

public class Conductor {
    private final String nombre;
    private final String licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo nuevo) {
        if (this.vehiculo == nuevo) {
            return;
        }
        Vehiculo anterior = this.vehiculo;
        this.vehiculo = nuevo;

        if (anterior != null && anterior.getConductor() == this) {
            anterior.setConductor(null);
        }
        if (nuevo != null && nuevo.getConductor() != this) {
            nuevo.setConductor(this);
        }
    }
}
