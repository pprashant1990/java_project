package StringPractice;

public class StringCharShift {

    public static void main(String[] args) {
        String str = "askejssjsjwsoju";
        String result = shiftChar(str); 
        System.out.println(result);
    }
    public static String shiftChar(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (char c : str.toCharArray()) {

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                String charS = Character.toString(c);
                sb.deleteCharAt(sb.indexOf(charS));
                //sb.append(c);
            }
        }
        return sb.toString(); 
    }
}

