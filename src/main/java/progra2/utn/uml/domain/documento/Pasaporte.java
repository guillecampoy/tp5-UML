package progra2.utn.uml.domain.documento;

import java.time.LocalDate;

public class Pasaporte {
    private final String numero;
    private final LocalDate fechaEmision;
    private final Foto foto;
    private Titular titular;

    /** Crea el todo y su parte (Foto). Refuerza la composición. */
    public Pasaporte(String numero, LocalDate fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen,formato);
    }

    /** Mantiene la asociación 1:1 bidireccional coordinada. */
    public void setTitular(Titular nuevo) {
        if (this.titular == nuevo) return;

        Titular anterior = this.titular;
        this.titular = nuevo;

        if (anterior != null && anterior.getPasaporte() == this) {
            anterior.setPasaporte(null);
        }
        if (nuevo != null && nuevo.getPasaporte() != this) {
            nuevo.setPasaporte(this);
        }
    }

    public String getNumero() { return numero; }
    public LocalDate getFechaEmision() { return fechaEmision; }
    public Foto getFoto() { return foto; }
    public Titular getTitular() { return titular; }

    @Override
    public String toString() {
        return "Pasaporte{" +
                "numero='" + numero + '\'' +
                ", fechaEmision=" + fechaEmision +
                ", titular=" + (titular != null ? titular.getNombre() : "—") +
                '}';
    }
}
