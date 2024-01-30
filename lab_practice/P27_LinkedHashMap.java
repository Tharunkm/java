package lab_practice;
import java.util.*;

public class P27_LinkedHashMap {

	public static void main(String[] args) {
		Map<String,Integer>populationMap = new LinkedHashMap<>();
		populationMap.put("New York",83000);
		populationMap.put("Los Angles",36512);
		populationMap.put("Chicago",27894);
		System.out.println("Population by city: "+ populationMap);
	}

}
