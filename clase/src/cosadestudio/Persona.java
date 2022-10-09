package cosadestudio;

public class Persona {

	String nombre, apellidos;
	int a�onac;
	
	public Persona() {
		this.nombre="";
		this.apellidos="";
		this.a�onac=0;
	}
	public Persona(String nombre, String apellidos, int a�onac) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.a�onac = a�onac;
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
	public int getA�onac() {
		return a�onac;
	}
	public void setA�onac(int a�onac) {
		this.a�onac = a�onac;
	}

	public void imprime(Persona persona) {
		System.out.println("Datos personales: "+persona.getNombre()+" "+persona.getApellidos()+" naci� en el a�o"+persona.getA�onac());
	}
	
}
