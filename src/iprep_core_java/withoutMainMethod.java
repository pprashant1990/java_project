package iprep_core_java;

import static java.lang.System.out;

public class withoutMainMethod {

	
	// this program only works from cmd , not from editor
	// not possible from java 7 version onwards
	
	static int i = m1();	
	static int m1(){
		out.println("Prashant");
		System.exit(0);
		return 10;
	}

}
