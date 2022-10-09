enum Genero{rock,funk,pop}
public class CD extends Multimedia {

	private Genero genero;

	public CD(String titulo, String autor, Formato formato, double duracion, Genero genero) {
		super(titulo, autor, formato, duracion);
		// TODO Auto-generated constructor stub
		this.genero=genero;
	}
	
}
