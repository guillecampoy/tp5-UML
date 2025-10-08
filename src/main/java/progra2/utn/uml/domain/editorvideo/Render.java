package progra2.utn.uml.domain.editorvideo;

public class Render {
    private final String formato;
    private final Proyecto proyecto;

    Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public String getFormato() {
        return formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }
}
