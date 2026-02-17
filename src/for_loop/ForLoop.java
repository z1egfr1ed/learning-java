package for_loop;


public class ForLoop {
	public static void main(String[] args) throws InterruptedException {

		// int start = 10;
		// for (int i = start; i > 0; i--) {
		// 	System.out.println(i);
		// 	Thread.sleep(1000);
		// }
		// System.out.println("HAPPY NEW YEAR!");

		for (int i = 0; i < 10; i++) {
			if (i == 7) {
				continue; // skip current iteration of a loop (SKIP)
			} else if (i == 9) {
				break; // break out of a loop (STOP)
			}
			System.out.print(i + " ");
		}
	}
}
