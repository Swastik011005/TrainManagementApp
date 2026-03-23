import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println();

        HashSet<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate

        System.out.println("Unique bogie IDs added successfully...");
        System.out.println("Current Bogie IDs : " + bogieIds);
        System.out.println("Total Unique Bogies : " + bogieIds.size());
        System.out.println();
        System.out.println("Duplicate bogie IDs are automatically ignored.");
    }
}