package pilas_colas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TerminalDeTeletipoTest {

	@Test
	void ejemploTest() {
		TerminalDeTeletipo tdt = new TerminalDeTeletipo();
		String tira = "abc/d//e";
		assertEquals("ae", tdt.procesarTira(tira));
		
	}
	
	@Test
	void conATest() {
		TerminalDeTeletipo tdt = new TerminalDeTeletipo();
		String tira = "abc&de";
		assertEquals("de", tdt.procesarTira(tira));
		
	}
	
	@Test
	void laTiraQuedaVaciaTest() {
		TerminalDeTeletipo tdt = new TerminalDeTeletipo();
		String tira = "abc&d//e";
		assertEquals("e", tdt.procesarTira(tira));
		
	}
	@Test
	void comienzaConBarrasTest() {
		TerminalDeTeletipo tdt = new TerminalDeTeletipo();
		String tira = "///abcde";
		assertEquals("abcde", tdt.procesarTira(tira));
		
	}
	
	@Test
	void comienzaConATest() {
		TerminalDeTeletipo tdt = new TerminalDeTeletipo();
		String tira = "&abcde";
		assertEquals("abcde", tdt.procesarTira(tira));
		
	}
	
	@Test
	void comienzaConAyTerminaconBarraTest() {
		TerminalDeTeletipo tdt = new TerminalDeTeletipo();
		String tira = "&abcde/";
		assertEquals("abcd", tdt.procesarTira(tira));
		
	}

}
