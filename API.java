package com.hit.data;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping
public class API {
//	1.Get list of matches by team. 
//	2.Get list of matches by team filtered by status 
//	3.Get list of matches by tournament. 
//	4.Get list of matches by tournament filtered by status
//	public static void main(String[] args) {
	@RequestMapping(value = "matches/team", method = RequestMethod.GET)
	public static List<Match> getMatchesByTeam() {
		DataOrigin data = DataOrigin.getInstance();
		String name = "matches/team";
		List<Match> matches = data.getMatches();
		matches.removeIf(match -> !match.firstTeam.getName().equals(name)
				&& !match.secondTeam.getName().equals(name));
		return matches;	
	

//	public List<Match> getMatchesByTeamFilteredByStatus(String name, String status) {
//		DataOrigin data = DataOrigin.getInstance();
//		String name = "matches/team";
//		String status = ""
//		List<Match> matches = data.getMatches();
//		matches.removeIf(match -> !match.firstTeam.getName().equals(name)
//				&& !match.secondTeam.getName().equals(name));
//		return matches;	
//		return null;
//	}
//	public List<Match> getMatchesByTournament(String name) {
//		return null;
//	}
//	public List<Match> getMatchesByTournamentFilteredByStatus(String name, String status) {
//		return null;
//	}
	
	}
}



