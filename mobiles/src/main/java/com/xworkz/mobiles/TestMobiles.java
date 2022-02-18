package com.xworkz.mobiles;

import com.xworkz.mobiles.dao.MobilesDAO;
import com.xworkz.mobiles.dto.MobilesDTO;

public class TestMobiles {
	public static void main(String[] args) {
		
		MobilesDTO dto = new MobilesDTO();
		dto.setBrandName("redmi6");
		dto.setColor("matte_black");
		dto.setPrice(8499);
		dto.setStorage(64);
		
		MobilesDTO dto2 = new MobilesDTO();
		dto2.setBrandName("oneplus");
		dto2.setColor("blue");
		dto2.setPrice(35000);
		dto2.setStorage(128);
		
	 	MobilesDAO dao = new MobilesDAO();
	 	dao.saveMobilesDetails(dto);
	 	dao.saveMobilesDetails(dto2);
	 
	}

}
