package exam;

public class Team {

	private int team_Code;
	private String team_Name;
	private String player_Name;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(int team_Code, String team_Name) {
		this.team_Code = team_Code;
		this.team_Name = team_Name;
	}

	public Team(int team_Code, String team_Name, String player_Name) {
		this.team_Code = team_Code;
		this.team_Name = team_Name;
		this.player_Name = player_Name;
	}

	public int getTeam_Code() {
		return team_Code;
	}

	public void setTeam_Code(int team_Code) {
		this.team_Code = team_Code;
	}

	public String getTeam_Name() {
		return team_Name;
	}

	public void setTeam_Name(String team_Name) {
		this.team_Name = team_Name;
	}

	public String getPlayer_Name() {
		return player_Name;
	}

	public void setPlayer_Name(String player_Name) {
		this.player_Name = player_Name;
	}

	@Override
	public String toString() {
		return "Team [team_Code=" + team_Code + ", team_Name=" + team_Name + ", player_Name=" + player_Name + "]";
	}
	
}
