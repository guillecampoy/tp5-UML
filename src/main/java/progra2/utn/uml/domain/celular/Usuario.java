package progra2.utn.uml.domain.celular;

public class Usuario {
    private final String nombre;
    private Celular celular; // referencia bidireccional

    public Usuario(String nombre) { this.nombre = nombre; }

    public void setCelular(Celular nuevo) {
        if (this.celular == nuevo) return;
        Celular anterior = this.celular;
        this.celular = nuevo;

        if (anterior != null && anterior.getUsuario() == this) {
            anterior.setUsuario(null);
        }
        if (nuevo != null && nuevo.getUsuario() != this) {
            nuevo.setUsuario(this);
        }
    }

    public String getNombre() { return nombre; }
    public Celular getCelular() { return celular; }
}
