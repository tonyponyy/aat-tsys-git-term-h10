
public class Serie {
	private final int TEMPORADAS_DEFECTO = 3;
	private final boolean ENTREGADO_DEFECTO = false;
	
	protected String titulo;
	protected int n_temporadas;
	protected boolean entregado;
	protected String genero;
	protected String creador;
	

	public Serie() {
		super();
		this.titulo ="";
		this.n_temporadas =TEMPORADAS_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.creador = "";
	}


	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.n_temporadas = TEMPORADAS_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.creador = "";
	}
	
	public Serie(String titulo, String creador, int n_temporadas,String genero) {
		this.titulo = titulo;
		this.creador = creador;
		this.n_temporadas = n_temporadas;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = genero;
		this.creador = creador;
	}


	public String getTitulo() {
		return titulo;
	}

	public int getN_temporadas() {
		return n_temporadas;
	}

	public String getGenero() {
		return genero;
	}

	public String getCreador() {
		return creador;
	}


	@Override
	public String toString() {
		return "Serie [TEMPORADAS_DEFECTO=" + TEMPORADAS_DEFECTO + ", ENTREGADO_DEFECTO=" + ENTREGADO_DEFECTO
				+ ", titulo=" + titulo + ", n_temporadas=" + n_temporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}
	
	
}