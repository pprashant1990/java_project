package TestRostrum;

public class ExtractString {

	public static void main(String[] args) {
		String str = "www.erostrum.com";
		String firstFour = str.substring(0,4);
		System.out.println(firstFour);
		String lastFour = str.substring(str.length()-4, str.length());
		System.out.println(lastFour);
	}
 
}
