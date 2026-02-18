import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a word: ");
        String s1 = scanner.next();
        System.out.print("enter a word: ");
        String s2 = scanner.next();

        if(s1.length() != s2.length()) {
            System.out.println("Not Anagram");
        }

        else {
            int frequency1[] = new int[26];
            for(char ch : s1.toLowerCase().toCharArray()){
                frequency1[ch - 'a']++;
            }

            int frequency2[] = new int[26];
            for(char ch : s2.toLowerCase().toCharArray()){
                frequency2[ch - 'a']++;
            }

            boolean flag = true;
            for(int i =0; i<26;i++){
                if(frequency1[i]!=frequency2[i]){
                    flag =false;
                }
            }

            if(flag){
                System.out.println("Anagram");
            }
            else {
                System.out.println("Not Anagram");
            }
        }
    }
}
