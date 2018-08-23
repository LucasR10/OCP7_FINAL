package br.com.ocjp7.demos;

import java.sql.SQLException;

public interface IDemoConexaoComAutoClosable extends AutoCloseable  {
	
	void conexaoMysql() throws SQLException;
	
}
