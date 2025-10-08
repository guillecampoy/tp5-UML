package progra2.utn.uml.domain.reserva;

public class Cliente {
    private final String nombre;
    private final int telefono;

    public Cliente(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }
}
