package interfaces;

public class CricketPlayersUsingInterfaces {
public static void main(String[] args) {
	
}
}

abstract class Player
{
    String name;
    int matchesPlayed;
    int runsScored;
    Player(String name, int matchesPlayed, int runsScored)
    {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }
    public void bat()
    {
    }
    public void makeSomeRuns()
    {
    }
    void print()
    {
        System.out.print(name  + " played " + matchesPlayed + " matches and scored " + runsScored + " runs.");
    }
}

class StrongBatsmen extends Player implements IBatsmen {

	int numberOfCenturies;
    int numberOfHalfCenturies;

    StrongBatsmen(String name, int matchesPlayed, int runsScored, int numberOfCenturies, int numberOfHalfCenturies)
    {
    	super(name, matchesPlayed, runsScored);  //Parent Constructor call must be the first statement in a constructor
        this.numberOfCenturies = numberOfCenturies;
        this.numberOfHalfCenturies = numberOfHalfCenturies;
       
    }
    
    

	@Override
	public void openInnings() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeCentury() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeHalfCentury() {
		// TODO Auto-generated method stub
		
	}

	
}

//to format - ctrl+shift+f
interface IBatsmen {
	void bat();

	void makeSomeRuns();

	void openInnings();

	void makeCentury();

	void makeHalfCentury();
}

interface IBowler {
	void openInnings();

	void bowlYorkers();

	void takeWickets();
}

interface IKeeper {
	void keepWickets();

	void stumpBatsmen();

	void makeAppeals();
}

interface ICaptain {
	void selectTeam();

	void setField();
}
