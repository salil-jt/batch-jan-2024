package interfaces;

public class CricketPlayersUsingInterfaces {
public static void main(String[] args) {
	StrongBatsmen sachin = new StrongBatsmen("Sachin", 250, 11324, 100, 125);
    StrongWicketKeeper dhoni = new StrongWicketKeeper("Dhoni", 153, 6021, 120, 67);
    StrongBatsmen shewag = new StrongBatsmen("Shewag", 110, 4341, 22, 40);
    AllRounderBatsmen yuvraj = new AllRounderBatsmen("Yuvraj", 105, 6533, 15, 46);
    StrongBatsmen kohli = new StrongBatsmen("Kohli", 75, 4003, 25, 60);
    AllRounderBatsmen raina = new AllRounderBatsmen("Raina", 34, 2600, 12, 19);
    AllRounderBatsmen rohit = new AllRounderBatsmen("Rohit", 25, 1500, 5, 9);
    StrongBowler harbhajan = new StrongBowler("Harbhajan", 189, 1500, 320, 4);
    StrongBowler zaheer = new StrongBowler("Zaheer", 150, 900, 220, 4);
    StrongBowler umesh = new StrongBowler("Umesh", 25, 150, 105, 2);
    AllRounderBowler ashwin = new AllRounderBowler("Aswin", 15, 200, 60, 2);
    
    //We can create a reference of the interface and assign an concrete class object to it
    //IBowler obj = new StrongBowler("Harbhajan", 189, 1500, 320, 4); 
    
    bowl(1,harbhajan);//This will work
    harbhajan.bowlYorkers();
    
  

}

public static void bowl(int overNumber, IBowler iBowler) {
    System.out.println("Bowling over " + overNumber);
    System.out.println("--------------------------");
    iBowler.bowlYorkers();
    iBowler.takeWickets();

	
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
    void print()
    {    
        super.print();
        System.out.print(" He is a strong batsmen and made " + numberOfCenturies +  " centuries and " + numberOfHalfCenturies + " half centuries.");
    }


	
}


class StrongBowler extends Player implements IBowler
{
    int numberOfWickets;
    int numberOf5WicketInnings;
    
    StrongBowler(String name, int matchesPlayed, int runsScored, int numberOfWickets, int numberOf5WicketInnings)
    {
        super(name, matchesPlayed, runsScored);
        this.numberOfWickets= numberOfWickets;
        this.numberOf5WicketInnings = numberOf5WicketInnings;
    }

    public void openInnings()
    {
    }

    public void bowlYorkers()
    {
        System.out.println("Strong Bowler " + name + " is bowling yorkers.");
    }
    
    public void takeWickets()
    {
        System.out.println("Strong Bowler " + name + " is taking wickets.");
    }

    void print()
    {    
        super.print();
        System.out.print(" He is also a good bowler and has taken " + numberOfWickets + " wickets. He has " + numberOf5WicketInnings + " 5WI(5-Wicket Innings) in his account.");
    }


}

class StrongWicketKeeper extends Player implements IKeeper
{
	
    int numberOfCatches;
    int numberOfStumpings;

	StrongWicketKeeper(String name, int matchesPlayed, int runsScored, int numberOfCatches, int numberOfStumpings)
    {
        super(name, matchesPlayed, runsScored);
        this.numberOfCatches = numberOfCatches;
        this.numberOfStumpings = numberOfStumpings;
    }

    public void keepWickets()
    {
    }
    
    public void stumpBatsmen()
    {
    }
    
    public void makeAppeals()
    {
    }

    void print()
    {    
        super.print();
        System.out.print(" He also keeps the wickets and has " + numberOfCatches + " catches and " + numberOfStumpings + " stumpings in his account.");
    }

}

class AllRounderBatsmen extends StrongBatsmen implements IBowler{
	
	


    AllRounderBatsmen(String name, int matchesPlayed, int runsScored, int numberOfCenturies, int numberOfHalfCenturies)
    {
        super(name, matchesPlayed, runsScored, numberOfCenturies, numberOfHalfCenturies);
    }

    public void openInnings()
    {
    }

    public void bowlYorkers()
    {
        System.out.println("All Rounder Batsmen " + name + " is bowling yorkers.");
    }
    
    public void takeWickets()
    {
        System.out.println("All Rounder Batsmen " + name + " is taking wickets.");
    }

}

class AllRounderBowler extends StrongBowler implements IBatsmen{
	
    AllRounderBowler(String name, int matchesPlayed, int runsScored, int numberOfWickets, int numberOf5WicketInnings)
    {
        super(name, matchesPlayed, runsScored, numberOfWickets, numberOf5WicketInnings);
    }

    public void openInnings()
    {
    }

    public void makeCentury()
    {
    }
    
    public void makeHalfCentury()
    {
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
