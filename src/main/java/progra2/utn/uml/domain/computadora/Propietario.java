package progra2.utn.uml.domain.computadora;

public class Propietario {
    private final String nombre;
    private final int dni;
    private Computadora computadora;

    public Propietario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora nueva) {
        if (this.computadora == nueva) {
            return;
        }
        Computadora anterior = this.computadora;
        this.computadora = nueva;

        if (anterior != null && anterior.getPropietario() == this) {
            anterior.setPropietario(null);
        }
        if (nueva != null && nueva.getPropietario() != this) {
            nueva.setPropietario(this);
        }
    }

    @Override
    public String toString() {
        return "Propietario{" + nombre + ", dni=" + dni + '}';
    }
}
