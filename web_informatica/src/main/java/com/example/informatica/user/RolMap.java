package com.example.informatica.user;

import java.util.HashMap;

public class RolMap {
	HashMap<String, Boolean> map = new HashMap<String, Boolean>();
	
	public RolMap() {
		this.map.put("admin", false);
		this.map.put("autoridades", false);
		this.map.put("docentes", false);
		this.map.put("elecciones", false);
		this.map.put("investigacion", false);
		
		this.map.put("calendario", false);
		this.map.put("correlativas", false);
		this.map.put("graduados", false);
		this.map.put("optativas", false);
		this.map.put("plan", false);
		this.map.put("pps", false);
		this.map.put("trabajosfinales", false);
		
		this.map.put("novedades", false);
	}
	
	public void put(String key, boolean value) {
		this.map.put(key, value);
	}

	public HashMap<String, Boolean> getMap() {
		return map;
	}

}
