package ph.edu.dlsu;
import java.io.*;

public class intSwitch {

    public static void main(String[] args) {

        String stringValue = getInput("Enter a number from 1 to 7: ");
        int intValue = Integer.parseInt(stringValue);

        switch (intValue){

            case 1:
                System.out.println("It's Sunday!");
                break;
            case 2:
                System.out.println("It's Monday!");
                break;
            case 3:
                System.out.println("It's Tuesday!");
                break;
            case 4:
                System.out.println("It's Wednesday!");
                break;
            case 5:
                System.out.println("It's Thursday!");
                break;
            case 6:
                System.out.println("It's Friday!");
                break;
            case 7:
                System.out.println("It's Saturday!");
                break;
            default:
                System.out.println(intValue+ " is not part of the choices.");
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
