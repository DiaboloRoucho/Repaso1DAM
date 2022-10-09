
public class DVD extends Multimedia {

	private String actor, actriz;

	public DVD(String titulo, String autor, Formato formato, double duracion, String actor, String actriz) {
		super(titulo, autor, formato, duracion);
		// TODO Auto-generated constructor stub
		this.actor = actor;
		this.actriz = actriz;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getActriz() {
		return actriz;
	}

	public void setActriz(String actriz) {
		this.actriz = actriz;
	}

	@Override
	public String toString() {
		return super.toString()+"DVD [actor=" + actor + ", actriz=" + actriz + "]";
	}

	
}
