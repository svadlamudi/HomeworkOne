// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public interface ITournament {

	// returns true if all the scores of the given tournament are valid
	boolean allScoresValid();
	
	// return true if the given team was found in the preceding matches
	boolean playerInMatch(String teamName);
	
	// returns true if the tournament was valid
	boolean validTournament();
	
	// return the number of matches played by the given contestant in a tournament
	int matchesPlayedBy(String contestant);
}
