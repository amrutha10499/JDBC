package com.xworkz;

import com.xworkz.Sports.dao.SportsDAO;
import com.xworkz.Sports.dao.SportsDAOImpl;
import com.xworkz.Sports.dto.SportsDTO;


public class TestSports {

	public static void main(String[] args) {
		
		SportsDTO sports=new SportsDTO();
		sports.setId(1);
		sports.setName("cricket");
		sports.setNoOfPlayers(11);
		sports.setType("outdoor");
		
		SportsDAO dao=new SportsDAOImpl();
		dao.saveAllDEtails(sports);
	
		dao.updatetypeById("outdoorrr", 1);
}
}
