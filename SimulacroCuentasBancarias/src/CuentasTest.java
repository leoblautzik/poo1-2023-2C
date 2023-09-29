import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentasTest {

	@Test
	void CATest() {
		Cuenta ca = new CajaDeAhorro(12345678);
		assertEquals(0, ca.getSaldo());
		ca.depositar(100000);
		assertEquals(100000, ca.getSaldo());
		ca.extraer(1000);
		assertEquals(99000, ca.getSaldo());
		Error thrown = assertThrows(Error.class,() -> ca.extraer(100000));
		
				
	}
	@Test
	void CCTest() {
		Cuenta cc = new CuentaCorriente(12345678, 200000);
		assertEquals(0, cc.getSaldo());
		cc.depositar(100000);
		cc.extraer(150000);
		assertEquals(-50000, cc.getSaldo());
		cc.extraer(150000);
		assertEquals(-200000, cc.getSaldo());
		
	}
	
	@Test
	void transferenciaTest() {
		Cuenta ca = new CajaDeAhorro(12345678);
		ca.depositar(100);
		Cuenta cc = new CuentaCorriente(12345678, 200000);
		ca.transferir(cc, 10);
		assertEquals(10, cc.getSaldo());
		assertEquals(90, ca.getSaldo());
		
		cc.transferir(ca, 10000);
		
		assertEquals(-9990, cc.getSaldo());
		assertEquals(10090, ca.getSaldo());
		
	}
	@Test
	void bancoTest() {
		Banco city = new Banco();
		Cuenta cuentaDeLeo = city.abrirCajaDeAhorro(12345678);
		Cuenta cuentaDeVictor =  city.abrirCuentaCorriente(20456723, 1000);
		cuentaDeLeo.depositar(2000);
		cuentaDeVictor.depositar(500);
		city.listarCuentas();
		cuentaDeVictor.transferir(cuentaDeLeo, 1000);
		assertEquals(500,city.totalSaldoEnDescubierto());
		
		
	
	}


}
