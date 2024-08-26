package iprep_core_java;

class C1{
	
   C1 getRef1(){
	   C1 c1 = new C1();
	   return c1;
   }
   
   C1 getRef2(){
	 return this;  
   }
	
}


public class thisCurrentClassObject {

	public static void main(String[] args) {
		C1 c1 = new C1();
		System.out.println(c1);
		
		System.out.println();
		System.out.println(c1.getRef1());	
		System.out.println(c1.getRef1());
		System.out.println(c1.getRef1());
		
		System.out.println();
		System.out.println(c1.getRef2());
		System.out.println(c1.getRef2());
		System.out.println(c1.getRef2());
		
		
	}

}
