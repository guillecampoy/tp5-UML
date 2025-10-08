package progra2.utn.uml.domain.impuesto;

import java.math.BigDecimal;

public class Calculadora {
    private final BigDecimal recargo;

    public Calculadora() {
        this(BigDecimal.valueOf(0.21));
    }

    public Calculadora(BigDecimal recargo) {
        this.recargo = recargo;
    }

    public BigDecimal getRecargo() {
        return recargo;
    }

    public void calcular(Impuesto impuesto) {
        impuesto.calcular(recargo);
    }
}
