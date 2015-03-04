package modelo;

import java.sql.Date;

public class Usuario {

	private String nick;
	private String pass;
	private Date fecha;
	private Byte[] foto;
	
	public Usuario(String nick, String pass, Date fecha, Byte[] foto) {
		this.nick = nick;
		this.pass = pass;
		this.fecha = fecha;
		this.foto = foto;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Byte[] getFoto() {
		return foto;
	}

	public void setFoto(Byte[] foto) {
		this.foto = foto;
	}
		
}
