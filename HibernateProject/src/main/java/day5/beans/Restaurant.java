package day5.beans;

public class Restaurant {
	private int restId;
	private int branchCount;
	private String restName;
	private String restCuisine;
	
	public Restaurant() {
		System.out.println("Inside Restaurant");
	}
	
	public Restaurant(int restId, int branchCount, String restName, String restCuisine) {
		super();
		this.restId = restId;
		this.branchCount = branchCount;
		this.restName = restName;
		this.restCuisine = restCuisine;
	}

	public int getRestId() {
		return restId;
	}

	public void setRestId(int restId) {
		this.restId = restId;
	}

	public int getBranchCount() {
		return branchCount;
	}

	public void setBranchCount(int branchCount) {
		this.branchCount = branchCount;
	}

	public String getRestName() {
		return restName;
	}

	public void setRestName(String restName) {
		this.restName = restName;
	}

	public String getRestCuisine() {
		return restCuisine;
	}

	public void setRestCuisine(String restCuisine) {
		this.restCuisine = restCuisine;
	}

	@Override
	public String toString() {
		return "Restaurant [restId=" + restId + ", branchCount=" + branchCount + ", restName=" + restName
				+ ", restCuisine=" + restCuisine + "]";
	}
	
	
}
