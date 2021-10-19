package test;
public class Auto {
	
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int n=0;
		for (int i = 0;i<asientos.length;i++) {
			if(asientos[i].color!=null) {
				n++;
			}
		}
		return n;
	}
	
	String verificarIntegridad() {
		Boolean a=true;
		for (int i = 0 ; i < asientos.length-1 ; i++ ) {
			if (!(asientos[i].registro==asientos[i+1].registro)) {
				a=false;
				break;
			}
		}
		if (motor.registro == this.registro && a==true) {
			return "Auto original";
		}else {
			return "Las piezas no son originales";
		}
	}
}

