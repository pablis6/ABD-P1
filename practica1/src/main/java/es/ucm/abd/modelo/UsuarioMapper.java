package es.ucm.abd.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class UsuarioMapper extends AbstractMapper<Usuario>{

	public UsuarioMapper(DataSource ds) {
		super(ds);
	}

	@Override
	protected String getTableName() {
		return "Usuarios";
		
	}

	@Override
	protected String[] getColumnNames() {
		return new String[]{getKeyColumnName(), "Fecha", "Contraseña", "Foto"};
	}

	@Override
	protected String getKeyColumnName() {
		return "Nick";
	}

	@Override
	protected Usuario buildObject(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
