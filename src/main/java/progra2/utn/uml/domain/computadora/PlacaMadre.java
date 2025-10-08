package progra2.utn.uml.domain.computadora;

class PlacaMadre {
    private final String modelo;
    private final String chipset;

    PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public String getModelo() {
        return modelo;
    }

    public String getChipset() {
        return chipset;
    }

    @Override
    public String toString() {
        return "PlacaMadre{" +
                "modelo='" + modelo + '\'' +
                ", chipset='" + chipset + '\'' +
                '}';
    }
}
