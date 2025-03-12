package ejer;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GestorTiendaTest {

	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		GestorTienda gt = new GestorTienda();
	}

	
	@Test
	void calcularDescuento() {
		GestorTienda gt = new GestorTienda();
		
		assertEquals(10.0,gt.calcularDescuento(100.0, 11));
		assertEquals(5,gt.calcularDescuento(100.0, 5));
		assertEquals(0.0,gt.calcularDescuento(100.0, 2));
	}
	
	@Test
	void categorizarProducto() {
		GestorTienda gt = new GestorTienda();
		assertEquals("Económico",gt.categorizarProducto(9.80));
		assertEquals("Estándar",gt.categorizarProducto(49.99));
		assertEquals("Premium",gt.categorizarProducto(99.99));
	}
	
	@Test
	void buscarProducto() {
		GestorTienda gt = new GestorTienda();
		String[] resu = {"TV"};
		assertEquals("TV", gt.buscarProducto(resu, "TV"));
		assertNull(gt.buscarProducto(resu, "Movil"));
	}
		


}
