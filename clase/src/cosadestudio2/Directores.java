package cosadestudio2;

public class Directores extends Gerente {
	
	boolean secretaria;

	public Directores(int cod, String nombre, String dep, boolean secretaria) {
		super(cod, nombre, dep);
		this.nivel=20;
		this.secretaria=secretaria;
		this.salbase=salbase*nivel/100+500;	
	}
	

}
