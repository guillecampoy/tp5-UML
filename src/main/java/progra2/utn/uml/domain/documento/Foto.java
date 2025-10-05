package progra2.utn.uml.domain.documento;

public class Foto {
    private final String imagen;
    private final String formato;

    Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    public String getImagen() { return imagen; }
    public String getFormato() { return formato; }

    @Override
    public String toString() {
        return "Foto{" + formato + "}";
    }
}
