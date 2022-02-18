package com.xworkz.Sports.dao;

import com.xworkz.Sports.dto.SportsDTO;

public interface SportsDAO {
	
	void saveAllDEtails(SportsDTO dto);
	public SportsDTO getSportsBYId(int SportsId);
}
