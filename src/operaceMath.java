import java.util.Scanner;

public class operaceMath {
    Scanner vstup = new Scanner(System.in);
    String operace;

    public void vyberOperace() {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                                Kalkulačka");
        System.out.println("    MENU:");
        System.out.println("        - Plus, Minus, Krat, Deleno, Mocnina, Odmocnina, 0 (Odejit)");
        System.out.println("------------------------------------------------------------------------------\n");
        operace = vstup.nextLine();

        switch(operace) {
            case "Plus":
                operacePlus();
                break;
            case "Minus":
                operaceMinus();
                break;
            case "Krat":
                operaceKrat();
                break;
            case "Deleno":
                operaceDeleno();
                break;
            case "Mocnina":
                operaceMocnina();
                break;
            case "Odmocnina":
                operaceOdmocnina();
                break;
            case "0":
                System.exit(0);
            default:
                System.out.println("Kalkulačka | Neznámá matematická operace.");
                vyberOperace();
        }
    }
    public void operacePlus() {
        float Cislo1;
        float Cislo2;
        System.out.println("- - - - - - - - - - - - - - - - - - { calculator@java } - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Kalkulačka - Plus | Prosím vyber dvě hodnoty, které budeš chtít sečíst.");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n");
        Cislo1 = vstup.nextFloat();
        System.out.println("- - - - - - - - - - - - - - - - - - { calculator@java } - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Kalkulačka - Plus | Jako první hodnotu si nastavil " + Cislo1 + " { " + Cislo1 + " + ? }. Nyní prosím vyber druhou hodnotu.");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n");
        Cislo2 = vstup.nextFloat();
        float vypocet = Cislo1 + Cislo2;
        System.out.println("- - - - - - - - - - - - - - - - - - { calculator@java } - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Kalkulačka - Plus | Výsledek příkladu: " + Cislo1 + " + " + Cislo2 + " je ---> " + vypocet + " <---");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n");
        vstup.nextLine();
        vyberOperace();
    }
    public void operaceMinus() {
        float Cislo1;
        float Cislo2;
        System.out.println("- - - - - - - - - - - - - - - - - - { calculator@java } - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Kalkulačka - Mínus | Prosím vyber dvě hodnoty, které budeš chtít od sebe odečíst.");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n");
        Cislo1 = vstup.nextFloat();
        System.out.println("- - - - - - - - - - - - - - - - - - { calculator@java } - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Kalkulačka - Mínus | Jako první hodnotu si nastavil " + Cislo1 + " { " + Cislo1 + " - ? }. Nyní prosím vyber druhou hodnotu.");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n");
        Cislo2 = vstup.nextFloat();
        float vypocet = Cislo1 - Cislo2;
        System.out.println("- - - - - - - - - - - - - - - - - - { calculator@java } - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Kalkulačka - Mínus | Výsledek příkladu: " + Cislo1 + " - " + Cislo2 + " je ---> " + vypocet + " <---");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n");
        vstup.nextLine();
        vyberOperace();

    }
    public void operaceKrat() {
        float Cislo1;
        float Cislo2;
        System.out.println("- - - - - - - - - - - - - - - - - - { calculator@java } - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Kalkulačka - Krát | Prosím vyber dvě hodnoty, které budeš chtít vynásobit.");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n");
        Cislo1 = vstup.nextFloat();
        System.out.println("- - - - - - - - - - - - - - - - - - { calculator@java } - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Kalkulačka - Krát | Jako první hodnotu si nastavil " + Cislo1 + " { " + Cislo1 + " * ? }. Nyní prosím vyber druhou hodnotu.");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n");
        Cislo2 = vstup.nextFloat();
        float vypocet = Cislo1 * Cislo2;
        System.out.println("- - - - - - - - - - - - - - - - - - { calculator@java } - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Kalkulačka - Krát | Výsledek příkladu " + Cislo1 + " * " + Cislo2 + " je ---> " + vypocet + " <---");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n");
        vstup.nextLine();
        vyberOperace();

    }
    public void operaceDeleno() {
        float Cislo1;
        float Cislo2;
        System.out.println("- - - - - - - - - - - - - - - - - - { calculator@java } - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Kalkulačka - Děleno | Prosím vyber dvě hodnoty, které chceš vydělit. ! { Dělitel nesmí být 0 }");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n");
        Cislo1 = vstup.nextFloat();
        System.out.println("- - - - - - - - - - - - - - - - - - { calculator@java } - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Kalkulačka - Děleno | Jako první hodnotu si nastavil " + Cislo1 + " { " + Cislo1 + " / ? }. Nyní prosím vyber druhou hodnotu.");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n");
        Cislo2 = vstup.nextFloat();
        if(Cislo2 == 0) {
            System.out.println("- - - - - - - - - - - - - - - - - - { calculator@java } - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("Kalkulačka - Děleno | Dělitel nesmí být 0 !");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n");
        }else {
            float vypocet = Cislo1 / Cislo2;
            System.out.println("- - - - - - - - - - - - - - - - - - { calculator@java } - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("Kalkulačka - Děleno | Výsledek příkladu " + Cislo1 + " / " + Cislo2 + " je ---> " + vypocet + " <---");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n");
            vstup.nextLine();
            vyberOperace();
        }
    }
    public void operaceMocnina() {
        float Cislo1;
        System.out.println("- - - - - - - - - - - - - - - - - - { calculator@java } - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Kalkulačka - Mocnina | Prosím vyber jednu hodnotu kterou budeš chtít umocnit na druhou.");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n");
        Cislo1 = vstup.nextFloat();
        float vypocet = Cislo1 * Cislo1;
        System.out.println("- - - - - - - - - - - - - - - - - - { calculator@java } - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Kalkulačka - Mocnina | Výsledek příkladu " + Cislo1 + " na druhou je ---> " + vypocet + " <---");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n");
        vstup.nextLine();
        vyberOperace();

    }
    public void operaceOdmocnina() {
        vyberOperace();
    }
}
