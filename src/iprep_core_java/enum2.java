package iprep_core_java;

enum Apple{
	
	A(500),B(300),C(100);
	int price;
	
	Apple(int price){
		this.price = price;
	}
	int getPrice() {
		return price;
	}
}

public class enum2 {

	public static void main(String[] args) {
		System.out.println("A-Grade Apple : "+Apple.A.getPrice());
		System.out.println("B-Grade Apple : "+Apple.B.getPrice());
		System.out.println("C-Grade Apple : "+Apple.C.getPrice());

	}

}
