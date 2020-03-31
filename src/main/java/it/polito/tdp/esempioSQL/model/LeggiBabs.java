package it.polito.tdp.esempioSQL.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LeggiBabs {
	
	public void run() {
		String jdbcURL = "jdbc:mysql://localhost/babs?user=root";
		
		try {
			Connection conn = DriverManager.getConnection(jdbcURL);
			
			Statement st = conn.createStatement();
			
			String  sql = "SELECT NAME FROM station ";
			
			ResultSet res = st.executeQuery(sql);
			
			while(res.next()){
				String nomeStazione =res.getString("name");
				
				System.out.println(nomeStazione);
			}
			
			st.close();
			
			Statement st2 = conn.createStatement();
			
			
			conn.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		//factory -> abbiamo creato una nuova classe senza sapere 
		//il tipo della classe (NON posso usare new)
		//uso un metodo fornito da un'altra classe che internamente
		//farà new e conoscerà il tipo di classe effettivo
		
		
		
	}
	
	
	
	public static void main(String args []) {
		LeggiBabs babs = new LeggiBabs();
		babs.run();
	}
	

}
