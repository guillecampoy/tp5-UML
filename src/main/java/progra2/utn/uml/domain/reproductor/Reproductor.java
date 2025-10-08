package progra2.utn.uml.domain.reproductor;

public class Reproductor {
    private Cancion enReproduccion;

    public void reproducir(Cancion cancion) {
        this.enReproduccion = cancion;
    }

    public Cancion getCancionEnReproduccion() {
        return enReproduccion;
    }
}
