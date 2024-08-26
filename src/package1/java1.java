package package1;

public class java1 {

	public static void main(String[] args) {

		int[] i = { 1, 4, 3, 9 };
		System.out.println("Int Array lengt : " + i.length);
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j] + " " + i[j]);
		}

		String[] s = { "xyz", "abc", "pqr" };
		for (String all : s) {
			System.out.println(all + " : " + all + 1);
		}

	}

}
