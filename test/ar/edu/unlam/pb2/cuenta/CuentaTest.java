package ar.edu.unlam.pb2.cuenta;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CuentaTest {

	@Test
	public void cuentaSueldo() {
		Cuenta cuenta1 = new CuentaSueldo();
		cuenta1.depositar(500.0);
		cuenta1.depositar(500.0);
		cuenta1.depositar(500.0);
		Double valorEsperado1 = 1500.0;
		Assert.assertEquals(valorEsperado1, cuenta1.getSaldo());
		cuenta1.extraer(300.0);
		Double valorEsperado2 = 1200.0;
		Assert.assertEquals(valorEsperado2, cuenta1.getSaldo());
	}

	@Test
	public void cajaDeAhorro() {

		Cuenta cuenta2 = new CajaAhorro();

		cuenta2.depositar(500.0);
		Double valorEsperado1 = 500.0;
		Assert.assertEquals(valorEsperado1, cuenta2.getSaldo());

		cuenta2.extraer(50.0);
		cuenta2.extraer(50.0);
		cuenta2.extraer(50.0);
		cuenta2.extraer(50.0);
		cuenta2.extraer(50.0);

		Double valorEsperado2 = 244.0;
		Assert.assertEquals(valorEsperado2, cuenta2.getSaldo());
	}

	@Test
	public void cuentaCorreinte() {

		Cuenta cuenta3 = new CuentaCorriente();

		cuenta3.depositar(500.0);
		Double valorEsperado1 = 500.0;
		Assert.assertEquals(valorEsperado1, cuenta3.getSaldo());

		cuenta3.extraer(600.0);
		Double valorEsperado2 = -105.0;
		Assert.assertEquals(valorEsperado2, cuenta3.getSaldo());

	}

}
