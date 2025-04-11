import java.util.Scanner;
import java.util.Calendar;

/**
 * Demo class that demonstrates the coin creation and dashboard functionality.
 */
public class Demo {
    private static Scanner keyboard = new Scanner(System.in);
    
    /**
     * Main method that runs the demo.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome to the CoinFlips Demo!");
        
        // Initialize dashboards for observing coin counts
        initializeDashboards();
        
        // Allow time for dashboards to initialize
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted while waiting for dashboards to initialize.");
        }
        
        fixedDemo();
        metallurgyDemo();
        interactiveDemo();
        
        System.out.println();
        printSeparator();
        System.out.println("Thanks for watching the CoinFlips Demo.");
        System.out.println("Have a wonderful day!");
    }
    
    /**
     * Initialize dashboard observers to monitor coin counts.
     */
    private static void initializeDashboards() {
        System.out.println();
        printSeparator();
        System.out.println("Initializing Dashboards...");
        
        // Get the CoinCounts object from Coin class
        CoinCounts coinCounter = Coin.getCoinCounts();
        
        // Create dashboards and register them as observers
        TotalCoinsDashboard totalDashboard = new TotalCoinsDashboard();
        QuarterCounterDashboard quarterDashboard = new QuarterCounterDashboard();
        
        // Position dashboards side by side instead of vertically stacked
        totalDashboard.setLocation(100, 100);
        quarterDashboard.setLocation(520, 100); // Position to the right of the total dashboard
        
        // Register dashboards as observers
        coinCounter.addObserver(totalDashboard);
        coinCounter.addObserver(quarterDashboard);
        
        printSeparator();
        System.out.println("Dashboards are now observing coin production!");
        printSeparator();
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
        
        // Get the CoinCounts object for tracking
        CoinCounts coinCounter = Coin.getCoinCounts();
        
        // Penny
        System.out.println("> Creating: Penny()");
        Penny penny = new Penny();
        coinCounter.addCoin(penny);
        System.out.println("  [Result] " + penny);
        printSeparator();
        
        // Nickel
        System.out.println("> Creating: Nickel()");
        Nickel nickel = new Nickel();
        coinCounter.addCoin(nickel);
        System.out.println("  [Result] " + nickel);
        printSeparator();
        
        // Dime
        System.out.println("> Creating: Dime()");
        Dime dime = new Dime();
        coinCounter.addCoin(dime);
        System.out.println("  [Result] " + dime);
        printSeparator();
        
        // Quarter
        System.out.println("> Creating: Quarter()");
        Quarter quarter = new Quarter();
        coinCounter.addCoin(quarter);
        System.out.println("  [Result] " + quarter);
        printSeparator();
        
        // HalfDollar
        System.out.println("> Creating: HalfDollar()");
        HalfDollar halfDollar = new HalfDollar();
        coinCounter.addCoin(halfDollar);
        System.out.println("  [Result] " + halfDollar);
        printSeparator();
        
        // Dollar
        System.out.println("> Creating: Dollar()");
        Dollar dollar = new Dollar();
        coinCounter.addCoin(dollar);
        System.out.println("  [Result] " + dollar);
        printSeparator();
    }
    
    private static void metallurgyDemo() {
        System.out.println();
        printSeparator();
        System.out.println("Metallurgy Strategy Demo:");
        printSeparator();
        
        // Get the CoinCounts object for tracking
        CoinCounts coinCounter = Coin.getCoinCounts();
        
        // Create a penny with standard copper metallurgy
        Penny standardPenny = new Penny(2023);
        coinCounter.addCoin(standardPenny);
        System.out.println("> Standard Penny: " + standardPenny);
        
        // Create a penny with cupro-nickel metallurgy
        Penny specialPenny = new Penny(2023, new CuproNickel());
        coinCounter.addCoin(specialPenny);
        System.out.println("> Special Penny with Cupro-Nickel: " + specialPenny);
        
        // Change a nickel's metallurgy to copper
        Nickel standardNickel = new Nickel(2023);
        coinCounter.addCoin(standardNickel);
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
                keyboard.close();
                System.out.println("Exiting the demo.");
                System.exit(0);
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
        
        // Get the CoinCounts object for tracking
        CoinCounts coinCounter = Coin.getCoinCounts();
        
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
        
        // Add the created coin to the counter to notify observers
        coinCounter.addCoin(c);
        
        printSeparator();
        System.out.println("  [Result] " + c);
        System.out.println("  [Total Coins] " + coinCounter.getTotalCoins());
        System.out.println("  [Quarter Count] " + coinCounter.getQuarterCount());
        printSeparator();
    }
}
