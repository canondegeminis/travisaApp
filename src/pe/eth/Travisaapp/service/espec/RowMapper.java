package pe.eth.Travisaapp.service.espec;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMapper<T> {
  
  T rowToBean(ResultSet rs) throws SQLException;
  
  
}
