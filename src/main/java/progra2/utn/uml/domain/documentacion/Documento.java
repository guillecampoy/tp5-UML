package progra2.utn.uml.domain.documentacion;

import java.time.LocalDateTime;

public class Documento {
    private final String titulo;
    private final String contenido;
    private final FirmaDigital firmaDigital;

    public Documento(String titulo, String contenido, String codigoHash, LocalDateTime fechaFirma, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fechaFirma, usuario);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }
}
