/**
 * @author Mario Cajas ROdriguez
 */


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entidades.Reserva;

public class SistemaReservasDeportivas {

    private List<Reserva> reservas;
    GestorIluminacion data = new GestorIluminacion();
	static final int MAX_PISTAS = 10; // Asumimos un máximo de 10 pistas
    /**
     * Crea una lista de arrays para las reservas y otro array para la iluminacion de tipo boolean
     */
    public SistemaReservasDeportivas() {
        reservas = new ArrayList<>();
        data.iluminacion = new boolean[MAX_PISTAS];
    }
/**
 * Constructor de la clase reservar pista
 * @param idPista identificador para la pista
 * @param fecha fecha en la que se raliza la reserva de la pista
 * @param duracion duracion en minutos de la reserva
 * @return true si se puede realizar la reserva o false si la pista ya ha sido reservada en esa fecha
 */
    public boolean reservarPista(Reserva reserva) {
        if (reserva.getIdPista() < 0 || reserva.getIdPista() >= MAX_PISTAS) {
            return false; // ID de pista inválido
        }
        for (Reserva r : reservas) {
            if (r.getIdPista() == reserva.getIdPista()&& esFechaDisponible(reserva.getFecha(), r)) {
                return false; // La pista ya está reservada en esa fecha
            }
        }
        reservas.add(reserva);
        return true;
    }
/**
 * Metodo que realiza la cancelacion de una reserva
 * @param idReserva identificador para saber cual pista cancela su reserva
 * @return true si la pista esta reservada y puede ser cancelada o false si la reserva no fue encontrada por lo que la reserva no pude ser cancelada
 */
    public boolean cancelarReserva(int idReserva) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getIdPista() == idReserva) {
                reservas.remove(i);
                return true;
            }
        }
        return false; // No se encontró la reserva
    }
/**
 * Metodo utilizado para la verificacion de la disponibilidad de las pistas
 * @param idPista identificador de pista para saber que pista se verifica
 * @param fecha para saber en que fecha esta hecha la reserva
 * @param hora para saber cuanto dura la reserva
 * @return true si la pista esta disponible o false si el idpista no es valido o si la pista no se encuentra disponible en esa fecha 
 */
    public boolean verificarDisponibilidad(int idPista, LocalDateTime fecha, String hora) {
        if (idPista < 0 || idPista >= MAX_PISTAS) {
            return false; // ID de pista inválido
        }
        for (Reserva r : reservas) {
            if (r.getIdPista() == idPista && esFechaDisponible(fecha, r)) {
                return false; // La pista no está disponible en esa fecha
            }
        }
        return true; // La pista está disponible
    }
private boolean esFechaDisponible(LocalDateTime fecha, Reserva r) {
	return r.getFecha().equals(fecha);
}
}