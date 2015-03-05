package es.ucm.abd.modelo;

public class Palabra {

	private int id;
	private String palabra;
	private String enunciado;
	private Byte[] foto;
	
	public Palabra(int id, String palabra, String enunciado, Byte[] foto) {
		this.id = id;
		this.palabra = palabra;
		this.enunciado = enunciado;
		this.foto = foto;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPalabra() {
		return palabra;
	}
	
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	
	public String getEnunciado() {
		return enunciado;
	}
	
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	
	public Byte[] getFoto() {
		return foto;
	}
	
	public void setFoto(Byte[] foto) {
		this.foto = foto;
	}
}
