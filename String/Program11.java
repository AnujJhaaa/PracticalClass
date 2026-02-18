import java.util.Scanner;

public class Program11 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a string : ");
        String s = scanner.nextLine();

        s = s.replaceAll("[a-z]", "");
        System.out.println("fomatted string : " + s);
    }
}
