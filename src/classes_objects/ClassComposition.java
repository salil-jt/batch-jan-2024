package classes_objects;
class ClassComposition //has a relation
{
    public static void main(String arg[])
    {
		
	Room hall = new Room("Hall"); 
	hall.area = 200.0;
    hall.paintColor = "Voilet";
    hall.flooring = "Marble";
    
    System.out.println("Room Area: "+hall.area);
    
    
    hall.ceilingFan = new Fan("ceilingFan");
    hall.ceilingFan.speed= 10.0;
     System.out.println("Hall Celing Fan Speed : "+hall.ceilingFan.speed);
 
 //1 way of assigning the Light object to the hall tube    
      hall.tube = new Light("Hall tube light"); // LINE C
      hall.tube.color = "White";
      hall.tube.watts = 40;
      hall.tube.tube = true;  
      
// another way of assigning the Light object to the hall bedlight
		Light bl = new Light("Yellow bed light"); // LINE D
		
        hall.bedLight = bl;
      //  hall.bl.color="Green";
        hall.bedLight.color = "Yellow";
        hall.bedLight.watts = 50;
        hall.bedLight.tube = false;
        
         System.out.println("bedLight watts: "+hall.bedLight.watts);
         bl.watts = 70;
        System.out.println("bedLight watts: "+hall.bedLight.watts);
        

       
     
    


	}
}
class Room
{
    String name;
    double area;
    String paintColor;
    String flooring;
    Fan ceilingFan;
    Light tube;
    Light bedLight;

    Room(String name)
    {
        this.name = name;
    }
}


class Fan
{
    String name;
    double speed;
    String color;
    int numberOfSpeeds;

    Fan(String name)
    {
        this.name = name;
    }
}
class Light
{
    String name;
    String color;
    int watts;
    boolean tube;

    Light(String name)
    {
        this.name = name;
    }
}



