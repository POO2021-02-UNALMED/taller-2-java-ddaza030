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
			if(asientos[i]!=null) {
				n++;
			}
		}
		return n;
	}
	
	
	String verificarIntegridad() {
		int[] n= new int[this.cantidadAsientos()];
		int m = 0;
		for (int i = 0;i<asientos.length;i++) {
			if(asientos[i]!=null) {
				n[m]=asientos[i].registro;
				m++;
			}
		}
		Boolean a=true;
		for (int i = 0 ; i < n.length-1 ; i++ ) {
			if (n[i]!=n[i+1]) {
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

