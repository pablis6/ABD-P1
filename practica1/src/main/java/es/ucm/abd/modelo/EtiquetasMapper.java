package es.ucm.abd.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class EtiquetasMapper extends AbstractMapper<Etiquetas>{

	public EtiquetasMapper(DataSource ds) {
		super(ds);
	}

	@Override
	protected String getTableName() {
		return "Etiqueta";
	}

	@Override
	protected String[] getColumnNames() {
		return new String[]{getKeyColumnName(), "Etiqueta"};
	}

	@Override
	protected String getKeyColumnName() {
		return "Id";
	}

	@Override
	protected Etiquetas buildObject(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
