package es.ucm.abd.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class CrucigramaMapper extends AbstractMapper<Crucigrama>{

	public CrucigramaMapper(DataSource ds) {
		super(ds);
	}

	@Override
	protected String getTableName() {
		return "Crucigrama";
	}

	@Override
	protected String[] getColumnNames() {
		return new String[]{getKeyColumnName(), "Titulo", "Fecha"};
	}

	@Override
	protected String getKeyColumnName() {
		return "Id";
	}

	@Override
	protected Crucigrama buildObject(ResultSet rs) throws SQLException {
		// TODO
		return null;
	}

}
