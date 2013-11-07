// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class InitMatch implements ITournament{

	// InitMatch Object field initializers
	MatchData matchData;
	
	// InitMatch Object Constructor
	public InitMatch(MatchData dataIn){
		this.matchData = dataIn;
	}

	// returns true if all scores in match are valid
	public boolean allScoresValid() {
	
		return this.matchData.iScore.isValid();
		
	}
	
	// return true if the given team exists in either of the two teams in the match
	public boolean playerInMatch(String teamName){
		
		return (this.matchData.teamOne.equals(teamName) ||
				this.matchData.teamTwo.equals(teamName));
		
	}
	
	// returns true if the tournament is valid
	public boolean validTournament(){
		
		return this.allScoresValid();
		
	}
	
	// returns the number of matches played by the given contestant in the match
	public int matchesPlayedBy(String contestant){
		
		if(this.matchData.teamOne.equals(contestant))
			return 1;
		else if(this.matchData.teamTwo.equals(contestant))
			return 1;
		else
			return 0;
		
	}
}
