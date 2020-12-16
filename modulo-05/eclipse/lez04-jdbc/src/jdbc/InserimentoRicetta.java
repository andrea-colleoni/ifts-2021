package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InserimentoRicetta {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// cerco il driver e lo carico
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		// in una stringa definisco i parametri della mia connessione al DB
		String connectionUrl = "jdbc:sqlserver://localhost:1433;" +  
				   "databaseName=20201203_ricette;user=itsar;password=password;";
		
		// dal driverManager che ha caricato il driver, ottengo una connessione al DB
		Connection con = DriverManager.getConnection(connectionUrl);
		
		// ho bisogno di un oggetto che trasporti il codice SQL su questa connessione
		Statement st = con.createStatement();
		
		String sql = "INSERT INTO [dbo].[ricetta] ([nome_ricetta] ,[difficolta] ,[id_categoria] ,[id_cuoco])";
		sql += " VALUES ('";
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nome della ricetta: ");
		sql += scanner.nextLine();
		sql += "', ";
		System.out.print("Difficolta: ");
		sql += scanner.nextLine();
		sql += ", ";
		System.out.print("Categoria: ");
		sql += scanner.nextLine();
		sql += ", NULL)";
		
		//ZuSystem.out.println("query: " + sql);
		// executeUpdate serve per eseguire INSERT, UPDATE e DELETE
		st.executeUpdate(sql);

	}

}
