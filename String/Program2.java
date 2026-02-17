import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("entsr a string : ");
        String s = scanner.nextLine();
        int count=0;
        System.out.print("Vowels : ");
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'){
                count++;
                System.out.print(ch + " ");
            }
        }
        System.out.println("\nCount : " + count);
    }
}