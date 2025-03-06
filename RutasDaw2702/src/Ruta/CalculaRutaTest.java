package Ruta;

import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculaRutaTest {

	
	
	static CalculaRuta calculaRuta;
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		calculaRuta = new CalculaRuta();
	}
	@BeforeEach
	public static void setUp() throws Exception {
		calculaRuta = new CalculaRuta();
	}

	@Test
	void testRutaMasEconomica() {
		fail("Not yet implemented");
	}

	@Test
	void testRutaConLugaresDeInteres() {
		fail("Not yet implemented");
	}

	@Test
	void testRutaConGasolineras() {
		fail("Not yet implemented");
	}

}
