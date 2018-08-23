package br.com.ocjp7.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.JoinRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

public class JDBC {

	private static String SQL;

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
 
		//Construindo uma conexão 1
		 Connection c1 = DriverManager. getConnection("jdbc:derby://localhost:1521/MyDB");
		 
		 Properties props = new Properties();
		 props.put("user", "user1");
		 props.put("password", "12345");
		 props.put("", "");
		
		 //Construindo uma conexão 2
		Connection c2 = DriverManager. getConnection("jdbc:derby://localhost:1521/MyDB" , props );
		
		//Construindo uma conexão 3
		Connection c3 = DriverManager. getConnection("jdbc:derby://localhost:1521/MyDB","user","pass");
		
		 DataSource dfDataSource;
		// dfDataSource.
		 
		 //cria um instrução SQL
		  Statement createStatement = c2.createStatement();
		  createStatement.executeQuery("SELCT * FROm TB ");
		 
		  ResultSet executeQuery = createStatement.executeQuery(SQL);
		  
		  boolean execute = createStatement.execute(SQL);
		  
		  int executeUpdate = createStatement.executeUpdate(SQL);
		  
		  PreparedStatement prepareStatement = c2.prepareStatement(SQL);
		  ResultSet reult = prepareStatement.getResultSet();
		  
	  /** Metodos ResultSet mais comumente utilizados são; */
		   
		   reult.getBoolean("colunaName");
		   reult.getBoolean(1);
		   
		   reult.getFloat("nomeColuna");
		   reult.getFloat(2);
		   
		   reult.getDouble("nomeColuna");
		   reult.getDouble(3);
		   
		   //*obs: é getInt e não get Integer
		   reult.getLong("nomeColuna");
		   reult.getLong(2);
		   
		   reult.getDate("nomeColuna");
		   reult.getDate(2);
		   
		   reult.getString("nomeColuna");
		   reult.getString(2);
		   
		   
		   reult.getTime("nomeColuna");
		   reult.getTime(2);
		   
		   
		   reult.getTimestamp("nomeColuna");
		   reult.getTimestamp(2);
		   
		   
		   reult.getObject("nomeColuna");
		   reult.getObject(2);
		   
		   
		   //verificando se banco tem suporte a s operaçoes de cursor;
		   DatabaseMetaData meta = c2.getMetaData();//usando connections
		   //verificando o suporte.
		  boolean TYPE_FORWARD_ONLY= meta.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
		  boolean TYPE_SCROLL_INSENSITIVE = meta.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		  boolean TYPE_SCROLL_SENSITIVE = meta.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); 
	     
		 
		  //efetuandia tualização via resultSet
		   String queryUpdate = "update * FROM TB WHERE VALOE > 10";
		  
		   c2.prepareStatement(queryUpdate).executeQuery();
		   c2.createStatement().executeQuery(queryUpdate);
		  
		   while( reult.next() ){
		    	if( reult.getInt("valor") > 10){
		    		reult.updateFloat("valor_unt", 13.40F);
		    		reult.cancelRowUpdates();//calcela a atualização.
		    		reult.updateRow();//efetua a atualizacao.
		    	}
		    }
		  
		   ///maneiras de chamar funcções em banco de dados.
		   CallableStatement csmt = c2.prepareCall("");
		   csmt.registerOutParameter(1, java.sql.Types.DOUBLE);
		   csmt.setInt(1, 950);
		   csmt.execute();
		   csmt.getDouble(1);
		   
		   //se vc não sabe se o procedimento retorna um result set pode fazer a confiçõa.
		   
		   if( csmt.getMoreResults() ){
			  ResultSet result = csmt.getResultSet();
		   }
		   
		   //criando objetos rowSets: jdbcRowSet
		   JdbcRowSet rows =  RowSetProvider.newFactory().createJdbcRowSet();
		   rows.setCommand("SELECT * FROM ");
		   rows.setUrl("jdbc:mysql://localhsot?1527/docs");
		   rows.setUsername("docs");
		   rows.setPassword("do14144444");
		   rows.execute();
		   
		   //iserindo dados
		   
		   rows.moveToInsertRow();
		   rows.updateInt("codigo", 25);
		   rows.updateString("nome", "Gabriela");
		   rows.insertRow();
		   
		   
		   //atualizando a ultima linha do banco de dados.
		   rows.last();
		   rows.updateString("nome", "Jhon");
		   rows.updateRow();
		   
		   while( rows.next() ){
			   //processando...
		   }
		   
		   
		   RowSetFactory newFactory = RowSetProvider.newFactory();
		   
		   // implementando a interface RowSSetListener:
		   RowSetListener listener = new RowSetListener() {
			
			@Override
			public void rowSetChanged(RowSetEvent event) {
		      // recebe um evento para cadas movimentação doc curos.
			}
			
			@Override
			public void rowChanged(RowSetEvent event) {
				//para cada linha atualizada.
			}
			
			@Override
			public void cursorMoved(RowSetEvent event) {
				//recebe um evento com row set é atualizado.
			}
		  };
		  //adicionado o listener
		  rows.addRowSetListener(listener);
		  
		  //Obtendo objetos  CacheRowSer
		  
		  //objetos RowSets
		   FilteredRowSet filteredRowSet = RowSetProvider.newFactory().createFilteredRowSet();
		   JoinRowSet createJoinRowSet = RowSetProvider.newFactory().createJoinRowSet();
		   JdbcRowSet createJdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
		   WebRowSet createWebRowSet = RowSetProvider.newFactory().createWebRowSet();
		   
		  //cacheRow: ideal para trabalha com dispositivos offine;
		   CachedRowSet createCachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
		  
		   createCachedRowSet.setCommand("SELECT * FROM ");//consulta para RowSet
		   createCachedRowSet.setUrl("jdbc:mysql://localhsot?1527/docs");//URL JDBC
		   createCachedRowSet.setUsername("docs");//Nome do Usuário JDBC
		   createCachedRowSet.setPassword("do14144444");//Senha do JDBC
		   createCachedRowSet.execute();//Preenche o CacheRowSet com Dados.
		   
		   //uma vex que feito mudancas, atualizações, inserções, remoção.
		    createCachedRowSet.acceptChanges();//aceitas as mudancas.
		   
		    String ISERT_1 =  "INSERT USUARIO INTO VALUES(1,'MARIA', 12) ";
		    String ISERT_2 =  "INSERT ENDERECOINTO VALUES(2, 'RUA DAS FLORES') ";
		    
		    try{
		    c1.setAutoCommit(false);//iniciando um transação;
		    ///fazendo o que tem que fazer ..
		    prepareStatement.executeQuery(ISERT_1);
		    prepareStatement.executeQuery(ISERT_2);
		  
		    //cria um ponto de salvamento para os dois isertisa cima ate agora.
		    Savepoint save = c1.setSavepoint();
		    
		    c1.commit();//efetiva a transação inteira.
		    }catch(Exception e){
		    //se der falha durante a execução então pode user: rollback;
		    	c1.rollback();
		    }
		    
		    
		    
		    
		    
		    
		    
	}

}


