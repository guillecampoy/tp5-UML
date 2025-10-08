package progra2.utn.uml.domain.reserva;

import java.time.LocalDate;

public class Reserva {
    private final LocalDate fecha;
    private final int hora;
    private Mesa mesa;
    private final Cliente cliente;

    public Reserva(LocalDate fecha, int hora, Mesa mesa, Cliente cliente) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa =mesa;
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getHora() {
        return hora;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
