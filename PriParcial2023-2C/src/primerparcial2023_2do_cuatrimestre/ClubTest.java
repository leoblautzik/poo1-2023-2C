package primerparcial2023_2do_cuatrimestre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClubTest {

	@Test
	void clubTest() {
		
		Club miclub = new Club(5);
		
		miclub.agregarSocio(new Tenista(123, 4));
		miclub.agregarSocio(new Futbolista(124, 5));
		miclub.listarPlanillaDesocios();
	}
}
