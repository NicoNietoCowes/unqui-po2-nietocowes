package tp7.fechas;

import org.joda.time.DateTime;

public class FechaAlumnos implements IFecha {
    private DateTime fechaReferencia;

    public FechaAlumnos(DateTime fechaReferencia) {
        super();
        this.fechaReferencia = fechaReferencia;
    }

    @Override
    public IFecha restarDias(int dias) {
        fechaReferencia.minusDays(dias);
        return this;
    }

    @Override
    public boolean antesDeAhora() {
        return fechaReferencia.isBeforeNow();
    }

    @Override
    public boolean antesDe(IFecha fecha) {
        return this.dia() < fecha.dia() && this.mes() <= fecha.mes() && this.anio() <= fecha.anio();
    }


    @Override
    public boolean despuesDeAhora() {
        return fechaReferencia.isAfterNow();
    }

    @Override
    public boolean despuesDeFecha(IFecha fecha) {
        return this.dia() > fecha.dia() && this.mes() >= fecha.mes() && this.anio() >= fecha.anio();
    }

    @Override
    public int dia() {
        return fechaReferencia.getDayOfMonth();
    }

    @Override
    public int mes() {
        return fechaReferencia.getMonthOfYear();
    }

    @Override
    public int anio() {
        return fechaReferencia.getYear();
    }

}