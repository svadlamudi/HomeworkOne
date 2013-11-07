// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class BaseballScore implements IScore{

	double runs1;
	double runs2;
	double totalInnings;
	
	// Baseball Score Constructor
	public BaseballScore(double runs1In, double runs2In, double totalInningsIn){
		
		this.runs1 = runs1In;
		this.runs2 = runs2In;
		this.totalInnings = totalInningsIn;
		
	}
	
	/* returns true if:
	 * 	atleast 7 innings were played
	 * the two teams do not have the same runs
	 */
	public boolean isValid(){
		
		if(this.totalInnings < 7)
			return false;
		else if((this.runs1 == this.runs2))
			return false;
		else
			return true;
		
	}
	/*
	 * How did I make sure that every sport has to include to isValid method
	 * -> I accomplished this by implementing the Score class which has an abstract
	 *    method called isValid and so every sport implements score so every sport has
	 *    to implement a isValid method.
	 */
	
}
