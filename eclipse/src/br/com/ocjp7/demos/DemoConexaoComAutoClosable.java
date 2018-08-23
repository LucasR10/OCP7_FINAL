package br.com.ocjp7.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoConexaoComAutoClosable implements IDemoConexaoComAutoClosable {

	private Connection con;

	@Override
	public void close() throws Exception {
		System.out.println(" Fechar conexao...ok");
	}

	@Override
	public void conexaoMysql() throws SQLException {
		con = DriverManager.getConnection("", "", "");//
	}

	public static void main(String[] args) {
        
		try( IDemoConexaoComAutoClosable d = new DemoConexaoComAutoClosable( ) ) {
			d.conexaoMysql();
			System.out.println(" try dados listados");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
