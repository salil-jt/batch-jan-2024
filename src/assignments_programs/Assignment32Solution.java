package assignments_programs;

import java.util.ArrayList;
import java.util.List;

public class Assignment32Solution {
public static void main(String[] args) {
	
	List<String> favSportsp1 = new ArrayList<>();
	favSportsp1.add("Cricket");
	favSportsp1.add("Badminton");
	List<String> favSportsp2 = new ArrayList<>();
	favSportsp2.add("VolleyBall");
	favSportsp2.add("Badminton");
	Player p1 = new Player("Salil",20,favSportsp1);
	Player p2 = new Player("Abhishek",21,favSportsp2);
	
	//find Students playing Badminton
	List<Player> players = new ArrayList<>();
	players.add(p1);players.add(p2);
	int count=0;
	for(Player p:players) {
		if(p.favoriteSports.contains("Badminton")) {
			count++;
		}
	}
	System.out.println("No of players who play Badminton is :"+count);
	
	
}
}
class Player{
	String name;
	int age;
	List<String> favoriteSports;
	public Player(String name,int age,  List<String> favoriteSports) {
		this.age = age;
		this.name = name;
		this.favoriteSports = favoriteSports;
	}
	
	
	
	
}