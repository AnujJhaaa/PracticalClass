import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] frequency = new int[26];

        System.out.print("enter a string : ");
        String s = scanner.nextLine();
        s = s.replaceAll("[^a-zA-Z0-9]","");

        for(char ch : s.toLowerCase().toCharArray()){
            //ascii of charater minus the 'a' gives which letter it is.
            // e.g. [c-a] = 99 - 97 = 2nd index or 3rd character;
            frequency[ch - 'a']++;
        }

        for(int i=0; i<26;i++){
            if(frequency[i]==1){
                System.out.print((char)(i +'a')+ " ");
            }   
        }
    }
}
