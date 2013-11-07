// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class MatchData {

	// MatchData Object field Initializers
	String teamOne;
	String teamTwo;
	IScore iScore;
	
	// MatchData Object Constructor
	public MatchData(String team1In, String team2In, IScore scoreIn){
		this.teamOne = team1In;
		this.teamTwo = team2In;
		this.iScore = scoreIn;
	}	
}
