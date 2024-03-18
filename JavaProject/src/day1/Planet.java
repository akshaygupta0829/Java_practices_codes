package day1;

public class Planet {
	private String name;
	private int moons;
	
	public void assignValues(String name, int moons) {
			this.name = name;
			this.moons = moons;
	}
	
	public String getValues() {
		String planetInfo = name + "," + moons;
		return planetInfo;
	}
}
