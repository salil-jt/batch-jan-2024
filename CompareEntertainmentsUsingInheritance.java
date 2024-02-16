class CompareEntertainmentsUsingInheritance
{
    public static void main(String arg[])
    {
    
    Entertainment e;
    Movie m = new Movie();
    e = m ;
	m.name = "Swades";
    System.out.println("Movie : "+m.name);
    System.out.println("Entertainment:"+e.name);

   
   
   System.out.println("Movie stuntMaster: "+m.stuntMaster);
//   System.out.println("Entertainment stuntMaster:"+e.stuntMaster);//This is not possible
    
    
    Drama d = new Drama();
	e = d; 
	
	
	//m = d; //incompatible types: Drama cannot be converted to Movie

    
    
    Entertainment ent1;
    Drama d1 = new Drama();
    ent1 = d1; //ent1 is drama
    
    
    
    
  //  Drama d2 = ent1;// incompatible types: Entertainment cannot be converted to Drama
    
    ent1 = m ;
    
    
   Drama d2 = (Drama)ent1;
   
   
   
   
   Entertainment ent9;
	Circus c9 = new Circus();
	ent9 = c9;
	Drama d3 = (Drama) ent9;
	Drama d3 = (Circus) ent9;

    
    
    /*
        Movie julai = new Movie();
        julai.name = "Julai";
        julai.director = "Trivikram";
        julai.stuntMaster = "Peter Hein";
        julai.numberOfArtists = 57;
        julai.releaseDate = "15-Aug-2012";
        
        julai.collectionsFirstWeek = 215467.8;
        julai.collectionsRestOfTheDays = 541132.5;
        
        
     //   julai.printMovie(julai);
       
        
        Drama ramayan = new Drama();
        ramayan.name = "Ramayana";
        ramayan.writer = "Valmiki";
        ramayan.stageSetter = "Anjaneya";
        ramayan.numberOfArtists = 200000;
        ramayan.releaseDate = "17-Mar-1659 BC";
        
        ramayan.collectionsFirstWeek = 3282937242.86;
        ramayan.collectionsRestOfTheDays = 93488272349.51;
        
     //   ramayan.printMovie(ramayan);
        
        
        Circus jumbo = new Circus();
        jumbo.name = "Jumbo";
        jumbo.ringMaster = "Antony";
        jumbo.numberOfArtists = 316;
        jumbo.releaseDate = "16-Dec-1997";
        
        jumbo.collectionsFirstWeek = 2123132.21;
        jumbo.collectionsRestOfTheDays = 234936725.09;
    
        compareEntertainments(julai,jumbo,ramayan);
        */
    
    }
    
    
    public static void compareEntertainments(Entertainment ent1, Entertainment ent2, Entertainment ent3){
    	 System.out.println("In compareEntertainments methods which has 3 Entertainment parameters");
    
        if((ent1.getTotalCollections() > ent2.getTotalCollections()) && (ent1.getTotalCollections() > ent3.getTotalCollections()))
        {
            System.out.println(ent1.name + " has the highest collections.");
        }
        else if (ent2.getTotalCollections() > ent3.getTotalCollections())
        {
            System.out.println(ent2.name + " has the highest collections.");
        }
        else
        {
            System.out.println(ent3.name + " has the highest collections.");
        }
    }

    
    
}



class Entertainment
{
    String name;
    int numberOfArtists;
    String releaseDate;
    double collectionsFirstWeek;
    double collectionsRestOfTheDays;

    double getTotalCollections()
    {
        return collectionsFirstWeek + collectionsRestOfTheDays;
    }

    void printEntertainment()
    {
        System.out.println( name + " got the following collections " );
        System.out.println("First Week : " + collectionsFirstWeek);
        System.out.println("Rest Of The Days : " + collectionsRestOfTheDays);
        System.out.println("Total Collections : " + getTotalCollections());
        System.out.println("Total Artists : " + numberOfArtists);
        System.out.println("Release Date : " + releaseDate);
    }
    
    public void printMovie(Movie m)
{
    System.out.println(m.director + " is the director for movie " + m.name);
}



}


class Movie extends Entertainment
{
    String director;
    String stuntMaster;



    void print()
    {
        printEntertainment();
        System.out.println("Director : " + director);
        System.out.println("Stunt Master : " + stuntMaster);
    }

}

class Drama extends Entertainment
{
    String writer;
    String stageSetter;


    void print()
    {
        printEntertainment();
        System.out.println("Writer : " + writer);
        System.out.println("Stage Setter : " + stageSetter);
    }
}

class Circus extends Entertainment
{
    String ringMaster;

    void print()
    {
        printEntertainment();
        System.out.println("Ring Master : " + ringMaster);
    }
}
