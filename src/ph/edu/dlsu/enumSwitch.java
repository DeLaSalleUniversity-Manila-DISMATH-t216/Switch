package ph.edu.dlsu;

public class enumSwitch {

    public static void main(String[] args) {

        Day value = Day.Wednesday;

        switch (value){

            case Sunday:
                System.out.println("It's the first day of the week!");
                break;
            case Monday:
                System.out.println("It's the second day of the week");
                break;
            case Tuesday:
                System.out.println("It's the third day of the week");
                break;
            case Wednesday:
                System.out.println("It's the fourth day of the week");
                break;
            case Thursday:
                System.out.println("It's the fifth day of the week!");
                break;
            case Friday:
                System.out.println("It's the sixth day of the week!");
                break;
            case Saturday:
                System.out.println("It's the seventh and lat day of the week!");
                break;

        }
    }

}
