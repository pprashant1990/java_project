package SDET_Programs;

public class givesOutput_00003241212_forTheInput_StringStr_32400121200 {
	public static void main(String[] args) {
		
		//Java program to gives Output:  “00003241212” for the Input String Str = “32400121200”

		
		String input = "32400121200";
		String formattedOutput = String.format("%011d", Long.parseLong(input));
		System.out.println("Formatted output: " + formattedOutput); 
	}
}
