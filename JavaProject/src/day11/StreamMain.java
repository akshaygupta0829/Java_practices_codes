package day11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> allNumbers = Arrays.asList(17, 34, 51, 68 , 85);
		
		Stream<Integer> intStream = allNumbers.stream();
		
		Consumer<Integer> intConsumer = num -> System.out.println(num);
		intStream.forEach(intConsumer);
		
	}

}
