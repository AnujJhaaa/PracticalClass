import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a string : ");
        String s = scanner.nextLine();
        s = s + " ";

        int countWord = 0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)== ' ') {
                countWord++;
            }
        }

        System.out.println(countWord);
    }
}
