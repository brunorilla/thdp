package ejercicio1;

public class Persona {
 private String nombre;
 private String apellido;
 private String direccion;
 
public Persona(String nombre, String apellido, String direccion) {
	this.setNombre(nombre);
	this.setApellido(apellido);
	this.setDireccion(direccion);
	
}

@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + "]";
}

public Persona(String nombre) {
	this.nombre = nombre;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
 
}
