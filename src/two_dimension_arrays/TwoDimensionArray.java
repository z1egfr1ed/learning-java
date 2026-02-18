package two_dimension_arrays;

public class TwoDimensionArray {
	public static void main(String[] args) {

		// 2D array = An array where each element is an array
		//            Useful for storing a matrix of data

		String[] fruits = {"apple", "orange", "banana", "coconaut"};
		String[] vegetables = {"potato", "onion", "carrot"};
		String[] meats = {"chicken", "pork", "beef", "fish"};

		String[][] groceries = {fruits, vegetables, meats};
		groceries[0][0] = "pineapple";

		// for(String[] foods : groceries) {
		// 	for (String food : foods) {
		// 		System.out.print(food + " ");
		// 	}
		// 	System.out.println();
		// }

		// Mini project

		char[][] telephone = {{'1', '2', '3'},
													{'4', '5', '6'},
													{'7', '8', '9'},
													{'*', '0', '#'}};

		for (char[] row : telephone) {
			for (char number : row) {
				System.out.print(number + " ");
			}
			System.out.println();
		}

	}
}
