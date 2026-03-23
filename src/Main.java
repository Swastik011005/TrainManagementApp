import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println();

        TreeSet<String> bogieIds = new TreeSet<>();

        bogieIds.add("BG105");
        bogieIds.add("BG101");
        bogieIds.add("BG103");
        bogieIds.add("BG102");
        bogieIds.add("BG101"); // duplicate

        System.out.println("Ordered bogie IDs maintained successfully...");
        System.out.println("Current Ordered Bogie IDs : " + bogieIds);
        System.out.println("Total Unique Ordered Bogies : " + bogieIds.size());
        System.out.println();
        System.out.println("Bogie IDs are sorted automatically and duplicates are ignored.");
    }
}