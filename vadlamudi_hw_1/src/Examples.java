
// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo		Username: mbozdo		Section: 

import tester.*;

class Examples {

	Examples() {} ;
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Soccer Examples and Tests
	
	// Valid Soccer scores
	SoccerScore soccerScoreOne = new SoccerScore(5, 7, false);
	SoccerScore soccerScoreTwo = new SoccerScore(5, 5, true);
	SoccerScore soccerScoreThree = new SoccerScore(5, 9, false);
	// Invalid Soccer scores	
	SoccerScore soccerScoreFour = new SoccerScore(5, 5, false);
		
	// MatchData Valid Soccer Match Examples
	MatchData dataSoccerOne = new MatchData("Barcelona", "Manchester", soccerScoreOne);
	MatchData dataSoccerTwo = new MatchData("Madrid", "Chelsea", soccerScoreTwo);
	MatchData dataSoccerThree = new MatchData("Barcelona", "Madrid", soccerScoreThree);
	// MatchData Invalid Soccer Match Example
	MatchData dataSoccerFour = new MatchData("Barcelona", "Madrid", soccerScoreFour);
	MatchData dataSoccerFive = new MatchData("Barcelona", "UK", new SoccerScore(5, 5, true));
		
	// Initial Valid Matches of Soccer
	InitMatch soccerTournamentOne = new InitMatch(dataSoccerOne);
	InitMatch soccerTournamentTwo =  new InitMatch(dataSoccerTwo);
	InitMatch soccerTournamentThree = new InitMatch(dataSoccerThree);
	// Initial Invalid Match of Soccer
	InitMatch soccerTournamentFour = new InitMatch(dataSoccerFour);
	InitMatch soccerTournamentFive = new InitMatch(dataSoccerFive);
	
	// Advanced Valid Matches of Soccer	
	AdvanceMatch soccerTournamentAdv = new AdvanceMatch(soccerTournamentThree, soccerTournamentOne, soccerTournamentTwo);
	// Soccer Tournament Invalid Examples
	AdvanceMatch soccerTournamentAdvTwo = new AdvanceMatch(soccerTournamentFour, soccerTournamentOne, soccerTournamentTwo);
	AdvanceMatch soccerTournamentAdvThree = new AdvanceMatch(soccerTournamentThree, soccerTournamentAdv, soccerTournamentAdvTwo);
	AdvanceMatch soccerTournamentAdvFour = new AdvanceMatch(soccerTournamentFive, soccerTournamentAdv, soccerTournamentAdvTwo);
	
	// isValid() test cases for Soccer scores
	boolean testIsValidSoccer(Tester t){
		return (t.checkExpect(soccerScoreOne.isValid(), true)   &&
			    t.checkExpect(soccerScoreTwo.isValid(), true)   &&
			    t.checkExpect(soccerScoreThree.isValid(), true) &&
			    t.checkExpect(soccerScoreFour.isValid(), false));
	}
	
	// allScoresValid() test cases for Soccer tournaments
	boolean testAllScoresValidSoccer(Tester t){
		return (t.checkExpect(soccerTournamentAdv.allScoresValid(), true)       &&
				t.checkExpect(soccerTournamentAdvTwo.allScoresValid(), false)   &&
				t.checkExpect(soccerTournamentAdvThree.allScoresValid(), false) &&
				t.checkExpect(soccerTournamentAdvFour.allScoresValid(), false));
	}
	
	// playerAlwaysAdvanced test cases for Soccer
	boolean testPlayersAlwaysAdvancedSoccer(Tester t){
		return (t.checkExpect(soccerTournamentAdv.playersAlwaysAdvanced(), true)      &&
				t.checkExpect(soccerTournamentAdvTwo.playersAlwaysAdvanced(), true)   &&
				t.checkExpect(soccerTournamentAdvThree.playersAlwaysAdvanced(), true) &&
				t.checkExpect(soccerTournamentAdvFour.playersAlwaysAdvanced(), false));
	}
	
	// validTournament test cases for Soccer tournaments
	boolean testValidTournamentSoccer(Tester t){
		return (t.checkExpect(soccerTournamentAdv.validTournament(), true)      &&
				t.checkExpect(soccerTournamentAdvTwo.validTournament(), false)   &&
				t.checkExpect(soccerTournamentAdvThree.validTournament(), false) &&
				t.checkExpect(soccerTournamentAdvFour.validTournament(), false));
	}
	
