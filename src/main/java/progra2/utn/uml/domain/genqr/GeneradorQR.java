package progra2.utn.uml.domain.genqr;

import java.math.BigDecimal;

public class GeneradorQR {
    private CodigoQR ultimoCodigo;

    public void generar(BigDecimal valor, Usuario usuario) {
        ultimoCodigo = new CodigoQR(valor, usuario);
    }

    public CodigoQR getUltimoCodigo() {
        return ultimoCodigo;
    }
}
