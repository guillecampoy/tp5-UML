package progra2.utn.uml.domain.editorvideo;

public class EditorVideo {
    private Render ultimoRender;

    public void exportar(String formato, Proyecto proyecto) {
        ultimoRender = new Render(formato, proyecto);
    }

    public Render getUltimoRender() {
        return ultimoRender;
    }
}
