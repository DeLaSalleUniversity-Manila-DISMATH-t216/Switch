package ph.edu.dlsu;
import java.io.*;

public class stringSwitch {

    public static void main(String[] Args){
        String stringValue = getInput("Enter the day in words (all-caps please): ");

        switch (stringValue){

            case "SUNDAY":
                System.out.println("It's the first day of the week!");
                break;
            case "MONDAY":
                System.out.println("It's the second day of the week");
                break;
            case "TUESDAY":
                System.out.println("It's the third day of the week");
                break;
            case "WEDNESDAY":
                System.out.println("It's the fourth day of the week");
                break;
            case "THURSDAY":
                System.out.println("It's the fifth day of the week!");
                break;
            case "FRIDAY":
                System.out.println("It's the sixth day of the week!");
                break;
            case "SATURDAY":
                System.out.println("It's the seventh and lat day of the week!");
                break;
            default:
                System.out.println("Input cannot be recognized.");
                break;

        }
    }

    private static String getInput(String prompt) {
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print(prompt);
        System.out.flush();

        try {
            return stdin.readLine();
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
