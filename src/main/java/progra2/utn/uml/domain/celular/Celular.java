package progra2.utn.uml.domain.celular;

public class Celular {
    private final String imei;
    private Bateria bateria;  // agregación (parte puede existir fuera)
    private Usuario usuario;  // asociación 1:1 (bi)

    public Celular(String imei, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.bateria = bateria;
        this.usuario = null;
        setUsuario(usuario);
    }

    public void setUsuario(Usuario nuevo) {
        if (this.usuario == nuevo) return;
        Usuario anterior = this.usuario;
        this.usuario = nuevo;

        if (anterior != null && anterior.getCelular() == this) {
            anterior.setCelular(null);
        }
        if (nuevo != null && nuevo.getCelular() != this) {
            nuevo.setCelular(this);
        }
    }

    public String getImei() { return imei; }
    public Bateria getBateria() { return bateria; }
    public void setBateria(Bateria bateria) { this.bateria = bateria; }
    public Usuario getUsuario() { return usuario; }
}
