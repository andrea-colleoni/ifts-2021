package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProvaDatabase {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// cerco il driver e lo carico
		//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		// in una stringa definisco i parametri della mia connessione al DB
		String connectionUrl = "jdbc:sqlserver://localhost:1433;" +  
				   "databaseName=20201203_ricette;user=itsar;password=password;";
		
		// dal driverManager che ha caricato il driver, ottengo una connessione al DB
		Connection con = DriverManager.getConnection(connectionUrl);
		
		// ho bisogno di un oggetto che trasporti il codice SQL su questa connessione
		Statement st = con.createStatement();
		ResultSet dati = st.executeQuery("select * from ricetta order by difficolta");
		System.out.println("risultati della query");
		System.out.println("------------------------------------------------");
	
		// finche ci sono dati da leggere
		while(dati.next()) {
			// ogni volta che uso next() il cursore si sposta in avanti di 1 record
			// il cursore "dati" è posizionato di volta in volta su un solo record
			// => nel ciclo while() io leggo iterativamente 1 record alla volta
			System.out.print(dati.getString("nome_ricetta"));
			System.out.println(" - difficoltà: " + dati.getInt("difficolta"));
		}
	}
}
