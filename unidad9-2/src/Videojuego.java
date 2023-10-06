
public class Videojuego implements Entregable {

	private final int HORAS = 10;
	private final boolean ENTRE = false;
	
    protected String titulo;
    protected int horas;
    protected boolean entregado;
    protected String genero;
    protected String compa;
    
	public Videojuego() {
		this.titulo = "";
		this.horas = HORAS;
		this.entregado = ENTRE;
		this.genero = "";
		this.compa = "";
	}
	
	public Videojuego(String titulo, int horas) {
		this.titulo = titulo;
		this.horas = horas;
		this.entregado = ENTRE;
		this.genero = "";
		this.compa = "";
	}
	
	public Videojuego(String titulo, int horas, String genero, String compa) {
		this.titulo = titulo;
		this.horas = horas;
		this.entregado = ENTRE;
		this.genero = genero;
		this.compa = compa;
	}
	
	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		this.entregado = true;
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		this.entregado = false;
	}

	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return entregado;
	}

	@Override
	public int compareTO(Object a) {
		// TODO Auto-generated method stub
		if (this.horas > (int)a) {
			return 1;
		}
		if ((this.horas < (int)a)) {
			return -1;
		}
		return 0;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getHoras() {
		return horas;
	}

	public String getGenero() {
		return genero;
	}

	public String getCompa() {
		return compa;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCompa(String compa) {
		this.compa = compa;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horas=" + horas + ", entregado=" + entregado + ", genero=" + genero
				+ ", compa=" + compa + "]";
	}

}
