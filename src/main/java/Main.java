import java.util.Scanner;

public class Main {


    Scanner scanner = new Scanner(System.in);
    Counter counter = new Counter();


    public static void main(String[] args) {

        Main main = new Main ();
        main.menu();

    }

    void menu(){
        String userInput = "";

        do{

            System.out.println("\n Counter Program. Please choose an action: ");
            System.out.println("1. Count Up");
            System.out.println("2. Count Down");
            System.out.println("\n Enter Quit to exit program.");
            System.out.println("Choose a number:");

            userInput = scanner.nextLine();

            switch (userInput){
                case "Quit", "QUIT", "quit":
                    System.out.println("Exit Program");
                    break;
                case "1":
                    countUp();
                    break;
                case "2":
                    countDown();
                    break;
                default:
                    break;
            }
        } while(!userInput.equalsIgnoreCase("Quit"));
        return;
    }

    void countUp(){
        System.out.println("Count up: ");
        System.out.println("Please enter Start number");
        int start = scanner.nextInt();
        System.out.println("Please enter Stop number");
        int stop = scanner.nextInt();

        counter.countUp(start, stop);
    }

    void countDown(){
        System.out.println("Count down: ");
        System.out.println("Please enter Start number");
        int start = scanner.nextInt();
        System.out.println("Please enter Stop number");
        int stop = scanner.nextInt();

        counter.countDown(start, stop);

    }
}
