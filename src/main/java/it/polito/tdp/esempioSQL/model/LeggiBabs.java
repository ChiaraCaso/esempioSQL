package it.polito.tdp.esempioSQL.model;

import java.util.List;

import it.polito.tdp.esempioSQL.db.BubsDAO;

public class LeggiBabs {
	
	public void run() {
		
		BubsDAO dao = new BubsDAO();
		
		List <Station> tutte = dao.listStation();
		
		for (Station s : tutte) {
			System.out.println(s.getName());
		}
		
		System.out.println("------");
		List <Station> paloAlto = dao.listStationByLandmark("Palo Alto");
		
		for (Station s : paloAlto) {
			System.out.println(s.getName());
		}
	}
	
	
	
	public static void main(String args []) {
		LeggiBabs babs = new LeggiBabs();
		babs.run();
	}
	

}
