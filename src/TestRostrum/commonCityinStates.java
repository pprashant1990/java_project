package TestRostrum;

import java.util.*;

public class commonCityinStates {
    public static void main(String[] args) {
        // Sample data - Replace with your actual data
        Map<String, List<String>> stateCities = new HashMap<>();
        stateCities.put("KA", Arrays.asList("Bangalore", "Bellari", "shimoga"));
        stateCities.put("MP", Arrays.asList("New York City", "Buffalo", "Albany","Durg"));
        stateCities.put("CG", Arrays.asList("Houston", "Dallas", "Austin"));
        stateCities.put("AP", Arrays.asList("Chicago", "Springfield", "Rockford"));
        
        System.out.println(stateCities);

        // Find states with common cities
        findCommonCityStates(stateCities);
    }

    public static void findCommonCityStates(Map<String, List<String>> stateCities) {
        
    	Set<String> allCities = new HashSet<>();
        
        for (List<String> cities : stateCities.values()) {
            allCities.addAll(cities);
        }

        Map<String, List<String>> commonCityStates = new HashMap<>();
        
        for (String city : allCities) {
        	
            List<String> states = new ArrayList<>();
            
            for (Map.Entry<String, List<String>> entry : stateCities.entrySet()) {
                if (entry.getValue().contains(city)) {
                    states.add(entry.getKey());
                }
            }
                if (states.size() > 1) {
                commonCityStates.put(city, states);
            }
        }

        // Print the results
        for (Map.Entry<String, List<String>> entry : commonCityStates.entrySet()) {
            System.out.println("City: " + entry.getKey() + ", States: " + entry.getValue());
        }
    }
}
