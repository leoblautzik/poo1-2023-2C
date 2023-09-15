package profesionales;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProfesionalesTest {

	@Test
	void medicoTest() {
		Profesional chapatin = new Medico("Romualdo", "Chapatin");
		assertEquals(500000, chapatin.getHonorario(), 0.001);
		
	}
	@Test
	void cirujanoTest() {
		Profesional cureta = new Cirujano("Agustin", "Cureta");
		assertEquals(625000, cureta.getHonorario(), 0.001);
		
	}
	
	@Test
	void cirujanoCardioTest() {
		Profesional venoso = new CirujanoCardiovascular("Sangriento", "Venoso");
		assertEquals(781250, venoso.getHonorario(), 0.001);
		
	}
	
	@Test
	void dentistaTest() {
		Profesional molar = new Dentista("Dolores", "Molar");
		assertEquals(500000, molar.getHonorario(), 0.001);
		
	}
	@Test
	void endodoncistaTest() {
		Profesional perno = new Endodoncista("Profundo", "Perno");
		assertEquals(625000, perno.getHonorario(), 0.001);
		
	}
	

}
