
public class GestorIluminacion {
	public boolean[] iluminacion;

	public GestorIluminacion() {
	}

	/**
	 * Metodo utilizado para la activacion de la iluminacion
	 * @param sistemaReservasDeportivas TODO
	 * @param idPista identificador de pista para saber que pista iluminar
	 * @return true si la pista fue encontrada o false si la pista no es encontrada
	 */
	    public boolean EncenderLuces(SistemaReservasDeportivas sistemaReservasDeportivas, int idPista) {
	        if (idPista < 0 || idPista >= SistemaReservasDeportivas.MAX_PISTAS) {
	            return false; // ID de pista inválido
	        }
	        iluminacion[idPista] = true;
	        return true;
	    }

	/**
	 * Metodo que se utiliza para desactivar la iluminacion
	 * @param sistemaReservasDeportivas TODO
	 * @param idPista identificador para desactivar la iluminacion
	 * @return true si la pista fue encontrada o false si la pista no es encontrada
	 */
	    public boolean ApagarLuces(SistemaReservasDeportivas sistemaReservasDeportivas, int idPista) {
	        if (idPista < 0 || idPista >= SistemaReservasDeportivas.MAX_PISTAS) {
	            return false; // ID de pista inválido
	        }
	        iluminacion[idPista] = false;
	        return true;
	    }
}