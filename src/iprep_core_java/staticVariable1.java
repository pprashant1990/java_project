package iprep_core_java;

class SV{
	
	static int i = 10;
	void m1(){
		int i = 20;
		System.out.println("SV-m1");
		System.out.println("Local instance variable : "+i);
		System.out.println("class level static variable : "+this.i);
	}
	
}

public class staticVariable1 {
	
	public static void main(String[] args) {
		SV s = new SV();	
		s.m1();
		System.out.println("class ref variable with static int variable : " + s.i);
		System.out.println("class name with static int variable : " +SV.i);
		System.out.println();
	}

}
