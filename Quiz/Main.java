import java.util.Scanner; 

public class Main {
    public static void main(String args[]){
        System.out.println("Welcome to the Quiz.\nEnter desired action.");
        System.out.println("1.Play\n2.See scoreboard\n3.Exit ");
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                Play play = new Play();
                play.play();
                break;

                /*case 2:
                Score score = new Score();
                break;*/

                case 3:
                System.exit(0);
                break;

                default:
                System.out.println("Invalid option.");
                }
        }
    }
}