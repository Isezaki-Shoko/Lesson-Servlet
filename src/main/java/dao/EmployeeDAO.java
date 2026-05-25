package dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import bean.Employee;


public class EnployeeDAO {
	
	public List<Employee> finfALL()throws Exception{
		List<Employee> list =new ArrayList<>();
		InitislContext ic = new InitialContect();
		DataSource ds=
				(DataSource)ic.lookup("java/comp/env/jdbc/MySQL");
		
	Connection con =ds.getConnection();
	
	PreparedSta
	
	}
}