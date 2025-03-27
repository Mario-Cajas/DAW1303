package entidades;

import java.time.LocalDateTime;

public class Reserva {
    private int idPista;
    private LocalDateTime fecha;
    private int duracion;

    /**
     * tenemos un constructor de la clase reserva
     * @param idPista
     * @param fecha
     * @param duracion
     */
    public Reserva(int idPista, LocalDateTime fecha, int duracion) {
        this.idPista = idPista;
        this.fecha = fecha;
        this.duracion = duracion;
    }
/**
 * nos hace un return de la id de la pista
 * @return
 */
    public int getIdPista() {
        return idPista;
    }
/**
 * nos hace un return de la fecha
 * @return
 */
    public LocalDateTime getFecha() {
        return fecha;
    }
/**
 * nos hace un return de la duracion
 * @return
 */

    public int getDuracion() {
        return duracion;
    }
}