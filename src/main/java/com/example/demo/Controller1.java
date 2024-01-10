package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller1 {
	@Autowired
	Service1 es;
	@PostMapping("/emp-ni")
	public Map insertnData(@RequestBody Emploee_Pojo emp) {
	Map <String,String> data =new HashMap<String,String>();
	try {
	int response=es.UpdateData(emp);

	if(response>0)
	data.put("1", "Data inserted");
	else
	data.put("2", "Data not inserted");
	}
	catch (Exception e) {
	data.put("3", e.toString());
	}
	return data;

	}
	}

