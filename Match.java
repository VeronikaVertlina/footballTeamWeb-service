package com.hit.data;

import java.util.Date;

public abstract class Match {
	
	String status;
    public Team firstTeam;
    public Team secondTeam;
    public Date start_date;
    public Tournament tournament;
    
 	public Match(Team firstTeam, Team secondTeam, Date start_date, Tournament tournament) {
		this.status = getTypeOfMatchStatus(status);
		this.firstTeam = firstTeam;
		this.secondTeam = secondTeam;
		this.start_date = start_date;
		this.tournament = tournament;
	}

	public static String getTypeOfMatchStatus(String status) {
		String typeOfStatus;
	       switch (status) {
	           case "upcoming":
	        	   typeOfStatus = "upcoming";
	        	   break;
	           case "played":
	        	   typeOfStatus = "played";
	        	   break;
	        	   default:
	        		   throw new IllegalArgumentException("Invalid match of status: " + status);
	          }
	       return typeOfStatus;
	   }
}

