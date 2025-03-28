import java.util.Scanner;

public class Demo {
    private static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome to the CoinFlips Demo!");
        
        fixedDemo();
        interactiveDemo();
        
        System.out.println();
        System.out.println("Thanks for watching the CoinFlips Demo.");
        System.out.println("Have a wonderful day!");
    }
    
    private static void fixedDemo() {
        System.out.println("\nDemonstrating coin creation via fixedDemo:");
        System.out.println("Making a Penny()");
        System.out.println("Result: " + new Penny());
        System.out.println("Making a Nickel()");
        System.out.println("Result: " + new Nickel());
        System.out.println("Making a Dime()");
        System.out.println("Result: " + new Dime());
        System.out.println("Making a Quarter()");
        System.out.println("Result: " + new Quarter());
        System.out.println("Making a HalfDollar()");
        System.out.println("Result: " + new HalfDollar());
        System.out.println("Making a Dollar()");
        System.out.println("Result: " + new Dollar());
    }
    
    private static void printMenu() {
        System.out.println("\nI'm ready to make you a coin!");
        System.out.println("Enter G for a Dollar coin.");
        System.out.println("Enter H for a HalfDollar coin.");
        System.out.println("Enter Q for a Quarter coin.");
        System.out.println("Enter D for a Dime coin.");
        System.out.println("Enter N for a Nickel coin.");
        System.out.println("Enter P for a Penny coin.");
        System.out.println("Enter X to exit the demo.");
        System.out.println();
    }
    
    private static void interactiveDemo() {
        System.out.println("\nWould you like to make more coins yourself? (Y/n) ");
        String response = keyboard.nextLine().trim();
        if (response.charAt(0) == 'Y' || response.charAt(0) == 'y') {
            runDemo();
        }
    }
    
    private static void runDemo() {
        Coin c;
        while (true) {
            System.out.println();
            printMenu();
            System.out.print("What coin to make? ");
            String response = keyboard.nextLine().trim();
            if(response.isEmpty()){
                System.out.println("No input entered, try again.");
                continue;
            }
            switch (response.charAt(0)) {  // use single charAt(0)
                case 'G':
                    System.out.println("Gonna make a Dollar coin...");
                    c = new Dollar();
                    break;
                case 'H':
                    System.out.println("Gonna make a HalfDollar coin...");
                    c = new HalfDollar();
                    break;
                case 'Q':
                    System.out.println("Gonna make a Quarter coin...");
                    c = new Quarter();
                    break;
                case 'D':
                    System.out.println("Gonna make a Dime coin...");
                    c = new Dime();
                    break;
                case 'N':
                    System.out.println("Gonna make a Nickel coin...");
                    c = new Nickel();
                    break;
                case 'P':
                    System.out.println("Gonna make a Penny coin...");
                    c = new Penny();
                    break;
                case 'X':
                    return;
                default:
                    System.out.println("Invalid entry, try again.");
                    continue;
            }
            System.out.println("Result: " + c);
        }
    }
}
