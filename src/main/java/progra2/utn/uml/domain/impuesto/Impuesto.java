package progra2.utn.uml.domain.impuesto;

import java.math.BigDecimal;

public class Impuesto {
    private BigDecimal monto;
    private final Contribuyente contribuyente;

    public Impuesto(BigDecimal monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void calcular(BigDecimal porcentaje) {
        BigDecimal factor = BigDecimal.ONE.add(porcentaje);
        this.monto = this.monto.multiply(factor);
    }
}
