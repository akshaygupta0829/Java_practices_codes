package day1;

public class PlanetMain {

	public static void main(String[] args) {
			Planet pl = new Planet();
			pl.assignValues("Earth",1);			
			System.out.println(pl.getValues());
			
			Planet pl2 = new Planet();
			pl2.assignValues("Jupiter", 15);
			
			String ourPlanetInfo = pl2.getValues();
			System.out.println(ourPlanetInfo);
	}
}
