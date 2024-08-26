package StringPractice;

public class VowelReplace {


        public static void main(String[] args) {
            String str = "Hello World!";
            String result = removeVowels(str);

            System.out.println("Original String: " + str);
            System.out.println("String after removing vowels: " + result); 
        }

        public static String removeVowels(String str) {
            StringBuilder sb = new StringBuilder();

            for (char ch : str.toCharArray()) { 
                if (!isVowel(ch)) {
                    sb.append(ch);
                }
            }

            return sb.toString();
        }

        public static boolean isVowel(char ch) {
            ch = Character.toLowerCase(ch); // Convert to lowercase for case-insensitive check
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }
    }
