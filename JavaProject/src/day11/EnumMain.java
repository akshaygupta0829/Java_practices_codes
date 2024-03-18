package day11;

import java.util.Arrays;
import java.util.List;

public class EnumMain {

	public static void main(String[] args) {
		TrainingProgram program1 = new TrainingProgram("Stress Mangement",2,TrainingMode.HYBRID);
		TrainingProgram program2 = new TrainingProgram("Communication Skills",5,TrainingMode.HYBRID);
		TrainingProgram program3 = new TrainingProgram("Interview Skills",3,TrainingMode.OFFLINE);
		TrainingProgram program4 = new TrainingProgram("Work Mangement",2,TrainingMode.HYBRID);
		TrainingProgram program5 = new TrainingProgram("Share Market",2,TrainingMode.ONLINE);
		
		List<TrainingProgram> allTrainingPrograms = Arrays.asList(program1, program2, program3, program4, program5);
		
		for(TrainingProgram currentProgram : allTrainingPrograms ) {
			TrainingMode currentMode = currentProgram.getModelTraining();
			if(currentMode.equals(TrainingMode.HYBRID))
				System.out.println(currentProgram.getName());
		}
		
		
	}

}
