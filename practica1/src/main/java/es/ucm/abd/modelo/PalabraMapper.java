package es.ucm.abd.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class PalabraMapper extends AbstractMapper<Palabra>{

	public PalabraMapper(DataSource ds) {
		super(ds);
	}

	@Override
	protected String getTableName() {
		return "Palabra";
	}

	@Override
	protected String[] getColumnNames() {
		return new String[]{getKeyColumnName(), "Palabara", "Enunciado", "Foto"};
	}

	@Override
	protected String getKeyColumnName() {
		return "Id";
	}

	@Override
	protected Palabra buildObject(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
