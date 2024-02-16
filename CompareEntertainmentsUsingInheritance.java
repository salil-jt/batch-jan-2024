class CompareEntertainmentsUsingInheritance
{
    public static void main(String arg[])
    {
    
    
    
    
    
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
