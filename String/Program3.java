import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a string : ");
        String s = scanner.nextLine();
        String reverse= "";
        for(int i = s.length()-1; i>=0;i--){
            reverse += s.charAt(i);
        }
        System.out.println("reverse : " + reverse);
        
    }
}
