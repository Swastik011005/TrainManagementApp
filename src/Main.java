import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println();

        // Create train consist
        ArrayList<String> trainConsist = new ArrayList<>();

        // Add passenger bogies
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair Car");
        trainConsist.add("First Class");

        // Display details
        System.out.println("Passenger bogies added successfully...");
        System.out.println("Current Train Consist : " + trainConsist);
        System.out.println("Total Bogies : " + trainConsist.size());
        System.out.println();
        System.out.println("System ready for next operation...");
    }
}