package progra2.utn.uml.domain.turno;

import java.time.LocalDate;

public class CitaMedica {
    private final LocalDate fecha;
    private final int hora;
    private final Paciente paciente;
    private final Profesional profesional;

    public CitaMedica(LocalDate fecha, int hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getHora() {
        return hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }
}
