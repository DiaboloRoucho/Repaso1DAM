package pacientes;

public class Ficha implements Comparable<Ficha>{

	private String numeroHistoria, nombre, diagnostico;

	public Ficha(String numeroHistoria, String nombre, String diagnostico) {
		super();
		this.numeroHistoria = numeroHistoria;
		this.nombre = nombre;
		this.diagnostico = diagnostico;
	}

	public String getNumeroHistoria() {
		return numeroHistoria;
	}

	public void setNumeroHistoria(String numeroHistoria) {
		this.numeroHistoria = numeroHistoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	@Override
	public String toString() {
		return "Ficha [numeroHistoria=" + numeroHistoria + ", nombre=" + nombre + ", diagnostico=" + diagnostico + "]";
	}

	@Override
	public int compareTo(Ficha n) {
		if (n.numeroHistoria.compareToIgnoreCase(numeroHistoria)==0) {
			return 0;
		} else if (n.numeroHistoria.compareToIgnoreCase(numeroHistoria)<0) {
			return 1;
		} else {
			return -1;
		}
	}


	
	
}
