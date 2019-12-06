package com.hit.data;

import java.util.Date;

public class FinishedGame extends Match{
	
	public ResultsOfFootballMatches score;

	public FinishedGame(Team first, Team second, Date start_date, Tournament tournament, ResultsOfFootballMatches score) {
		super(first, second, start_date, tournament);
		this.status = "played";
		this.score = score;
	}
}
