package cosa;

public class Empleados {

	String nombre, direccion;
	int edad;
	double salario;
	public Empleados() {
		super();
	}
	public Empleados(String nombre, String direccion, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
		this.salario = salario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + ", salario=" + salario
				+ "]";
	}
	
}
