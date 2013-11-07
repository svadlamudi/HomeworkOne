// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B07

public class AdvanceMatch implements ITournament{
	
	// AdvanceMatch Object Field Initializers
	InitMatch initData;
	ITournament feederOne;
	ITournament feederTwo;
	
	// AdvanceMatch Object Constructor
	public AdvanceMatch(InitMatch dataIn, ITournament feeder1In, ITournament feeder2In){
		
		this.initData = dataIn;
		this.feederOne = feeder1In;
		this.feederTwo = feeder2In;
		
	}

	// returns true if all scores in a tournament are valid
	public boolean allScoresValid() {
		
		return (this.initData.allScoresValid()  && 
				this.feederOne.allScoresValid() && 
				this.feederTwo.allScoresValid());
		
	}
	
	// returns true if all players in an AdvanceMatch advanced from (previous) feeder matches
	public boolean playersAlwaysAdvanced(){
		
		String team1 = this.initData.matchData.teamOne;
		String team2 = this.initData.matchData.teamTwo;
		
		boolean teamOneFound = this.playerInMatch(team1);
		boolean teamTwoFound = this.playerInMatch(team2);				
		
		return (teamOneFound && teamTwoFound);		
	}

	// searches for the players in current match in the feeder tournaments
	public boolean playerInMatch(String teamName) {
		
		 return (this.feederOne.playerInMatch(teamName) ||
				 this.feederTwo.playerInMatch(teamName));
		
	}
	
	// returns true if the entire tournament was valid
	public boolean validTournament(){
		
		return (this.allScoresValid() &&
				this.playersAlwaysAdvanced());
		
	}
	
	// returns the number of matches played by the given contestant
	public int matchesPlayedBy(String contestant){
		
		return (this.initData.matchesPlayedBy(contestant) +
				this.feederOne.matchesPlayedBy(contestant) +
				this.feederTwo.matchesPlayedBy(contestant));
		
	}
	
}
