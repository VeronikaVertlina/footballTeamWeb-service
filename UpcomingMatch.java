package com.hit.data;

import java.time.LocalTime;
import java.util.Date;


public class UpcomingMatch// extends Match{
{
	 public Team firstTeam;
	 public Team secondTeam;
	 public Date start_date;
	 public LocalTime kickoffTime = LocalTime.parse("10:15:30");// From a String;
	 public Tournament tournament;
	

	
//    public UpcomingMatch(Team secondTeam, Team firstTeam, Date start_date, Tournament tournament) {
//    	super(firstTeam, firstTeam, start_date, tournament);
//        status = "upcoming";
//        this.firstTeam=firstTeam;
//        this.secondTeam=secondTeam;
//        this.start_date = start_date;       
//        kickoffTime = LocalTime.parse("10:15:30");// From a String
//        this.tournament=tournament;
  //  }

}

