import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors{
    char[] machine = {'R','P','S'};
    char userChoice, machineChoice;
    int result = 0;
    int tie, playerWin, machineWin;

     public void playGame(){
        Random random = new Random();
        machineChoice = machine[random.nextInt(machine.length)];

        if(userChoice == machineChoice) result = 0;
        else if(userChoice == 'R' && machineChoice== 'S') result = 1;
        else if(userChoice == 'S' && machineChoice== 'P') result = 1;
        else if(userChoice == 'P' && machineChoice== 'R') result = 1;
        else result = -1;

        if(result == 0) {
            tie++;
            System.out.println(machineChoice+ " vs." + userChoice);
            System.out.println("Tie.\n");
        }
        else if(result == 1) {
            System.out.println(machineChoice+ " vs." + userChoice);
            System.out.println("Player Wins.\n");
            playerWin++;
        }
        if(result == -1) {
            System.out.println(machineChoice+ " vs." + userChoice);
            System.out.println("Computer Wins.\n");
            machineWin++;
        }
    }
    
    public void input() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your hand['R','P','S'] : ");
        userChoice = scanner.nextLine().toUpperCase().charAt(0);

        if(userChoice != 'R' && userChoice != 'P' && userChoice != 'S') {
            System.out.println("Invalid Hand.");
            input();
        }
    }

    public void viewScore(){
        System.out.println("Tie = "+tie);
        System.out.println("Player Wins = "+playerWin);
        System.out.println("Computer Wins = "+machineWin);
    }
}