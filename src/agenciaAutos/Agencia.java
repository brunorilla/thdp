package agenciaAutos;



public class Agencia {
	private float[][] totVtas;
	private Auto[] vecAutos;
	private int lugaresLibres;
	private static final float IMP_RODAMIENTO = 0.05f;
	private static final float LIM_RODAMIENTO = 80000.00f;
	private static final float LIM_IVA_20 = 100000.00f;

	Agencia(int filaVtas, int colVtas, int cantAut) {
		this.totVtas = new float[filaVtas][colVtas];
		this.vecAutos = new Auto[cantAut];
		this.lugaresLibres = cantAut;
	}

	public float calcularPrecioFinal(Auto auto) {
		float precio = auto.getPrecio();
		precio = calcularIva(precio);
		precio = calcularImpuesto(precio, auto.getTipo());
		System.out.println("El precio final del auto [PATENTE= " + auto.getPat() + "] es $" + precio);
		return precio;

	}

	public float calcularIva(float precio) {
		if (precio > LIM_IVA_20) {
			precio = precio * 1.20f;
		} else {
			precio = precio * 1.16f;
		}
		return precio;
	}

	public float calcularImpuesto(float precio, int tipo) {
		if (tipo == 2 || tipo == 3 && precio > LIM_RODAMIENTO) {
			precio += precio * IMP_RODAMIENTO;
		} else if (precio < LIM_RODAMIENTO) {
			precio = precio - precio * IMP_RODAMIENTO;
		}
		return precio;
	}

	public void agregarAuto(Auto auto) {
		System.out.println("Empezando a agregar autos");
		if (getLugaresLibres() > 0) {
			System.out.println("Lugares libres=" + getLugaresLibres());
			getVecAutos()[getLugaresLibres() - 1] = auto;
			setLugaresLibres();
		} else {
			System.out.println("No hay más lugares libres");
		}
	}

	public void generarTotVtas() {
		float[][] auxtotVtas;
		float aux_pfinal;

		for (int i = 0; i < getVecAutos().length; i++) {
			auxtotVtas = getTotVtas();
			aux_pfinal = calcularPrecioFinal(getVecAutos()[i]);
			auxtotVtas[(int) getVecAutos()[i].getVendedor()][(int) getVecAutos()[i].getZona()] += aux_pfinal;
			setTotVtas(auxtotVtas);
		}
	}

	public void mostrarTotVtas() {
		String[] aux = { "VENDEDOR", "ZONA 1", "ZONA 2", "ZONA 3", "ZONA 4", "ZONA 5" };
		for (int i = 0; i < aux.length; i++) {
			System.out.print("\t" +aux[i]+ "\t");
		}
		System.out.print("\n");
		for(int i = 0; i < getTotVtas().length; i++) {
			System.out.print("\n");
			System.out.print("\t"+(i+1)+ "\t");
			for (int j = 0; j < getTotVtas()[i].length; j++) {
				System.out.print("\t"+getTotVtas()[i][j] +"\t");
				
			}
		}
	}

	public float[][] getTotVtas() {
		return totVtas;
	}

	public void setTotVtas(float[][] totVtas) {
		this.totVtas = totVtas;
	}

	public Auto[] getVecAutos() {
		return vecAutos;
	}

	public void setVecAutos(Auto[] vecAutos) {
		this.vecAutos = vecAutos;
	}

	public int getLugaresLibres() {
		return lugaresLibres;
	}

	public void setLugaresLibres() {
		if (getLugaresLibres() == 0) {
			System.out.println("No hay más lugar");
		} else {
			this.lugaresLibres--;
		}
	}

}
