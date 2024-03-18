package exam;

import java.util.Scanner;

public class Create_Player_Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice;
		CreatTeamsanPlayers create = new CreatTeamsanPlayers();
		Team[] tm = null;
		
		do {
			System.out.println("Enter the Choice \n1.Create Team \n2.Add Player in Team  \n3.Show All Teams \n4.Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1: 
				create.createTeam();
				break;
			case 2:
				create.addPlayer();
				break;
			case 3:
				create.showAll();
				break;
			case 4:
				System.out.println("Exit...!\n");
			default:
				System.out.println("Enter right choice!!");
			}
			
			
		}while(choice!=4);


	}

}
