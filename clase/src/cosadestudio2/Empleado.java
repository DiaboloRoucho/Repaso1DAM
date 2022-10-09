package cosadestudio2;

public class Empleado {

	int cod;
	String nombre;
	String dep;
	double salbase;
	public Empleado(int cod, String nombre, String dep) {
		this.cod = cod;
		this.nombre = nombre;
		this.dep = dep;
		this.salbase = 1000;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public double getSalbase() {
		return salbase;
	}
	public void setSalbase(double salbase) {
		this.salbase = salbase;
	}
	public void visdatos() {
		System.out.println(this.cod+" "+this.nombre+" "+this.dep);
	}
	
	
}

