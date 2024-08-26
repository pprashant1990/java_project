package TestRostrum;

public class LargestAndSmallestNumberInAnArray {

	public static void main(String[] args) {

		int[] in = { 3, 33, 344, 545, 525 };

		int largest = in[0];
		int smallest = in[0];

		for (int i = 1; i < in.length; i++) {

			if (in[i] > largest) {
				largest = in[i];

			} else if (in[i] < smallest) {
				smallest = in[i];
			}
		}
		System.out.println("largest : "+largest);
		System.out.println("smallest : "+smallest);

	}

}
