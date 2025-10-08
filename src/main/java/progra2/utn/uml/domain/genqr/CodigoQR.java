package progra2.utn.uml.domain.genqr;

import java.math.BigDecimal;

public class CodigoQR {
    private final BigDecimal valor;
    private final Usuario usuario;

    CodigoQR(BigDecimal valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
