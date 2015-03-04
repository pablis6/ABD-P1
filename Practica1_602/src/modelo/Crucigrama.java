package modelo;

import java.sql.Date;

public class Crucigrama {

	private int id;
	private String titulo;
	private Date fecha;
	
	public Crucigrama(int id, String titulo, Date fecha){
		this.id = id;
		this.titulo = titulo;
		this.fecha = fecha;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
