// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class SoccerScore implements IScore{

	// SoccerScore Object field Initializers
	double goalsOne;
	double goalsTwo;
	boolean extraTime;
	
	// SoccerScore Object Constructor
	public SoccerScore(double goals1In, double goals2In, boolean extraTimeIn){
		
		this.goalsOne = goals1In;
		this.goalsTwo = goals2In;
		this.extraTime = extraTimeIn;
		
	}
	
	/* returns true if:
	 * the two teams have the same number of goals,
	 * 	extra time had to have been played
	 */
	public boolean isValid(){
		
		if((this.goalsOne == this.goalsTwo) && this.extraTime)
			return true;
		else if((this.goalsOne != this.goalsTwo) && (this.extraTime == false))
			return true;
		else
			return false;
		
	}
	/*
	 * How did I make sure that every sport has to include to isValid method
	 * -> I accomplished this by implementing the Score class which has an abstract
	 *    method called isValid and so every sport implements score so every sport has
	 *    to implement a isValid method.
	 */
	
}
