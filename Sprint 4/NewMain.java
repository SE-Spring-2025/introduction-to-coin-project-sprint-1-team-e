import java.util.Scanner;

public class NewMain {
        public static void main(String[] args) throws InterruptedException {
	    Scanner keyboard = new Scanner(System.in);

	    NewCelsiusConverter cCnvrtr = new NewCelsiusConverter();

	    Thread tmpCnvrtr = new Thread(cCnvrtr);
	    tmpCnvrtr.start();

	    Thread.sleep(1500); // let tmpCnvrtr thread get going...
	    
	    System.out.print("Enter Celsius temp: ");
	    int cTemp = keyboard.nextInt();
	    cCnvrtr.setCelsius(cTemp);
	    //	    System.out.println("Click dashboard button to convert");
	    cCnvrtr.doClick();
	    
	    System.out.print("Enter another Celsius temp: ");
	    cTemp = keyboard.nextInt();
	    cCnvrtr.setCelsius(cTemp);
	    //	    System.out.println("Click dashboard button to convert");
	    cCnvrtr.doClick();

	    System.out.print("Enter another Celsius temp: ");
	    cTemp = keyboard.nextInt();
	    cCnvrtr.setCelsius(cTemp);
	    //	    System.out.println("Click dashboard button to convert");
	    cCnvrtr.doClick();

	}
}
