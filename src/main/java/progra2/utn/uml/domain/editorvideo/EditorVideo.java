package progra2.utn.uml.domain.editorvideo;

public class EditorVideo {
    private Render render;

    public void exportar(String formato, Proyecto proyecto) {
        render = new Render(formato, proyecto);
    }

    public Render getRender() {
        return render;
    }
}
