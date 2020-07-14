package juegoMesa;

public class Operacion {
	private int num;
	private TipoOp tipo;
	private int cant;
	
	Operacion(int num, TipoOp tipo, int cant){
		this.num = num;
		this.tipo = tipo;
		this.cant = cant;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public TipoOp getTipo() {
		return tipo;
	}
	public void setTipo(TipoOp tipo) {
		this.tipo = tipo;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	
	
	
}
