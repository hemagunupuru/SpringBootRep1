package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class Service1 
{
	@Autowired
	JdbcTemplate jt;
	int UpdateData(Employees_Pojo emp)
	{
		
		int eid=emp.getEid();
		String sName=emp.getsName();
		String sql="update set sName='john' where eid=102";
		return jt.update(sql);	
	}
}
