package com.hit.data;

import java.util.UUID;

public class Tournament {
	private String uniqueID;
    private String name;
    
	public Tournament(String name) {
		 this.name = name;
	     uniqueID = UUID.randomUUID().toString();
	}
	
	public String getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
 }
