package collectionTest;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap map = new LinkedHashMap<>(); // Key & Value
		map.put("Name", "abc"); // Object key & Object Value.
		map.put("Password", "1123");
		map.put("Domain", "testing");
		map.put("company", "hello");
//		map.put("Address", null);
//		map.put(null, "Adyur");
//		map.put(null, "Adyur2");
		System.out.println(map.get("company"));
	}

}
