package Java8_Features_Lambda_Expression;

import java.util.Arrays;
import java.util.List;

public class CreatingAThread {

	public static void main(String[] args) {
		
	new Thread(() -> System.out.println("start a new thread")).start();		
	
	
		
	}

}



//new Thread(() -> System.out.println("Running in a new thread")).start();