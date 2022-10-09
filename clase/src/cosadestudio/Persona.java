package cosadestudio;

public class Persona {

	String nombre, apellidos;
	int añonac;
	
	public Persona() {
		this.nombre="";
		this.apellidos="";
		this.añonac=0;
	}
	public Persona(String nombre, String apellidos, int añonac) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.añonac = añonac;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getAñonac() {
		return añonac;
	}
	public void setAñonac(int añonac) {
		this.añonac = añonac;
	}

	public void imprime(Persona persona) {
		System.out.println("Datos personales: "+persona.getNombre()+" "+persona.getApellidos()+" nació en el año"+persona.getAñonac());
	}
	
}
