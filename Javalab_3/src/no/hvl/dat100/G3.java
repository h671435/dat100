package no.hvl.dat100;

public class G3 {

	public static void main(String[] args) {

		int n;
		n = 20;

		for (int i = 0; i <= n; i++) {
			// System.out.println(i);

			switch (i) {
			case 1:
				System.out.print("A");
				break;

			case 2:
				System.out.print("B");
				break;

			default:
				System.out.print("C");
				break;
			}
		}
	}

}
