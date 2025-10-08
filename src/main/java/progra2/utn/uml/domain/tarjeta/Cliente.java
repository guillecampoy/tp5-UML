package progra2.utn.uml.domain.tarjeta;

public class Cliente {
    private final String nombre;
    private final String dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaDeCredito nueva) {
        if (this.tarjeta == nueva) {
            return;
        }
        TarjetaDeCredito anterior = this.tarjeta;
        this.tarjeta = nueva;

        if (anterior != null && anterior.getCliente() == this) {
            anterior.setCliente(null);
        }
        if (nueva != null && nueva.getCliente() != this) {
            nueva.setCliente(this);
        }
    }
}
