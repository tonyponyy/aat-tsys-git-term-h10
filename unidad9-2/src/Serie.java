
public class Serie implements Entregable {
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
	
	public Serie(String titulo, String genero, int n_temporadas,String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.n_temporadas = n_temporadas;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = genero;
		this.creador = creador;
	}
	public boolean compareTo() {
		boolean resultado = true;
		
		return resultado;
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
	
	@Override
	public int compareTO(Object a) {
        // TODO Auto-generated method stub
        if (this.n_temporadas > ((Serie)a).getN_temporadas()) {
            return 1;
        }
        if (this.n_temporadas < ((Serie)a).getN_temporadas()) {
            return -1;
        }
        return 0;
    }
	
	@Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }
	
	
}