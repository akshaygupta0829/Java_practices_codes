package day3;

public class CricketPlayer extends Player {
	private int battingAvg;
	
	public CricketPlayer() {
		super();
	}

	public CricketPlayer(String name, int age, int battingAvg) {
		super(name, age);
	}

	public int getBattingAvg() {
		return battingAvg;
	}

	public void setBattingAvg(int battingAvg) {
		this.battingAvg = battingAvg;
	}

	
}
