import java.util.List;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Set;
import java.util.*;

public class setsListsMaps {

	public static List<String> getValuesFromMapWhereKeyStartsWithA(Map<String, String> map) {

		List<String> values = new ArrayList<String>();

		for (String key : map.keySet()) {
			
			if (map.containsKey("A")) {
				values.add(map.get(key));
			}
		}
		
		return values;

	}

	public static List<Integer> everyOther(List<Integer> original) {

		List<Integer> modified = new ArrayList<Integer>();

		for (int i = 0; i < original.size(); i++) {
			if (i == 1 || i % 2 == 1) {
				modified.add(i + 1);
			}
		}

		return modified;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> employeeNames = new ArrayList<String>();
		Set<Integer> ids = new HashSet<Integer>();
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();

		// Adding elements/employees to the Array List
		employeeNames.add("Chuck");
		employeeNames.add("Bob");
		employeeNames.add("Big Lou");
		employeeNames.add("Maria");
		employeeNames.add("Rose");
		employeeNames.add("Dick");

		// Adding keys/employee ids to our Set
		ids.add(01);
		ids.add(02);
		ids.add(03);
		ids.add(04);
		ids.add(05);
		ids.add(06);

		int i = 0;

		for (int id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}

		System.out.println("Here is the populated employeeMap for question 5: \n");
		System.out.println(employeeMap + "\n");

		System.out.println("Question 6:");
		System.out.println("-----------");
		for (int key : employeeMap.keySet()) {
			System.out.println(key + " " + employeeMap.get(key));
		}

		StringBuilder idsBuilder = new StringBuilder();
		for (int id : ids) {
			idsBuilder.append(id + "-");
		}

		System.out.println("\n" + idsBuilder.toString());

		StringBuilder namesBuilder = new StringBuilder();

		for (String name : employeeNames) {
			namesBuilder.append(name + " ");
		}

		System.out.println("\n" + namesBuilder.toString());

		List<Integer> original = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		System.out.println(everyOther(original));
		
		Map<String, String> dictionary = new HashMap<String, String>();
		
		dictionary.put("B", "someone that takes neatness to the extreme");
		dictionary.put("A", "move in stealthy manner");
		dictionary.put("C", "clear in meaning");
		
		System.out.println(getValuesFromMapWhereKeyStartsWithA(dictionary));
	 
	}

}
