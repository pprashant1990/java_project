package StringPractice;

public class VowelCount { 
	

    public static void main(String[] args) {
        String str = "Hello, World!";
        int vowelCount = countVowels(str);
        System.out.println("The number of vowels in '" + str + "' is: " + vowelCount); 
    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert to lowercase for case-insensitive counting

        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
