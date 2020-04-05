public class FuncionesUsuario {
	public double getImpuestos(Usuario unUsuario) {
		double impuestosSinDescuentos;
		double descuento;
		double impuestos;
		if(unUsuario.getEdad()<18) {
			impuestosSinDescuentos = 0;
		}
		if((unUsuario.getEdad()>=18) && (unUsuario.getEdad()<30)) {
			impuestosSinDescuentos = 2000;
		}
		if((unUsuario.getEdad()>=30) && (unUsuario.getEdad()<65)) {
			impuestosSinDescuentos = 7000;
		}
		if(unUsuario.getEdad()>=65) {
			impuestosSinDescuentos = 2000;
		}
		if(impuestosSinDescuentos != 0 ) {
			descuento = unUsuario.getCantHijos()*0.03;
			if(descuento >= 0.5) {
				decuento = 0.5;
			}
			impuestos = impuestosSinDescuentos*decuento
		} else {
			impuestos = impuestosSinDescuentos;
		}
		return impuestos;
	}
	public void cobroDeSueldo(int servicios, Usuario unUsuario){
		unUsuario.setSaldo(unUsuario.getSaldo()+servicios);
	}
}