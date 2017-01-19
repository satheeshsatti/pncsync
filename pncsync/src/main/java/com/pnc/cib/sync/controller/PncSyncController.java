package com.pnc.cib.sync.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PncSyncController {
	
	/*

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping("/")
	public String sayHello() {
		try {
			return "PncSync Application " + queryPeople()+" ";
		} catch (Exception ex) {
			return "PncSync Application " + ex.getMessage();
		}
	}

	public String queryPeople() {
		String sql = "SELECT NAME FROM PERSON";
		String returnString = "";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		for (Map<String, Object> row : list) {
			returnString = returnString + row.get("name");
		}
		return returnString;
	}
	
	*/

}