
enum Formato {dvd,mp3,cdaudio,avi}
public class Multimedia {

	private String titulo, autor;
	private Formato formato;
	private double duracion;
	public Multimedia(String titulo, String autor, Formato formato, double duracion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public Formato getFormato() {
		return formato;
	}
	public double getDuracion() {
		return duracion;
	}
	@Override
	public String toString() {
		return "Multimedia [titulo=" + titulo + ", autor=" + autor + ", formato=" + formato + ", duracion=" + duracion
				+ "]";
	}
	
	
}
