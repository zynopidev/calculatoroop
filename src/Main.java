import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        String status;
        operaceMath vyber = new operaceMath();

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                                Kalkulačka");
        System.out.println("    LOBBY:");
        System.out.println("        - MENU, CAS, 0 (Odejit)");
        System.out.println("------------------------------------------------------------------------------\n");
        status = vstup.nextLine();

        switch(status) {
            case "MENU":
                vyber.vyberOperace();
                break;
            case "0":
                System.out.println("Kalkulačka | Ukončuji program (0)");
               System.exit(0);
            case "CAS":
                System.out.println("SOON");
                break;
            default:
                System.out.println("Kalkulačka | neznámé zadání!");
                break;
        }
    }
}