	// matchesPlayedBy test cases for soccer matches
	boolean testMatchesPlayedBySoccer(Tester t){
		return (t.checkExpect(soccerTournamentAdv.matchesPlayedBy("Lakers"), 0)         &&
				t.checkExpect(soccerTournamentAdvTwo.matchesPlayedBy("Madrid"), 2)      &&
				t.checkExpect(soccerTournamentAdvThree.matchesPlayedBy("Barcelona"), 5) &&
				t.checkExpect(soccerTournamentAdvFour.matchesPlayedBy("Chelsea"), 2));
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Baseball Examples and Tests
	
	// Valid Baseball scores
	BaseballScore baseballScoreOne = new BaseballScore(5, 7, 7);
	BaseballScore baseballScoreTwo = new BaseballScore(8, 9, 7);
	// Invalid Baseball scores
	BaseballScore baseballScoreThree = new BaseballScore(5, 5, 7);
	BaseballScore baseballScoreFour = new BaseballScore(5, 7, 6);

	
	// MatchData Valid Baseball Match Examples
	MatchData dataBaseballOne = new MatchData("Red Sox", "Cardinals", new BaseballScore(20, 12, 7));
	MatchData dataBaseballTwo = new MatchData("Yankees", "Tigers", new BaseballScore(18, 14, 7));
	MatchData dataBaseballThree = new MatchData("Red Sox", "Yankees", new BaseballScore(17, 15, 7));
	// MatchData Invalid Baseball Match Example
	MatchData dataBaseballFour = new MatchData("Red Sox", "Yankees", baseballScoreThree);
	MatchData dataBaseballFive = new MatchData("Yankees", "Tigers", baseballScoreFour);
	MatchData dataBaseballSix = new MatchData("Yankees", "Mets", baseballScoreFour);
	
	// Initial Valid Matches of Baseball
	InitMatch baseballTournament = new InitMatch(dataBaseballOne);
	InitMatch baseballTournamentTwo = new InitMatch(dataBaseballTwo);
	InitMatch baseballTournamentThree = new InitMatch(dataBaseballThree);
	// Initial Invalid Matches of Baseball
	InitMatch baseballTournamentFour = new InitMatch(dataBaseballFour);
	InitMatch baseballTournamentFive = new InitMatch(dataBaseballFive);
	InitMatch baseballTournamentSix = new InitMatch(dataBaseballSix);
	
	// Advanced Valid Matches of Baseball
	AdvanceMatch baseballTournamentAdv = new AdvanceMatch(baseballTournamentThree, baseballTournament, baseballTournamentTwo);
	// Advanced Invalid Matches of Baseball
	AdvanceMatch baseballTournamentAdvTwo = new AdvanceMatch(baseballTournamentFive, baseballTournamentFour, baseballTournamentAdv);
	AdvanceMatch baseballTournamentAdvThree = new AdvanceMatch(baseballTournamentSix, baseballTournamentFour, baseballTournamentAdv);
	
	// isValid() test cases for Baseball scores
	boolean testIsValidBaseball(Tester t){
		return (t.checkExpect(baseballScoreOne.isValid(), true)    &&
				t.checkExpect(baseballScoreTwo.isValid(), true)    &&
				t.checkExpect(baseballScoreThree.isValid(), false) &&
				t.checkExpect(baseballScoreFour.isValid(), false));
		
	}
	
	// allScoresValid() test cases for Baseball scores
	boolean testAllScoresValidBaseball(Tester t){
		return (t.checkExpect(baseballTournamentAdv.allScoresValid(), true)     &&
			    t.checkExpect(baseballTournamentAdvTwo.allScoresValid(), false) &&
			    t.checkExpect(baseballTournamentAdvThree.allScoresValid(), false));
	}
	
	// playersAlwaysAdvanced test cases for Baseball 
	boolean testPlayersAlwaysAdvancedBaseball(Tester t){		
		return (t.checkExpect(baseballTournamentAdv.playersAlwaysAdvanced(), true)    &&
				t.checkExpect(baseballTournamentAdvTwo.playersAlwaysAdvanced(), true) &&
				t.checkExpect(baseballTournamentAdvThree.playersAlwaysAdvanced(), false));		
	}
	
	// validTournament test cases for Baseball tournament
	boolean testValidTournamentBaseball(Tester t){
		return (t.checkExpect(baseballTournamentAdv.validTournament(), true)    &&
				t.checkExpect(baseballTournamentAdvTwo.validTournament(), false) &&
				t.checkExpect(baseballTournamentAdvThree.validTournament(), false));		
	
	}
	
	// matchesPlayedBy test cases for Baseball Tournament
	boolean testMatchesPlayedByBaseball(Tester t){
		return (t.checkExpect(baseballTournamentAdv.matchesPlayedBy("Heat"), 0)    &&
				t.checkExpect(baseballTournamentAdvTwo.matchesPlayedBy("Red Sox"), 3) &&
				t.checkExpect(baseballTournamentAdvThree.matchesPlayedBy("Yankees"), 4));
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
}
