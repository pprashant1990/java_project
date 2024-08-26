package iprep_core_java;


public class InstancefactoryMethod {

	public static void main(String[] args) {
	

		String str = new String("abc");
		String str1 = str.concat("  def");
		String str2 = str1.toUpperCase();
		String str3 = str2.trim();
		
		System.out.println(str3);
	}

}
