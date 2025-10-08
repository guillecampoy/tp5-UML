package progra2.utn.uml.domain.computadora;

import java.util.Objects;

public class Computadora {
    private final String marca;
    private final int numeroSerie;
    private final PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, int numeroSerie, String modeloPlaca, String chipsetPlaca, Propietario propietario) {
        this.marca = Objects.requireNonNull(marca, "marca");
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipsetPlaca);
        setPropietario(propietario);
    }

    public String getMarca() {
        return marca;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario nuevo) {
        if (this.propietario == nuevo) {
            return;
        }
        Propietario anterior = this.propietario;
        this.propietario = nuevo;

        if (anterior != null && anterior.getComputadora() == this) {
            anterior.setComputadora(null);
        }
        if (nuevo != null && nuevo.getComputadora() != this) {
            nuevo.setComputadora(this);
        }
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", numeroSerie=" + numeroSerie +
                ", propietario=" + (propietario != null ? propietario.getNombre() : "—") +
                '}';
    }
}
