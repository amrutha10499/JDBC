package com.xworkz.mobiles.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.mobiles.dto.MobilesDTO;

public class MobilesDAO {
	
	public boolean saveMobilesDetails(MobilesDTO dto) {
	
		String insertQuery= "insert into mobile_detail values(' "+dto.getBrandName()+" ' ," +dto.getPrice()+", '"
		    +dto.getColor()+"' ,"+dto.getStorage()+")";
		
		
		Connection  connection = null;
		Statement statement = null;
		
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","Amrutha");
			statement=connection.createStatement();
			
			statement.execute(insertQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				
				if(statement!= null)
				statement.close();
				
				if(connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return false;
	}
}
