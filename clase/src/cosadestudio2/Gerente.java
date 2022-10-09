package cosadestudio2;

public class Gerente extends Empleado {

	int nivel;
	public Gerente(int cod, String nombre, String dep) {
		super(cod, nombre, dep);
		this.nivel=10;
		this.salbase=super.salbase*nivel/100;	
		
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	
	
}
