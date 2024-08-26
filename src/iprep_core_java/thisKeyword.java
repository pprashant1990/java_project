package iprep_core_java;



class A1{
	
	int i = 10;
	int j = 20;

	A1(int i, int j){		
		System.out.println(i+"#######"+j);
		System.out.println(this.i+"#######"+this.j);
	}
	
}

public class thisKeyword{
	
	public static void main(String[] args) {
		
		A1 a = new A1(3,4);
		
	}

}
