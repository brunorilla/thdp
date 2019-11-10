package ejercicio3;

public class Superheroe {
 private String nombre;
 private int fuerza;
 private int resistencia;
 private int superpoderes;
 
 public Superheroe(String nombre, int fuerza, int resistencia, int superpoderes) {
	 this.nombre = nombre;
	 this.fuerza = fuerza;
	 this.resistencia = resistencia;
	 this.superpoderes = superpoderes;
 }
 
 public String jugar(Superheroe rival) {
	 int counter_self = 0;
	 int counter_other = 0;
	 String winner = null;
		 if(this.getResistencia() > rival.getResistencia()) {
			 counter_self++;
		 } else {
			 counter_other++;
		 }
		 if(this.getFuerza() > rival.getFuerza()) {
			 counter_self ++;
		 } else {
			 counter_other ++;
		 }
		 if(this.getSuperpoderes() > rival.getSuperpoderes()) {
			 counter_self++;
		 } else {
			 counter_other++;
		 }
		 if(counter_self >= 2) {
			 winner = this.getNombre();
		 }  else if(counter_other >= 2) {
			 winner = rival.getNombre();
		 } else {
			 winner = "Empate";
		 }
		 return winner;
  }
 
 @Override
public String toString() {
	return "Superheroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia + ", superpoderes="
			+ superpoderes + "]";
}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getFuerza() {
			return fuerza;
		}
		public void setFuerza(int fuerza) {
			this.fuerza = fuerza;
		}
		public int getResistencia() {
			return resistencia;
		}
		public void setResistencia(int resistencia) {
			this.resistencia = resistencia;
		}
		public int getSuperpoderes() {
			return superpoderes;
		}
		public void setSuperpoderes(int superpoderes) {
			this.superpoderes = superpoderes;
		}
 }
