package progra2.utn.uml.domain.cuentabanco;

import java.time.LocalDateTime;

class ClaveSeguridad {
    private final String codigo;
    private final LocalDateTime ultimaModificacion;

    ClaveSeguridad(String codigo, LocalDateTime ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public LocalDateTime getUltimaModificacion() {
        return ultimaModificacion;
    }
}
