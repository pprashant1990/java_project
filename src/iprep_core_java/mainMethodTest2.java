package iprep_core_java;

import java.util.Arrays;

class mainMethodTest2 {

	public static void main(String[] args) {
		System.out.println("main 2");
		String[] str = {"AAA","BBB","CCC","DDD","EEE"};
		System.out.println(Arrays.toString(str));
		mainMethodTest3.main(str);

	}
	

}
class mainMethodTest3 {

	public static void main(String[] args) {
		System.out.println("main 3");

	}

}
