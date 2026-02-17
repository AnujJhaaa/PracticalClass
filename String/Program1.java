import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a string : ");
        String s = scanner.nextLine();
        char[] characters = s.toLowerCase().toCharArray();
        int countE = 0;
        for(char ch : characters){
            if( ch == 'e'){
                countE++;
            }
        }
        System.out.println("e/E count : " + countE);
        scanner.close();

    }
}
