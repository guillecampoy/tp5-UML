package progra2.utn.uml.domain.documento;

/** Entidad independiente que puede existir por fuera, pero se asocia 1:1 con Pasaporte. */
public class Titular {
    private final String nombre;
    private final String dni;
    private Pasaporte pasaporte;  // referencia bi direccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    /** Mantiene la asociación 1:1 bidireccional coordinada. */
    public void setPasaporte(Pasaporte nuevo) {
        if (this.pasaporte == nuevo) return;

        Pasaporte anterior = this.pasaporte;
        this.pasaporte = nuevo;

        if (anterior != null && anterior.getTitular() == this) {
            anterior.setTitular(null);
        }
        if (nuevo != null && nuevo.getTitular() != this) {
            nuevo.setTitular(this);
        }
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public Pasaporte getPasaporte() { return pasaporte; }

    @Override
    public String toString() {
        return "Titular{" + nombre + " (" + dni + ")}";
    }
}
