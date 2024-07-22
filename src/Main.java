import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        String status;
        String username;
        operaceMath vyber = new operaceMath();

        System.out.print("Kalkulačka | Napiš své uživatelské jméno: ");
        username = vstup.nextLine();

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                    | - - - { Kalkulačka } - - - |   Username: " + username    );
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