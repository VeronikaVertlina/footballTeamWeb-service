package com.hit.data;

public class ResultsOfFootballMatches {
	
	public int firstTeam;
    public int secondTeam;
    
	public ResultsOfFootballMatches(String score) {
		   String[] scores = score.split(" ");
	        this.firstTeam =Integer.parseInt(scores[0]);
	        this.secondTeam =Integer.parseInt(scores[1]);
	}

	@Override
	public String toString() {
		return ""+ firstTeam +":" + secondTeam +"";// [firstTeam=" + firstTeam + ", secondTeam=" + secondTeam + "]";
	}
    
}

