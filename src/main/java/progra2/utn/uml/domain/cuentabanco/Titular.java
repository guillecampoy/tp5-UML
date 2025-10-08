package progra2.utn.uml.domain.cuentabanco;

public class Titular {
    private final String nombre;
    private final String dni;
    private CuentaBancaria cuenta;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria nueva) {
        if (this.cuenta == nueva) {
            return;
        }
        CuentaBancaria anterior = this.cuenta;
        this.cuenta = nueva;

        if (anterior != null && anterior.getTitular() == this) {
            anterior.setTitular(null);
        }
        if (nueva != null && nueva.getTitular() != this) {
            nueva.setTitular(this);
        }
    }
}
