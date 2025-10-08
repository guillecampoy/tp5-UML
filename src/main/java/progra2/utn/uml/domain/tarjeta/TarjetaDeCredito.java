package progra2.utn.uml.domain.tarjeta;

import java.time.LocalDate;

public class TarjetaDeCredito {
    private final int numero;
    private final LocalDate fechaVencimiento;
    private final Banco banco;
    private Cliente cliente;

    public TarjetaDeCredito(int numero, LocalDate fechaVencimiento, Banco banco, Cliente cliente) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
        setCliente(cliente);
    }

    public int getNumero() {
        return numero;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente nuevo) {
        if (this.cliente == nuevo) {
            return;
        }
        Cliente anterior = this.cliente;
        this.cliente = nuevo;

        if (anterior != null && anterior.getTarjeta() == this) {
            anterior.setTarjeta(null);
        }
        if (nuevo != null && nuevo.getTarjeta() != this) {
            nuevo.setTarjeta(this);
        }
    }
}
