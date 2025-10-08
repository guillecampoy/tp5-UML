package progra2.utn.uml.domain.genqr;

import java.math.BigDecimal;

public class GeneradorQR {
    private CodigoQR codigoQR;

    public void generar(BigDecimal valor, Usuario usuario) {
        codigoQR = new CodigoQR(valor, usuario);
    }

    public CodigoQR getCodigoQR() {
        return codigoQR;
    }
}
