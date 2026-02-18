import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a string : ");
        String s = scanner.nextLine();
        s = s.toLowerCase().replaceAll("[^a-z]", "");
        
        int[] frequency = new int[26];

        for(char ch : s.toCharArray()){
            //ascii of charater minus the 'a' gives which letter it is.
            // e.g. [c-a] = 99 - 97 = 2nd index or 3rd character;
            frequency[ch-'a']++; 
        }
        for(int i=0; i<26;i++){
            if(frequency[i]>0){
                System.out.println((char)(i +'a')+ " : " + frequency[i]);
            }   
        }
    }
}
