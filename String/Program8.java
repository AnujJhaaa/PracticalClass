import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("enter a string : ");
        String s = scanner.nextLine();

        s = s.replaceAll("java", "core java");
        System.out.println("fomatted string : " + s);
    }
}
