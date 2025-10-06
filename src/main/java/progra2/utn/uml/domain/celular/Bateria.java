package progra2.utn.uml.domain.celular;

public class Bateria {
    private final String modelo;
    private int capacidad;

    public Bateria(String modelo, int cargaMah) {
        this.modelo = modelo;
        this.capacidad = cargaMah;
    }

    public String getModelo() { return modelo; }
    public int getCargaMah() { return capacidad; }
    public void setCargaMah(int cargaMah) { this.capacidad = cargaMah; }
}
