import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println();

        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair Car", 78);
        bogieCapacity.put("First Class", 24);

        System.out.println("Bogie capacity mapping created successfully...");
        System.out.println("Bogie Capacities : " + bogieCapacity);
        System.out.println("Capacity of Sleeper : " + bogieCapacity.get("Sleeper"));
        System.out.println();
        System.out.println("Each bogie is now mapped to its seating capacity.");
    }
}