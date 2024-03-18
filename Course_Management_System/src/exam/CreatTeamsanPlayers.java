package exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CreatTeamsanPlayers {

	private static Map<Integer, Team> availableTeams;
	
	static {
		availableTeams = new HashMap<>();
		availableTeams.put(101, new Team(101, "Chennai Super Kings","MS Dhoni"));
		availableTeams.put(102, new Team(102, "Mumbai Indians","Ishan Kishan"));
		availableTeams.put(103, new Team(103, "Royal Challenge Banglore","Virat Kohli"));
		
	}
	Scanner sc = new Scanner(System.in);
	
	public void createTeam() {
		System.out.println("Enter team code:");
		int code = sc.nextInt();
		System.out.println("Enter team name:");
		String name = sc.next();
		
		availableTeams.put(code, new Team(code,name));
	}
	
	public void addPlayer() {
		
		System.out.println("Add the player in Team");
		System.out.println("Enter team code:");
		int code = sc.nextInt();
		System.out.println("Enter player name:");
		String playerName = sc.next();
		System.out.println("Enter team name");
		String teamName = sc.next();
		
		availableTeams.put(code, new Team(code, teamName, playerName));
		
	}
	
	public void showAll() {
		
		System.out.println("Show All team Records:");
		Team tm = new Team();
		for (Map.Entry<Integer, Team> entry : availableTeams.entrySet()) {
	        System.out.println("Team ID: " + entry.getKey() + ", Team Name: " + entry.getValue().getTeam_Name()+ ", Player Name: " + entry.getValue().getPlayer_Name());
	    }
	}
	
}
