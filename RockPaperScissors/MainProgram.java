import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RockPaperScissors game = new RockPaperScissors();
        
        System.out.println("=== Rock-Paper-Scissors ===");
        
        int choice = 0;
        while(choice != 3) {
            System.out.println("1. Play Game");
            System.out.println("2. View Score");
            System.out.println("3. Exit");
            
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();
            System.out.println();
            
            switch(choice) {
                case 1 :
                    game.input();
                    game.playGame();
                    
                    break;
                case 2 : 
                    
                    game.viewScore();
                    System.out.println();
                    break;
                case 3 :
                    break;
                default : 
                    System.out.println("Invalid Game option.");
            }
        }

        System.out.println("=== Thank-You for playing ===");
        
    }
}