package map;

import java.util.*;
class HashMapExample {
	
	public static void main(String[] args) {
		Map<String,Integer>  vehicles = new HashMap<String,Integer>();
		
		// Add some vehicles.
		vehicles.put("BMW", 5);
		vehicles.put("Mercedes", 3);
		vehicles.put("Audi", 4);
		vehicles.put("Ford", 10);
		vehicles.put("Mercedes", 6);
		
		System.out.println("Total vehicles: " + vehicles.size());
		
		// Iterate over all vehicles, using the keySet method.
		for(String key: vehicles.keySet())
			System.out.println(key + " - " + vehicles.get(key));
		System.out.println();
		
		String searchKey = "Audi";
		if(vehicles.containsKey(searchKey))
			System.out.println("Found total " + vehicles.get(searchKey) + " "
					+ searchKey + " cars!\n");
	int total=0;
	Collection<Integer> l =	vehicles.values();
	for(Integer value:l){
		total+=value;
	}
		System.out.println("The total is "+total);
	
	
		// Clear all values.
		vehicles.clear();
		
		// Equals to zero.
		System.out.println("After clear operation, size: " + vehicles.size()); 
	}
}




