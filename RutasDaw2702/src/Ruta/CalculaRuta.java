package Ruta;

import java.util.List;

public class CalculaRuta {
	
	public int rutas = 0;
    public String rutaMasRapida(String origen, String destino) {
            // Simulación de cálculo de ruta más rápida
        return "Ruta 1";
    }

    public String rutaMasEconomica(String origen, String destino, double presupuesto) {
        // Simulación de cálculo de ruta más económica
        return "Ruta 2";
    }

    public String rutaConLugaresDeInteres(String origen, String destino, List<String> lugaresDeInteres) {
        // Simulación de cálculo de ruta con lugares de interés
        return "Ruta 3";
    }

    public String rutaConGasolineras(String origen, String destino, int numGasolineras) {
        // Simulación de cálculo de ruta con gasolineras
        return "Ruta 4";
    }
}
