package progra2.utn.uml.domain.vehiculo;

public class Vehiculo {
    private final String patente;
    private final String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        setConductor(conductor);
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor nuevo) {
        if (this.conductor == nuevo) {
            return;
        }
        Conductor anterior = this.conductor;
        this.conductor = nuevo;

        if (anterior != null && anterior.getVehiculo() == this) {
            anterior.setVehiculo(null);
        }
        if (nuevo != null && nuevo.getVehiculo() != this) {
            nuevo.setVehiculo(this);
        }
    }
}
