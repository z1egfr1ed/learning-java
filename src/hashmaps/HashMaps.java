package hashmaps;

import java.util.HashMap;

public class HashMaps {
	public static void main(String[] args) {

		// HashMap = A data structure that stores key-value pairs
		//           Keys are unique, but Values can be duplicated
		//           Does not maintain any order, but is memory efficient
		//           HashMap<Key, Value>

		HashMap<String, Double> map = new HashMap<>();

		map.put("Pizza", 2.5);
		map.put("Cheese", 3.5);
		map.put("Chicken", 1.5);

		// Overriding
		map.put("Pizza", 3.5);

		// Removing
		map.remove("Cheese");

		System.out.println(map);
		System.out.println(map.get("Chicken"));
		System.out.println(map.containsKey("Pizza"));
		System.out.println(map.containsKey("Cheese"));

		if (map.containsKey("Hot Dog")) {
			System.out.println(map.get("Pizza"));
		} else {
			System.out.println("Key not found!");
		}

		System.out.println(map.containsValue(3.5));
		System.out.println(map.size());

		System.out.println("FOR ITERATION: ");
		for (String key : map.keySet()) {
			System.out.println(key + ": $" + map.get(key));
		}

	}
}
