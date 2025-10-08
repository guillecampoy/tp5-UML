package progra2.utn.uml.domain.cuentabanco;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CuentaBancaria {
    private final String cbu;
    private BigDecimal saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;

    public CuentaBancaria(String cbu, BigDecimal saldoInicial, String clave, LocalDateTime ultimaModificacion, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldoInicial;
        this.claveSeguridad = new ClaveSeguridad(clave, ultimaModificacion);
        setTitular(titular);
    }

    public String getCbu() {
        return cbu;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void acreditar(BigDecimal monto) {
        saldo = saldo.add(monto);
    }

    public void debitar(BigDecimal monto) {

        saldo = saldo.subtract(monto);
    }

    public void actualizarClave(String nuevaClave, LocalDateTime fechaActualizacion) {
        this.claveSeguridad = new ClaveSeguridad(nuevaClave, fechaActualizacion);
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular nuevo) {
        if (this.titular == nuevo) {
            return;
        }
        Titular anterior = this.titular;
        this.titular = nuevo;

        if (anterior != null && anterior.getCuenta() == this) {
            anterior.setCuenta(null);
        }
        if (nuevo != null && nuevo.getCuenta() != this) {
            nuevo.setCuenta(this);
        }
    }
}
