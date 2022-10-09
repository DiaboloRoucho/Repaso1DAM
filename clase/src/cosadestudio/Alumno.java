package cosadestudio;

public class Alumno extends Persona {

	protected String grupo;
	protected Horario horario;
	
	public Alumno(String nombre, String apellidos, int añonac, String grupo, Horario horario) {
		super();
		this.grupo=grupo;
		this.horario=horario;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public Horario getHorario() {
		return horario;
	}
	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	

}
	