package ar.edu.unlam.pb2.cuenta;

public class CajaAhorro extends Cuenta {

	int contador = 0;

	
	@Override
	public Double extraer(Double cantidad) {
		final int extra = 6;
		
		
		if (cantidad < saldo) {
			saldo = saldo - cantidad;
			this.contador = contador +1;
			if (contador > 4)
			saldo = saldo - extra;
		}
		
			
		return saldo;
	}

}
