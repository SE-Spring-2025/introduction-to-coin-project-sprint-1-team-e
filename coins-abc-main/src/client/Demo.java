import java.util.Scanner;
import java.util.Calendar;

public class Demo {
    private static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome to the CoinFlips Demo!");
        System.out.println("Team E");

        fixedDemo();
        metallurgyDemo();
        interactiveDemo();
        
        System.out.println();
        printSeparator();
        System.out.println("Thanks for watching the CoinFlips Demo.");
        System.out.println("Have a wonderful day!");
    }
    
    // New helper method for formatting
    private static void printSeparator() {
        System.out.println("--------------------------------------------------");
    }
    
    private static void fixedDemo() {
        System.out.println();
        printSeparator();
        System.out.println("Coin Creation via fixedDemo:");
        printSeparator();
        
        // Penny
        System.out.println("> Creating: Penny()");
        System.out.println("  [Result] " + new Penny());
        printSeparator();
        
        // Nickel
        System.out.println("> Creating: Nickel()");
        System.out.println("  [Result] " + new Nickel());
        printSeparator();
        
        // Dime
        System.out.println("> Creating: Dime()");
        System.out.println("  [Result] " + new Dime());
        printSeparator();
        
        // Quarter
        System.out.println("> Creating: Quarter()");
        System.out.println("  [Result] " + new Quarter());
        printSeparator();
        
        // HalfDollar
        System.out.println("> Creating: HalfDollar()");
        System.out.println("  [Result] " + new HalfDollar());
        printSeparator();
        
        // Dollar
        System.out.println("> Creating: Dollar()");
        System.out.println("  [Result] " + new Dollar());
        printSeparator();
    }
    
    private static void metallurgyDemo() {
        System.out.println();
        printSeparator();
        System.out.println("Metallurgy Strategy Demo:");
        printSeparator();
        
        // Create a penny with standard copper metallurgy
        Penny standardPenny = new Penny(2023);
        System.out.println("> Standard Penny: " + standardPenny);
        
        // Create a penny with cupro-nickel metallurgy
        Penny specialPenny = new Penny(2023, new CuproNickel());
        System.out.println("> Special Penny with Cupro-Nickel: " + specialPenny);
        
        // Change a nickel's metallurgy to copper
        Nickel standardNickel = new Nickel(2023);
        System.out.println("> Standard Nickel: " + standardNickel);
        standardNickel.setSmelter(new Copper());
        System.out.println("> Nickel after changing to Copper: " + standardNickel);
        printSeparator();
    }
    
    private static void printMenu() {
        System.out.println();
        printSeparator();
        System.out.println("I'm ready to make you a coin!");
        System.out.println("Enter G for a Dollar coin.");
        System.out.println("Enter H for a HalfDollar coin.");
        System.out.println("Enter Q for a Quarter coin.");
        System.out.println("Enter D for a Dime coin.");
        System.out.println("Enter N for a Nickel coin.");
        System.out.println("Enter P for a Penny coin.");
        System.out.println("Enter S for a Special Penny (with Cupro-Nickel).");
        System.out.println("Enter X to exit the demo.");
        printSeparator();
    }
    
    private static void interactiveDemo() {
        while(true) {
            System.out.println();
            System.out.print("Would you like to make more coins yourself? (Y/n) ");
            String response = keyboard.nextLine().trim();
            if(response.isEmpty() || !(response.charAt(0)=='Y' || response.charAt(0)=='y')) {
                break;
            }
            runDemo(); // process one coin creation then return
        }
    }
    
    private static void runDemo() {
        Coin c;
        Calendar cal = Calendar.getInstance();
        int curYear = cal.get(Calendar.YEAR);
        
        System.out.println();
        printMenu();
        System.out.print("What coin to make? ");
        String response = keyboard.nextLine().trim();
        if(response.isEmpty()){
            System.out.println("No input entered.");
            return;
        }
        char option = Character.toUpperCase(response.charAt(0));
        switch (option) {  // convert to uppercase so any case works
            case 'G':
                System.out.println("> Creating: Dollar coin...");
                c = new Dollar(curYear);
                break;
            case 'H':
                System.out.println("> Creating: HalfDollar coin...");
                c = new HalfDollar(curYear);
                break;
            case 'Q':
                System.out.println("> Creating: Quarter coin...");
                c = new Quarter(curYear);
                break;
            case 'D':
                System.out.println("> Creating: Dime coin...");
                c = new Dime(curYear);
                break;
            case 'N':
                System.out.println("> Creating: Nickel coin...");
                c = new Nickel(curYear);
                break;
            case 'P':
                System.out.println("> Creating: Penny coin...");
                c = new Penny(curYear);
                break;
            case 'S':
                System.out.println("> Creating: Special Penny with Cupro-Nickel...");
                c = new Penny(curYear, new CuproNickel());
                break;
            case 'X':
                return;
            default:
                System.out.println("Invalid entry.");
                return;
        }
        printSeparator();
        System.out.println("  [Result] " + c);
        printSeparator();
    }
}
