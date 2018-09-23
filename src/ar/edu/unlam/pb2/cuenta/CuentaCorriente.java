package ar.edu.unlam.pb2.cuenta;

public class CuentaCorriente extends Cuenta {

	private final Integer DESCUBIERTO = 150;
	private final Double PORCENTAJE = 0.05;

	
	@Override
	public Double extraer(Double cantidad) {
		if (cantidad < saldo) {
			saldo = saldo - cantidad;
		}

		else {
			if (cantidad <= saldo + DESCUBIERTO) {
				saldo = saldo - cantidad;
				saldo = saldo + (saldo * PORCENTAJE);
			} else {
				System.out.println("NO TENES MAS PLATA");
			}

		}

		return saldo;
	}

}
