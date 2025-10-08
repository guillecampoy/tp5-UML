package progra2.utn.uml.domain.documentacion;

import java.time.LocalDateTime;

public class FirmaDigital {
    private final String codigoHash;
    private final LocalDateTime fecha;
    private final Usuario usuario;

    FirmaDigital(String codigoHash, LocalDateTime fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
