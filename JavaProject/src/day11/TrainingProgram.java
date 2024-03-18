package day11;

public class TrainingProgram {
	private String name;
	private int duration;
	private TrainingMode modelTraining;
	
	public TrainingProgram() {
		name = "Art of living";
		duration = 3;
		modelTraining = TrainingMode.OFFLINE;
	}

	public TrainingProgram(String name, int duration, TrainingMode modelTraining) {
		super();
		this.name = name;
		this.duration = duration;
		this.modelTraining = modelTraining;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public TrainingMode getModelTraining() {
		return modelTraining;
	}

	public void setModelTraining(TrainingMode modelTraining) {
		this.modelTraining = modelTraining;
	}

	@Override
	public String toString() {
		return "TrainingProgram [name=" + name + ", duration=" + duration + ", modelTraining=" + modelTraining + "]";
	}
	
}
