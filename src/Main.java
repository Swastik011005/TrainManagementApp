import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println();

        LinkedHashSet<String> bogies = new LinkedHashSet<>();

        bogies.add("Engine");
        bogies.add("Sleeper");
        bogies.add("Guard");
        bogies.add("Sleeper"); // duplicate

        System.out.println("Insertion order preserved successfully...");
        System.out.println("Current Train Sequence : " + bogies);
        System.out.println("Total Unique Bogies : " + bogies.size());
        System.out.println();
        System.out.println("Duplicate bogies are ignored and original order is maintained.");
    }
}
